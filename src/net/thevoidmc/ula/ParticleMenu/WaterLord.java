package net.thevoidmc.ula.ParticleMenu;

import de.slikey.effectlib.util.ParticleEffect;
import net.thevoidmc.ula.Main;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by Ula on 10/1/16.
 */

public class WaterLord implements Listener {

    private final Main plugin;


    public WaterLord(Main plugin){
        this.plugin = plugin;
    }


    public static ArrayList<UUID> WaterLord1 = new ArrayList();


    public static void WaterLord(Player p)
    {
        if (WaterLord1.contains(p.getPlayer().getUniqueId())) {
            new BukkitRunnable()
            {
                double t = 0.0D;

                public void run()
                {
                    if (!WaterLord.WaterLord1.contains(p.getPlayer().getUniqueId())) {
                        cancel();
                    }
                    this.t += 0.39269908169872414D;
                    Location loc = p.getLocation();
                    for (double phi = 0.0D; phi <= 6.283185307179586D; phi += 1.5707963267948966D)
                    {
                        double x = 0.3D * (12.566370614359172D - this.t) * Math.cos(this.t + phi);
                        double y = 0.2D * this.t;
                        double z = 0.3D * (12.566370614359172D - this.t) * Math.sin(this.t + phi);
                        loc.add(x, y, z);
                        ParticleEffect.DRIP_WATER.display(0.0F, 0.0F, 0.0F, 0.0F, 50, loc, 30.0D);
                        loc.subtract(x, y, z);
                        if (this.t >= 12.566370614359172D)
                        {
                            loc.add(x, y, z);
                            ParticleEffect.DRIP_WATER.display(0.0F, 0.0F, 0.0F, 1.0F, 50, loc, 30.0D);
                            this.t = -4.0D;
                        }
                    }
                }
            }.runTaskTimer(Main.getInstance(), 0L, 1L);
        }
    }

    @EventHandler
    public static void Quit(PlayerQuitEvent e)
    {
        Player p = e.getPlayer();
        WaterLord1.remove(p.getPlayer().getUniqueId());

    }

}
