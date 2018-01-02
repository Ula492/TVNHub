package net.thevoidmc.ula.GadgetMenu;

import net.thevoidmc.ula.Main;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


/**
 * Created by Ula on 9/11/16.
 */
public class Snowball implements Listener{

    String Prefix = "§8Hub>";

    private final Main plugin;

    public Snowball(Main plugin) {
        this.plugin = plugin;
    }


    @EventHandler
    public void onProjectileLaunch(ProjectileLaunchEvent event) {
        if (event.getEntity().getShooter() instanceof Player) {
            Player player = (Player) event.getEntity().getShooter();
            ItemStack BB = new ItemStack(Material.SNOW_BALL);
            ItemMeta BBMeta = BB.getItemMeta();
            BBMeta.setDisplayName("§fPaintBall");
            BB.setItemMeta(BBMeta);
            player.getInventory().addItem(BB);

        }
    }

    @EventHandler
    public void onProjectileHit(ProjectileHitEvent e) {
        Projectile p = e.getEntity();
        if (!(p instanceof Snowball)) return;
        Snowball s = (Snowball) p;
    }

    @EventHandler
    public void onPlayerDamage(EntityDamageByEntityEvent e){
        if(e.getEntity() instanceof Player){
            if(e.getDamager() instanceof Snowball) {
                e.setDamage(0.00);
                e.getEntity().setVelocity(e.getEntity().getLocation().getDirection().multiply(3));

            }
        }
    }

}
