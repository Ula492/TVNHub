package net.thevoidmc.ula.GadgetMenu;


import net.thevoidmc.ula.Main;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.List;


/**
 * Created by Ula on 9/11/16.
 */
public class BatBlaster implements Listener {

    String Prefix = "§8Hub>";

    private final Main plugin;

    public BatBlaster(Main plugin) {
        this.plugin = plugin;
    }


    @EventHandler
    public void BatBlaster(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (event.getItem() == null || event.getItem().getType() == Material.AIR || !event.getItem().hasItemMeta()) {
            return;
        }
        if(event.getItem().getType() == Material.IRON_BARDING) {
            boolean works = false;
            if (works) {
                player.playSound(player.getLocation(), Sound.ITEM_BREAK, 10, 10);
                Bat bat = (Bat) player.getWorld().spawnEntity(player.getEyeLocation(), EntityType.BAT);
                Bat bat2 = (Bat) player.getWorld().spawnEntity(player.getEyeLocation(), EntityType.BAT);
                Bat bat3 = (Bat) player.getWorld().spawnEntity(player.getEyeLocation(), EntityType.BAT);
                Bat bat4 = (Bat) player.getWorld().spawnEntity(player.getEyeLocation(), EntityType.BAT);
                Bat bat5 = (Bat) player.getWorld().spawnEntity(player.getEyeLocation(), EntityType.BAT);
                Creature batc1 = (Creature) bat;
                Creature batc2 = (Creature) bat2;
                Creature batc3 = (Creature) bat3;
                Creature batc4 = (Creature) bat4;
                Creature batc5 = (Creature) bat5;
                double radius = 5D;
                List<Entity> near = player.getNearbyEntities(5.0d, 5.0d, 5.0d);
                for (Entity e : near) {
                    batc1.setTarget((LivingEntity) e);
                    batc2.setTarget((LivingEntity) e);
                    batc3.setTarget((LivingEntity) e);
                    batc4.setTarget((LivingEntity) e);
                    batc5.setTarget((LivingEntity) e);
                }
                    event.setCancelled(true);
                    player.sendMessage(Prefix + " Work in progress");
            }
        }

    }







}
