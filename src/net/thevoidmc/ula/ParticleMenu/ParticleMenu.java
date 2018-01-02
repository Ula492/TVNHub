package net.thevoidmc.ula.ParticleMenu;

import net.thevoidmc.ula.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import static net.thevoidmc.ula.ParticleMenu.FireHelix.FireHelix1;

/**
 * Created by Ula on 9/30/16.
 */
public class ParticleMenu implements Listener {

    private final Main plugin;

    public ParticleMenu(Main plugin)
    {
        this.plugin = plugin;
    }

    String Prefix = "§8Hub> ";


    public static void ParticleFire(Player p ){
        Inventory inv = Bukkit.getServer().createInventory(null, 54, "§fParticles");

        ItemStack WP = new ItemStack(Material.WATER_BUCKET);
        ItemMeta WPMeta = WP.getItemMeta();
        WPMeta.setDisplayName("§fWater Particles");
        WP.setItemMeta(WPMeta);

        ItemStack WH = new ItemStack(351, 1, (short) 4);
        ItemMeta WHM = WH.getItemMeta();
        WHM.setDisplayName("§fWater Helix");
        WH.setItemMeta(WHM);

        ItemStack WL = new ItemStack(Material.POTION);
        ItemMeta WLM = WL.getItemMeta();
        WLM.setDisplayName("§fWater Lord");
        WL.setItemMeta(WLM);



        ItemStack AP = new ItemStack(Material.FEATHER);
        ItemMeta APMeta = AP.getItemMeta();
        APMeta.setDisplayName("§fAir Particles");
        AP.setItemMeta(APMeta);

        ItemStack AH = new ItemStack(Material.SNOW_BALL);
        ItemMeta AHMeta = AH.getItemMeta();
        AHMeta.setDisplayName("§fAir Helix");
        AH.setItemMeta(AHMeta);

        ItemStack AL = new ItemStack(Material.FIREWORK_CHARGE);
        ItemMeta ALMeta = AL.getItemMeta();
        ALMeta.setDisplayName("§fAir Lord");
        AL.setItemMeta(ALMeta);



        ItemStack FP = new ItemStack(Material.BLAZE_ROD);
        ItemMeta FPMeta = FP.getItemMeta();
        FPMeta.setDisplayName("§fFire Particles");
        FP.setItemMeta(FPMeta);

        ItemStack FH = new ItemStack(Material.BLAZE_POWDER);
        ItemMeta FHMeta = FH.getItemMeta();
        FHMeta.setDisplayName("§fFire Helix");
        FH.setItemMeta(FHMeta);

        ItemStack FL = new ItemStack(Material.FIREBALL);
        ItemMeta FLMeta = FL.getItemMeta();
        FLMeta.setDisplayName("§fFire Lord");
        FL.setItemMeta(FLMeta);


        inv.setItem(11,WP);
        inv.setItem(20, WH);
        inv.setItem(29, WL);

        inv.setItem(13,FP);
        inv.setItem(22,FH);
        inv.setItem(31, FL);

        inv.setItem(15, AP);
        inv.setItem(24, AH);
        inv.setItem(33, AL);

        p.openInventory(inv);

    }

