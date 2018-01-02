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
public class WaterHelix implements Listener{
    private final Main plugin;


    public WaterHelix(Main plugin){
        this.plugin = plugin;
    }

    public static ArrayList<UUID> WaterHelix = new ArrayList();


    public static void WaterHelix(Player p)
    {
        if (WaterHelix.contains(p.getPlayer().getUniqueId())) {
            new BukkitRunnable()
            {
                public void run()
                {
                    if (!WaterHelix.contains(p.getPlayer().getUniqueId())) {
                        cancel();
                    }
                    double phi = 0.0D;

                    phi += 0.39269908169872414D;

                    Location loc = p.getLocation();
                    for (double t = 0.0D; t <= 6.283185307179586D; t += 0.19634954084936207D) {
                        for (double i = 0.0D; i <= 1.0D; i += 1.0D)
                        {
                            double x = 0.3D * (6.283185307179586D - t) * 0.5D * Math.cos(t + phi + i * 3.141592653589793D);
                            double y = 0.5D * t;
                            double z = 0.3D * (6.283185307179586D - t) * 0.5D * Math.sin(t + phi + i * 3.141592653589793D);
                            loc.add(x, y, z);
                            ParticleEffect.DRIP_WATER.display(0.0F, 0.0F, 0.0F, 0.0F, 3, loc, 30.0D);
                            loc.subtract(x, y, z);
                        }
                    }
                }
            }.runTaskTimer(Main.getInstance(), 0L, 10L);
        }
    }


    @EventHandler
    public static void Quit(PlayerQuitEvent e)
    {
        Player p = e.getPlayer();
        WaterHelix.remove(p.getPlayer().getUniqueId());

    }

}
