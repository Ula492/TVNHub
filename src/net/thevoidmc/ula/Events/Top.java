package net.thevoidmc.ula.Events;

import net.thevoidmc.ula.Main;
import net.thevoidmc.ula.Utils.BarUtils;
import net.thevoidmc.ula.Utils.ColorScrollPlus;
import net.thevoidmc.ula.Utils.PacketUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Ula on 11/19/16.
 */
public class Top implements Listener {


    private final Main plugin;

    public Top(Main plugin) {
        this.plugin = plugin;
    }

    String Prefix = "§8Hub> ";


    @EventHandler
    public void TabFoot(PlayerJoinEvent e){
        final Player p = e.getPlayer();

        final String serverName = Bukkit.getServerName();
        PacketUtils.sendTabHF(p,
                "\n" + "§m------------------§r§5§l Void Network §r§m----------------" + "\n"
                ,
                "\n" + "Server: " + Bukkit.getServerName() + "\n" +
                        "Coins: " + "\n");//Add Coins Later



    }


    List<String> list = new ArrayList();
    Random r = new Random();

    @EventHandler
    public void BossBar(PlayerJoinEvent e){
        final Player p = e.getPlayer();

        final ColorScrollPlus cs1 = new ColorScrollPlus(ChatColor.YELLOW, "      ⇾      ", "§f", "§6", "§f", true, false, ColorScrollPlus.ScrollType.FORWARD);


        this.list.add(cs1.next());

        String message = (String)this.list.get(this.r.nextInt(this.list.size()));

        new BukkitRunnable()
        {
            public void run()
            {
                if (cs1.getScrollType() == ColorScrollPlus.ScrollType.FORWARD)
                {
                    if (cs1.getPosition() >= cs1.getString().length()) {
                        cs1.setScrollType(ColorScrollPlus.ScrollType.BACKWARD);
                    }
                }
                else if (cs1.getPosition() <= -2) {
                    cs1.setScrollType(ColorScrollPlus.ScrollType.FORWARD);
                }

                BarUtils.setBar(p, "Launch special " + cs1.next() + "80% OFF  Store Wide", 100.0F);
            }
        }.runTaskTimer(this.plugin, 0L, 2L);
    }


    @EventHandler
    public void Top(PlayerQuitEvent e){
        Player p = e.getPlayer();
        BarUtils.removeBar(p);
    }



}
