package net.thevoidmc.ula.GadgetMenu;

import net.thevoidmc.ula.Main;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

import java.util.List;


/**
 * Created by Ula on 9/17/16.
 */
public class TNTLauncher implements Listener {

    String Prefix = "§8Hub>";

    private final Main plugin;

    public TNTLauncher(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void TNTLaunchers(PlayerInteractEvent event){
        Player player = event.getPlayer();
        if (event.getItem() == null || event.getItem().getType() == Material.AIR || !event.getItem().hasItemMeta()) {
            return;
        }
    if(event.getItem().getType() == Material.TNT) {
        final TNTPrimed tnt = event.getPlayer().getWorld().spawn(event.getPlayer().getLocation(), TNTPrimed.class);
        player.playSound(player.getLocation(), Sound.FUSE, 10, 10);
        new BukkitRunnable() {

            @Override
            public void run() {
                Location location = tnt.getLocation();
                player.playSound(player.getLocation(), Sound.EXPLODE, 10, 10);
                double radius = 5D;
                List<Entity> near = player.getNearbyEntities(10.0d, 10.0d, 10.0d);
                for (Entity e : near) {
                    e.setVelocity(new Vector(0, 2, 0));
                }
                tnt.remove();
            }

        }.runTaskLater(Main.getInstance(), 60);
    }
    }

}
