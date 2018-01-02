package net.thevoidmc.ula.Events;

import net.thevoidmc.ula.CostmeticsMenu.CosmeticsMenu;
import net.thevoidmc.ula.Main;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

/**
 * Created by Ula on 9/11/16.
 */
public class HotBar implements Listener {

    private final Main plugin;

    public HotBar(Main plugin) {
        this.plugin = plugin;
    }


    @EventHandler
    public void HotBar(PlayerJoinEvent e){
        Player p = e.getPlayer();
        p.getInventory().clear();
        p.setHealth(20.0);
        p.setFoodLevel(20);

        ItemStack Costmetics = new ItemStack(Material.CHEST);
        ItemMeta CostmeticsMeta = Costmetics.getItemMeta();
        CostmeticsMeta.setDisplayName("§aCostmetics");
        Costmetics.setItemMeta(CostmeticsMeta);

        e.getPlayer().getInventory().setItem(4, Costmetics);

    }



    @EventHandler
    public void RightClickItem(PlayerInteractEvent event) {
        Action a = event.getAction();
        ItemStack is = event.getItem();
        Player p = event.getPlayer();
        if (event.getItem() == null || event.getItem().getType() == Material.AIR || !event.getItem().hasItemMeta()) {
            return;
        }

        if (event.getItem().getItemMeta().getDisplayName().contains("§aCostmetics")) {
            event.setCancelled(true);
            CosmeticsMenu.CostmeticMenu(p);
        }
    }


}
