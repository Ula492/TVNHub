package net.thevoidmc.ula.GadgetMenu;


import net.thevoidmc.ula.Main;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitScheduler;


/**
 * Created by Ula on 9/22/16.
 */
public class Flash implements Listener {

    String Prefix = "§8Hub>";

    private final Main plugin;

    public Flash(Main plugin) {
        this.plugin = plugin;

    }


    @EventHandler
    public void clickP(PlayerInteractEvent event) {
        final Player p = event.getPlayer();

        if (event.getItem() == null || event.getItem().getType() == Material.AIR || !event.getItem().hasItemMeta()) {
            return;
        }

        if (event.getItem().getType() == Material.REDSTONE) {
            p.playSound(p.getLocation(), Sound.NOTE_PLING, 1.0F, 8.0F);

            new BukkitRunnable(){ //BukkitRunnable, not Runnable
                int countdown = 5; //Instance variable in our anonymous class to easily hold the countdown value
                @Override
                public void run(){
                    if(countdown <= 0 || !p.isOnline()){ //countdown is over or player left the server, just two example reasons to exit
                        p.setWalkSpeed(0.2F);
                        p.sendMessage(Prefix + " §fYou are back to a human");
                        this.cancel(); //cancel the repeating task
                        return; //exit the method
                    }
                    p.playSound(p.getLocation(), Sound.NOTE_PLING, 1.0F, 8.0F);
                    p.getWorld().strikeLightningEffect(p.getLocation());
                    p.setWalkSpeed(1F);
                    p.sendMessage(Prefix + " §fYou have §4" + countdown + " §rtill your a human!");
                    countdown--; //decrement

                }
            }.runTaskTimer(plugin, 0, 20); //Repeating task with 0 ticks initial delay, run once per 20 ticks (one second). Make sure you pass a valid instance of your plugin.
        }
    }
}
