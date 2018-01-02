package net.thevoidmc.ula.GadgetMenu;

import net.thevoidmc.ula.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Warning;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.awt.*;

/**
 * Created by Ula on 9/5/16.
 */
public class GadgetMenu implements Listener {

    private final Main plugin;

    public GadgetMenu(Main plugin) {
        this.plugin = plugin;
    }
    String Prefix = "§8Hub> ";


    public static void GadgetMenu(Player p) {
        Inventory inv = Bukkit.createInventory(null, 54, "§fGadgets");

        ItemStack PInfo = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
        SkullMeta AchievementsMeta = (SkullMeta) PInfo.getItemMeta();
        AchievementsMeta.setDisplayName("§f" + p.getName());
        AchievementsMeta.setOwner(p.getName());
        PInfo.setItemMeta(AchievementsMeta);

        ItemStack BatBlaster = new ItemStack(Material.IRON_BARDING);
        ItemMeta BatBlasterMeta = BatBlaster.getItemMeta();
        BatBlasterMeta.setDisplayName("§fBatBlaster");
        BatBlaster.setItemMeta(BatBlasterMeta);

        ItemStack PaintBall = new ItemStack(Material.SNOW_BALL);
        ItemMeta PaintBallMeta = PaintBall.getItemMeta();
        PaintBallMeta.setDisplayName("§fPaintBall");
        PaintBall.setItemMeta(PaintBallMeta);

        ItemStack Freeze = new ItemStack(Material.PACKED_ICE);
        ItemMeta FreezeMeta = Freeze.getItemMeta();
        FreezeMeta.setDisplayName("§fFreezeerrr");
        Freeze.setItemMeta(FreezeMeta);

        ItemStack Firework1 = new ItemStack(Material.FIREWORK);
        ItemMeta FireworkMeta = Firework1.getItemMeta();
        FireworkMeta.setDisplayName("§fFirework");
        Firework1.setItemMeta(FireworkMeta);

        ItemStack TNTLauncher = new ItemStack(Material.TNT);
        ItemMeta TNTLauncherMeta = TNTLauncher.getItemMeta();
        TNTLauncherMeta.setDisplayName("§fTNT Launcher");
        TNTLauncher.setItemMeta(TNTLauncherMeta);

        ItemStack Flash = new ItemStack(Material.REDSTONE);
        ItemMeta FlashMeta = Flash.getItemMeta();
        FlashMeta.setDisplayName("§fFlashh");
        Flash.setItemMeta(FlashMeta);

        ItemStack Jokes = new ItemStack(Material.COAL);
        ItemMeta JokesMeta = Jokes.getItemMeta();
        JokesMeta.setDisplayName("§fRandom Jokes");
        Jokes.setItemMeta(JokesMeta);

        inv.setItem(4, PInfo);
        inv.setItem(20, BatBlaster);
        inv.setItem(21, PaintBall);
        inv.setItem(22, Freeze);
        inv.setItem(23, Firework1);
        inv.setItem(24, TNTLauncher);
        inv.setItem(29, Flash);
        inv.setItem(30, Jokes);

        p.openInventory(inv);
    }

    @EventHandler
    public void ItemClick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();

        if (e.getInventory().getName() != "§fGadgets") {
            return;
        }
        if (e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR || !e.getCurrentItem().hasItemMeta()) {
            return;
        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§f" + p.getName())) {
            e.setCancelled(true);

        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§fBatBlaster")) {
            e.setCancelled(true);
            ItemStack BB = new ItemStack(Material.IRON_BARDING);
            ItemMeta BBMeta = BB.getItemMeta();
            BBMeta.setDisplayName("§fBatBlaster");
            BB.setItemMeta(BBMeta);
            p.getInventory().setItem(5, BB);
            p.closeInventory();
            p.sendMessage(Prefix + "§fYou have activated §aBat Blaster");

        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§fPaintBall")) {
            e.setCancelled(true);
            ItemStack BB = new ItemStack(Material.SNOW_BALL);
            ItemMeta BBMeta = BB.getItemMeta();
            BBMeta.setDisplayName("§fPaintBall");
            BB.setItemMeta(BBMeta);
            p.getInventory().setItem(5, BB);
            p.closeInventory();
            p.sendMessage(Prefix + "§fYou have activated §aSnowBall");
        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§fFreezeerrr")) {
            e.setCancelled(true);
            ItemStack BB = new ItemStack(Material.PACKED_ICE);
            ItemMeta BBMeta = BB.getItemMeta();
            BBMeta.setDisplayName("§fFreezeerrr");
            BB.setItemMeta(BBMeta);
            p.getInventory().setItem(5, BB);
            p.closeInventory();
            p.sendMessage(Prefix + "§fYou have activated §aFreezeerrr");
        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§fFirework")) {
            e.setCancelled(true);
            ItemStack BB = new ItemStack(Material.FIREWORK);
            ItemMeta BBMeta = BB.getItemMeta();
            BBMeta.setDisplayName("§fFirework");
            BB.setItemMeta(BBMeta);
            p.getInventory().setItem(5, BB);
            p.closeInventory();
            p.sendMessage(Prefix + "§fYou have activated §aFireworks");

        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§fTNT Launcher")) {
            e.setCancelled(true);
            ItemStack BB = new ItemStack(Material.TNT);
            ItemMeta BBMeta = BB.getItemMeta();
            BBMeta.setDisplayName("§fTNT Launcher");
            BB.setItemMeta(BBMeta);
            p.getInventory().setItem(5, BB);
            p.closeInventory();
            p.sendMessage(Prefix + "§fYou have activated §aTNT Launcher");

        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§fFlashh")) {
            e.setCancelled(true);
            ItemStack Flash = new ItemStack(Material.REDSTONE);
            ItemMeta FlashMeta = Flash.getItemMeta();
            FlashMeta.setDisplayName("§fFlashh");
            Flash.setItemMeta(FlashMeta);
            p.getInventory().setItem(5, Flash);
            p.closeInventory();
            p.sendMessage(Prefix + "§fYou have activated §aFlash!!!!!");

        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§fRandom Jokes")) {
            e.setCancelled(true);
            ItemStack Jokes = new ItemStack(Material.COAL);
            ItemMeta JokesMeta = Jokes.getItemMeta();
            JokesMeta.setDisplayName("§fRandom Jokes");
            Jokes.setItemMeta(JokesMeta);
            p.getInventory().setItem(5, Jokes);
            p.closeInventory();
            p.sendMessage(Prefix + "§fYou have activated §aJokes");
        }
    }
}