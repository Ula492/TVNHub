package net.thevoidmc.ula.Morphs;

import net.thevoidmc.ula.Main;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.HashMap;
import java.util.Random;

/**
 * Created by Ula on 10/20/16.
 */
public class Villager implements Listener {


    private final Main plugin;
    public Villager(Main plugin) {
        this.plugin = plugin;
    }

    HashMap<Player, Item> villagereffect = new HashMap<>();
    HashMap<Player, Integer> cd = new HashMap<>();


    @EventHandler
    public void Sneak(PlayerToggleSneakEvent e){
        Player p = e.getPlayer();
        if(p.getPlayer().isSneaking()){
            if(Morphs.VillagerMorph.contains(p.getPlayer().getUniqueId())){
                p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1F,1F);
                for(int i = 0 ; i< 40; i++){
                    ItemStack osso = new ItemStack(Material.EMERALD, 1);
                    Location dropLoc = p.getLocation();
                    Random r = new Random();
                    dropLoc.setX(dropLoc.getX() + r.nextDouble() - r.nextDouble());
                    dropLoc.setY(dropLoc.getY() + r.nextDouble() * r.nextDouble());
                    dropLoc.setZ(dropLoc.getZ() + r.nextDouble() - r.nextDouble());
                    final Item emerald = p.getWorld().dropItem(dropLoc, osso);
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            emerald.remove();
                        }
                    }.runTaskLater(plugin, 20);
                }
                cd.put(p, 20);
                new BukkitRunnable() {

                    @Override
                    public void run() {
                        if(cd.get(p) == 0){
                            cancel();
                            cd.remove(p);
                        }
                    }
                }.runTaskTimer(plugin, 30, 30);
            }
        }
    }



    @EventHandler
    public void bonepick(PlayerPickupItemEvent e) {
        Player p = e.getPlayer();
        Item item = e.getItem();
        if (villagereffect.get(p) == item) {
            return;
        }
        p.setVelocity(e.getItem().getVelocity());
        e.getItem().remove();
        e.setCancelled(true);
    }




}
