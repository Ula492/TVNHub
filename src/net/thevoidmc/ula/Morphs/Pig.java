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
 * Created by Ula on 10/10/16.
 */
public class Pig implements Listener {


    private final Main plugin;
    public Pig(Main plugin) {
        this.plugin = plugin;
    }

    HashMap<Player, Item> pigbone = new HashMap<>();
    HashMap<Player, Integer> cd = new HashMap<>();


    @EventHandler
    public void Sneak(PlayerToggleSneakEvent e){
        Player p = e.getPlayer();
        if(p.getPlayer().isSneaking()){
            if(Morphs.PigMorph.contains(p.getPlayer().getUniqueId())){
                p.playSound(p.getLocation(), Sound.PIG_IDLE, 1F,1F);

                for(int i = 0 ; i< 20; i++){
                    ItemStack osso = new ItemStack(320);
                    Location dropLoc = p.getLocation();
                    Random r = new Random();
                    dropLoc.setX(dropLoc.getX() + r.nextDouble() - r.nextDouble());
                    dropLoc.setY(dropLoc.getY() + r.nextDouble() * r.nextDouble());
                    dropLoc.setZ(dropLoc.getZ() + r.nextDouble() - r.nextDouble());
                    final Item pork = p.getWorld().dropItem(dropLoc, osso);
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            if(pork.isDead()){
                                cancel();
                                return;
                            }
                            for(Entity en : pork.getNearbyEntities(0.1, 0.1, 0.1)){
                                if(en != p){
                                    en.setVelocity(pork.getVelocity().multiply(0).normalize());
                                    if(en instanceof Player){
                                        ((Player) en).getPlayer().getLocation().setY(0);
                                    }
                                }
                            }
                        }
                    }.runTaskTimer(plugin, 0, (long) 0.01);

                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            pork.remove();
                        }
                    }.runTaskLater(plugin, 10);
                }
                cd.put(p, 10);
                new BukkitRunnable() {

                    @Override
                    public void run() {
                        if(cd.get(p) == 0){
                            cancel();
                            cd.remove(p);
                        }
                    }
                }.runTaskTimer(plugin, 20, 20);
            }
        }
    }



    @EventHandler
    public void pigpick(PlayerPickupItemEvent e) {
        Player p = e.getPlayer();
        Item item = e.getItem();
        if (pigbone.get(p) == item) {
            return;
        }
        p.setVelocity(e.getItem().getVelocity());
        e.getItem().remove();
        e.setCancelled(true);
    }



}