    public static void ParticleAir(Player p ){
        Inventory inv = Bukkit.getServer().createInventory(null, 54, "§fParticles");

        ItemStack WP = new ItemStack(Material.WATER_BUCKET);
        ItemMeta WPMeta = WP.getItemMeta();
        WPMeta.setDisplayName("§fWater Particles");
        WP.setItemMeta(WPMeta);

        ItemStack WH = new ItemStack(351, 1, (short) 4);
        ItemMeta WHM = WH.getItemMeta();
        WHM.setDisplayName("§fWater Helix");
        WH.setItemMeta(WHM);

        ItemStack WL = new ItemStack(Material.POTION);
        ItemMeta WLM = WL.getItemMeta();
        WLM.setDisplayName("§fWater Lord");
        WL.setItemMeta(WLM);



        ItemStack AP = new ItemStack(Material.FEATHER);
        ItemMeta APMeta = AP.getItemMeta();
        APMeta.setDisplayName("§fAir Particles");
        AP.setItemMeta(APMeta);

        ItemStack AH = new ItemStack(Material.SNOW_BALL);
        ItemMeta AHMeta = AH.getItemMeta();
        AHMeta.setDisplayName("§fAir Helix");
        AH.setItemMeta(AHMeta);

        ItemStack AL = new ItemStack(Material.FIREWORK_CHARGE);
        ItemMeta ALMeta = AL.getItemMeta();
        ALMeta.setDisplayName("§fAir Lord");
        AL.setItemMeta(ALMeta);



        ItemStack FP = new ItemStack(351, 1, (short) 8);
        ItemMeta FPMeta = FP.getItemMeta();
        FPMeta.setDisplayName("§4LOCKED");
        FP.setItemMeta(FPMeta);

        ItemStack FH = new ItemStack(351, 1, (short) 8);
        ItemMeta FHMeta = FH.getItemMeta();
        FHMeta.setDisplayName("§4LOCKED");
        FH.setItemMeta(FHMeta);

        ItemStack FL = new ItemStack(351, 1, (short) 8);
        ItemMeta FLMeta = FL.getItemMeta();
        FLMeta.setDisplayName("§4LOCKED");
        FL.setItemMeta(FLMeta);

        inv.setItem(11,WP);
        inv.setItem(20, WH);
        inv.setItem(29, WL);

        inv.setItem(13,FP);
        inv.setItem(22,FH);
        inv.setItem(31, FL);

        inv.setItem(15, AP);
        inv.setItem(24, AH);
        inv.setItem(33, AL);

        p.openInventory(inv);

    }

    public static void ParticleWater(Player p ){
        Inventory inv = Bukkit.getServer().createInventory(null, 54, "§fParticles");

        ItemStack WP = new ItemStack(Material.WATER_BUCKET);
        ItemMeta WPMeta = WP.getItemMeta();
        WPMeta.setDisplayName("§fWater Particles");
        WP.setItemMeta(WPMeta);

        ItemStack WH = new ItemStack(351, 1, (short) 4);
        ItemMeta WHM = WH.getItemMeta();
        WHM.setDisplayName("§fWater Helix");
        WH.setItemMeta(WHM);

        ItemStack WL = new ItemStack(Material.POTION);
        ItemMeta WLM = WL.getItemMeta();
        WLM.setDisplayName("§fWater Lord");
        WL.setItemMeta(WLM);



        ItemStack AP = new ItemStack(Material.FEATHER);
        ItemMeta APMeta = AP.getItemMeta();
        APMeta.setDisplayName("§fAir Particles");
        AP.setItemMeta(APMeta);

        ItemStack AH = new ItemStack(351, 1, (short) 8);
        ItemMeta AHMeta = AH.getItemMeta();
        AHMeta.setDisplayName("§4LOCKED");
        AH.setItemMeta(AHMeta);

        ItemStack AL = new ItemStack(351, 1, (short) 8);
        ItemMeta ALMeta = AL.getItemMeta();
        ALMeta.setDisplayName("§4LOCKED");
        AL.setItemMeta(ALMeta);



        ItemStack FP = new ItemStack(Material.BLAZE_ROD);
        ItemMeta FPMeta = FP.getItemMeta();
        FPMeta.setDisplayName("§fFire Particles");
        FP.setItemMeta(FPMeta);

        ItemStack FH = new ItemStack(351, 1, (short)8);
        ItemMeta FHMeta = FH.getItemMeta();
        FHMeta.setDisplayName("§4LOCKED");
        FH.setItemMeta(FHMeta);

        ItemStack FL = new ItemStack(351, 1, (short) 8);
        ItemMeta FLMeta = FL.getItemMeta();
        FLMeta.setDisplayName("§4LOCKED");
        FL.setItemMeta(FLMeta);

        inv.setItem(11,WP);
        inv.setItem(20, WH);
        inv.setItem(29, WL);

        inv.setItem(13,FP);
        inv.setItem(22,FH);
        inv.setItem(31, FL);

        inv.setItem(15, AP);
        inv.setItem(24, AH);
        inv.setItem(33, AL);

        p.openInventory(inv);

    }

