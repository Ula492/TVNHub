package net.thevoidmc.ula.Heads;

import net.thevoidmc.ula.Main;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

/**
 * Created by Ula on 11/2/16.
 */
public class Heads3 implements Listener {


    private final Main plugin;

    public Heads3(Main plugin) {
        this.plugin = plugin;
    }

    String Prefix = "§8Hub> ";

    public static void Emoji(Player p){
        Inventory inv = Bukkit.createInventory(null, 54, "Emoji's");

        ItemStack Kiss = new ItemStack(397, 1, (short) 3);
        SkullMeta KissMeta = (SkullMeta) Kiss.getItemMeta();
        KissMeta.setDisplayName("Kiss");
        KissMeta.setOwner("c7360c40-1b10-4a11-8322-697962372596");
        Kiss.setItemMeta(KissMeta);


        inv.setItem(1,Kiss);

        p.openInventory(inv);

    }


}
