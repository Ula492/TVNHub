package net.thevoidmc.ula.Events;


import net.thevoidmc.ula.Main;
import net.thevoidmc.ula.Utils.ColorScrollPlus;
import net.thevoidmc.ula.Utils.PacketUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.ArrayList;

/**
 * Created by Ula on 11/23/16.
 */
public class Middle implements Listener {


    public Middle(Main plugin) {
        this.plugin = plugin;
    }

    String Prefix = "§8Hub> ";


    private final Main plugin;
    static ArrayList<String> A = new ArrayList();
    private int ttl;

    @EventHandler
    public void Middle(PlayerJoinEvent e){
        Player p = e.getPlayer();

        Bukkit.getScheduler().cancelTask(this.ttl);
        this.ttl = Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this.plugin, new Runnable()
        {
            public void run()
            {
                Integer i = Integer.valueOf(A.size());
                if (i.intValue() == 1)
                {
                    PacketUtils.sendTitle(p, "§6§lVoid Network", "§f§lThanks for playing our Launch!", 0, 100, 10);
                    A.add("A");
                }
                if (i.intValue() == 2)
                {
                    PacketUtils.sendTitle(p, "§5§lVoid Network", "§f§lWelcome " + p.getName(), 0, 100, 10);
                    A.add("B");
                }
                if (i.intValue() == 2)
                {
                    Bukkit.getScheduler().cancelTask(ttl);
                    A.clear();
                    A.add("1");
                }
            }
        }, 0L, 30L);
    }



    @EventHandler
    public void Middle(PlayerQuitEvent e){
        Player p = e.getPlayer();

    }


}
