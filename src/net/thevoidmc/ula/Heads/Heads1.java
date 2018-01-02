package net.thevoidmc.ula.Heads;

import net.thevoidmc.ula.CostmeticsMenu.CosmeticsMenu;
import net.thevoidmc.ula.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

/**
 * Created by Ula on 10/22/16.
 */
public class Heads1 implements Listener {


    private final Main plugin;

    public Heads1(Main plugin) {
        this.plugin = plugin;
    }
    String Prefix = "§8Hub> ";

    public static void HeadsP1(Player p){
        Inventory inv = Bukkit.createInventory(null, 54, "§f Staff Heads");


        ItemStack Type = new ItemStack(Material.CLAY_BALL);
        ItemMeta TypeMeta = Type.getItemMeta();
        TypeMeta.setDisplayName("§fStaff Members");
        Type.setItemMeta(TypeMeta);

        ItemStack Ula = new ItemStack(397, 1, (short)3);
        SkullMeta UlaMeta = (SkullMeta)Ula.getItemMeta();
        UlaMeta.setDisplayName("§fUla492 (OWNER)");
        UlaMeta.setOwner("Ula492");
        Ula.setItemMeta(UlaMeta);

        ItemStack Cupcourt = new ItemStack(397,1,(short)3);
        SkullMeta CupcourtMeta = (SkullMeta)Cupcourt.getItemMeta();
        CupcourtMeta.setDisplayName("§fCupcourt (OWNER)");
        CupcourtMeta.setOwner("CupCourt");
        Cupcourt.setItemMeta(CupcourtMeta);

        ItemStack Question = new ItemStack(397,1,(short)3);
        SkullMeta QuestionMeta = (SkullMeta)Question.getItemMeta();
        QuestionMeta.setDisplayName("§f??? (STAFF)");
        QuestionMeta.setOwner("MHF_QUESTION");
        Question.setItemMeta(QuestionMeta);

        ItemStack Back = new ItemStack(Material.ARROW);
        ItemMeta BackMeta = Back.getItemMeta();
        BackMeta.setDisplayName("§fBack");
        Back.setItemMeta(BackMeta);

        ItemStack Clear = new ItemStack(351,1,(short) 1);
        ItemMeta ClearMeta = Clear.getItemMeta();
        ClearMeta.setDisplayName("§fClear");
        Clear.setItemMeta(ClearMeta);

        ItemStack Forward = new ItemStack(Material.ARROW);
        ItemMeta ForwardMeta = Forward.getItemMeta();
        ForwardMeta.setDisplayName("§fForward");
        Forward.setItemMeta(ForwardMeta);

        ItemStack Page = new ItemStack(Material.BOOK);
        ItemMeta PageMeta = Page.getItemMeta();
        PageMeta.setDisplayName("Page #1");
        Page.setItemMeta(PageMeta);

        inv.setItem(13,Type);
        inv.setItem(20, Ula);
        inv.setItem(21, Cupcourt);
        inv.setItem(22,Question);
        inv.setItem(23,Question);
        inv.setItem(24,Question);
        inv.setItem(29,Question);
        inv.setItem(30,Question);
        inv.setItem(31,Question);
        inv.setItem(32,Question);
        inv.setItem(33,Question);
        inv.setItem(48, Back);
        inv.setItem(49, Clear);
        inv.setItem(50, Forward);
        inv.setItem(53, Page);

        p.openInventory(inv);
    }


    @EventHandler
    public void ItemClick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();

        if (e.getInventory().getName() != "§f Staff Heads") {
            return;
        }
        if (e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR || !e.getCurrentItem().hasItemMeta()) {
            return;
        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§fStaff Members")){
            e.setCancelled(true);
        }
        if(e.getCurrentItem().getItemMeta().getDisplayName().contains("§fUla492 (OWNER)")){
            ItemStack Ula = new ItemStack(397, 1, (short)3);
            SkullMeta UlaMeta = (SkullMeta)Ula.getItemMeta();
            UlaMeta.setDisplayName("§fUla492 (OWNER)");
            UlaMeta.setOwner("Ula492");
            Ula.setItemMeta(UlaMeta);

            e.setCancelled(true);
            p.getInventory().setHelmet(Ula);
            p.closeInventory();
            p.sendMessage(Prefix + "§fYou have equipped §aUla492's §r§fHead");
        }
        if(e.getCurrentItem().getItemMeta().getDisplayName().contains("§fCupCourt (OWNER)")){
            ItemStack Cupcourt = new ItemStack(397,1,(short)3);
            SkullMeta CupcourtMeta = (SkullMeta)Cupcourt.getItemMeta();
            CupcourtMeta.setDisplayName("§fCupcourt (OWNER)");
            CupcourtMeta.setOwner("CupCourt");
            Cupcourt.setItemMeta(CupcourtMeta);

            e.setCancelled(true);
            p.getInventory().setHelmet(Cupcourt);
            p.closeInventory();
            p.sendMessage(Prefix + "§fYou have equipped §aCupcourt's §r§fHead");
        }
        if(e.getCurrentItem().getItemMeta().getDisplayName().contains("§f??? (STAFF)")){
            e.setCancelled(true);
            p.closeInventory();
            p.sendMessage(Prefix + "§fHead to come soon!");
        }
        if(e.getCurrentItem().getItemMeta().getDisplayName().contains("§fBack")){
            CosmeticsMenu.CostmeticMenu(p);
        }
        if(e.getCurrentItem().getItemMeta().getDisplayName().contains("§fClear")){
            e.setCancelled(true);
            p.closeInventory();
            p.sendMessage(Prefix + "§fYou have cleared your head");
            p.getInventory().setHelmet(new ItemStack(Material.AIR));
        }
        if(e.getCurrentItem().getItemMeta().getDisplayName().contains("§fForward")){
            Heads2.Heads2(p);
            e.setCancelled(true);
        }
        if(e.getCurrentItem().getItemMeta().getDisplayName().contains("§fPage #1")){
            e.setCancelled(true);
        }
    }


}
