package net.thevoidmc.ula.GadgetMenu;

import net.thevoidmc.ula.Main;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.util.Vector;

import java.util.List;


/**
 * Created by Ula on 9/11/16.
 */
public class Freezer implements Listener{

    String Prefix = "§8Hub>";

    private final Main plugin;

    public Freezer(Main plugin) {
        this.plugin = plugin;

    }



    @EventHandler
    public void clickP(PlayerInteractEvent event){
        Player p = event.getPlayer();
        if (event.getItem() == null || event.getItem().getType() == Material.AIR || !event.getItem().hasItemMeta()) {
            return;
        }
        if(event.getItem().getType() == Material.PACKED_ICE) {
            p.playSound(p.getLocation(), Sound.GLASS, 10, 10);
            p.sendMessage(Prefix + " Nearby entities have been hit by the ice!!");
            double radius = 5D;
            List<Entity> near = p.getNearbyEntities(10.0d, 10.0d, 10.0d);
            for(Entity e : near) {
                if(e.getType() == EntityType.PLAYER) {
                    Player entity = (Player) e;
                    p.playSound(p.getLocation(), Sound.LAVA_POP, 10, 10);
                    entity.sendMessage(Prefix + " You have been Hit by the ice!");
                }
                e.setVelocity(new Vector(0, 3, 0));
            }
            event.setCancelled(true);
        }

    }





}