    public static void ParticleDefault(Player p ){
        Inventory inv = Bukkit.getServer().createInventory(null, 54, "§fParticles");

        ItemStack WP = new ItemStack(Material.WATER_BUCKET);
        ItemMeta WPMeta = WP.getItemMeta();
        WPMeta.setDisplayName("§fWater Particles");
        WP.setItemMeta(WPMeta);

        ItemStack WH = new ItemStack(351, 1, (short) 8);
        ItemMeta WHM = WH.getItemMeta();
        WHM.setDisplayName("§4LOCKED");
        WH.setItemMeta(WHM);

        ItemStack WL = new ItemStack(351, 1, (short) 8);
        ItemMeta WLM = WL.getItemMeta();
        WLM.setDisplayName("§4LOCKED");
        WL.setItemMeta(WLM);



        ItemStack AP = new ItemStack(Material.FEATHER);
        ItemMeta APMeta = AP.getItemMeta();
        APMeta.setDisplayName("§fAir Particles");
        AP.setItemMeta(APMeta);

        ItemStack AH = new ItemStack(351, 1, (short) 8);
        ItemMeta AHMeta = AH.getItemMeta();
        AHMeta.setDisplayName("§4LOCKED");
        AH.setItemMeta(AHMeta);

        ItemStack AL = new ItemStack(351, 1, (short) 8);
        ItemMeta ALMeta = AL.getItemMeta();
        ALMeta.setDisplayName("§4LOCKED");
        AL.setItemMeta(ALMeta);



        ItemStack FP = new ItemStack(Material.BLAZE_ROD);
        ItemMeta FPMeta = FP.getItemMeta();
        FPMeta.setDisplayName("§fFire Particles");
        FP.setItemMeta(FPMeta);

        ItemStack FH = new ItemStack(351, 1, (short) 8);
        ItemMeta FHMeta = FH.getItemMeta();
        FHMeta.setDisplayName("§4LOCKED");
        FH.setItemMeta(FHMeta);

        ItemStack FL = new ItemStack(351, 1, (short) 8);
        ItemMeta FLMeta = FL.getItemMeta();
        FLMeta.setDisplayName("§4LOCKED");
        FL.setItemMeta(FLMeta);

        inv.setItem(11,WP);
        inv.setItem(20, WH);
        inv.setItem(29, WL);

        inv.setItem(13,FP);
        inv.setItem(22,FH);
        inv.setItem(31, FL);

        inv.setItem(15, AP);
        inv.setItem(24, AH);
        inv.setItem(33, AL);

        p.openInventory(inv);

    }

    @EventHandler
    public void ItemClick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();

        if (e.getInventory().getName() != "§fParticles") {
            return;
        }
        if (e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR || !e.getCurrentItem().hasItemMeta()) {
            return;
        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§fWater Particles")) {
            e.setCancelled(true);
        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§fWater Helix")) {
            e.setCancelled(true);
            p.closeInventory();
            p.sendMessage(Prefix + "Activated §aWater Helix");
            WaterHelix.WaterHelix.add(e.getWhoClicked().getUniqueId());
            if(WaterHelix.WaterHelix.contains(p.getUniqueId())){
                WaterHelix.WaterHelix(p);
            }
            FireLord.FireLord1.remove(p.getPlayer().getUniqueId());
            WaterLord.WaterLord1.remove(p.getPlayer().getUniqueId());
            FireHelix.FireHelix1.remove(p.getPlayer().getUniqueId());
            AirHelix.AirHelix1.remove(p.getPlayer().getUniqueId());
            AirLord.AirLord1.remove(p.getPlayer().getUniqueId());

        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§fWater Lord")) {
            e.setCancelled(true);
            p.closeInventory();
            p.sendMessage(Prefix + "Activated §aWater Lord");
            WaterLord.WaterLord1.add(e.getWhoClicked().getUniqueId());
            if(WaterLord.WaterLord1.contains(p.getUniqueId())){
                WaterLord.WaterLord(p);
            }

            FireLord.FireLord1.remove(p.getPlayer().getUniqueId());
            WaterHelix.WaterHelix.remove(p.getPlayer().getUniqueId());
            FireHelix.FireHelix1.remove(p.getPlayer().getUniqueId());
            AirHelix.AirHelix1.remove(p.getPlayer().getUniqueId());
            AirLord.AirLord1.remove(p.getPlayer().getUniqueId());

        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§fFire Particles")) {
            e.setCancelled(true);

        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§fFire Helix")) {
            e.setCancelled(true);

            p.closeInventory();
            p.sendMessage(Prefix + "Activated §aFire Helix");
            FireHelix1.add(e.getWhoClicked().getUniqueId());
            if(FireHelix1.contains(p.getUniqueId())){
                FireHelix.FireHelix(p);
            }

            WaterHelix.WaterHelix.remove(p.getPlayer().getUniqueId());
            WaterLord.WaterLord1.remove(p.getPlayer().getUniqueId());
            FireLord.FireLord1.remove(p.getPlayer().getUniqueId());
            AirHelix.AirHelix1.remove(p.getPlayer().getUniqueId());
            AirLord.AirLord1.remove(p.getPlayer().getUniqueId());


        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§fFire Lord")) {
            e.setCancelled(true);
            p.closeInventory();
            p.sendMessage(Prefix + "Activated §aFire Helix");
            FireLord.FireLord1.add(e.getWhoClicked().getUniqueId());
            if(FireLord.FireLord1.contains(p.getUniqueId())){
                FireLord.FireLord(p);
            }

            WaterHelix.WaterHelix.remove(p.getPlayer().getUniqueId());
            WaterLord.WaterLord1.remove(p.getPlayer().getUniqueId());
            FireHelix.FireHelix1.remove(p.getPlayer().getUniqueId());
            AirHelix.AirHelix1.remove(p.getPlayer().getUniqueId());
            AirLord.AirLord1.remove(p.getPlayer().getUniqueId());
        }



        if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§fAir Particles")) {
            e.setCancelled(true);

        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§fAir Helix")) {
            e.setCancelled(true);
            p.closeInventory();
            p.sendMessage(Prefix + "Activated §aFire Helix");
            AirHelix.AirHelix1.add(e.getWhoClicked().getUniqueId());
            if(AirHelix.AirHelix1.contains(p.getUniqueId())){
                AirHelix.AirHelix(p);
            }
            WaterHelix.WaterHelix.remove(p.getPlayer().getUniqueId());
            WaterLord.WaterLord1.remove(p.getPlayer().getUniqueId());
            FireHelix.FireHelix1.remove(p.getPlayer().getUniqueId());
            FireLord.FireLord1.remove(p.getPlayer().getUniqueId());
            AirLord.AirLord1.remove(p.getPlayer().getUniqueId());
        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§fAir Lord")) {
            e.setCancelled(true);
            p.closeInventory();
            p.sendMessage(Prefix + "Activated §aFire Helix");
            AirLord.AirLord1.add(e.getWhoClicked().getUniqueId());
            if(AirLord.AirLord1.contains(p.getUniqueId())){
                AirLord.AirLord(p);
            }
            WaterHelix.WaterHelix.remove(p.getPlayer().getUniqueId());
            WaterLord.WaterLord1.remove(p.getPlayer().getUniqueId());
            FireHelix.FireHelix1.remove(p.getPlayer().getUniqueId());
            FireLord.FireLord1.remove(p.getPlayer().getUniqueId());
            AirHelix.AirHelix1.remove(p.getPlayer().getUniqueId());
        }

        if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§4LOCKED")) {
            e.setCancelled(true);
            p.closeInventory();
            p.playSound(p.getLocation(), Sound.ENDERDRAGON_DEATH, 0.5F ,0.5F);
            p.sendMessage("\n" +
                    " §a§l§m=============================================§r\n" +
                    "             §k§l;;;§r §r§4ERROR§r §k§l;;;§r\n" +
                    " \n" +
                    "    §fInsufficient Permissions\n" +
                    "    §fRank required:\n" +
                    "    §3§lWATER §8- §f§lWIND §8- §4§lFIRE\n" +
                    "   §fwww.thevoidmc.net\n" +
                    " \n" +
                    " \n" +
                    " §a§l§m=============================================§r\n");
        }


    }



}
