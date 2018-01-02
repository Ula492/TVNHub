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
 * Created by Ula on 11/1/16.
 */
public class Heads2 implements Listener {

    private final Main plugin;

    public Heads2(Main plugin) {
        this.plugin = plugin;
    }

    String Prefix = "§8Hub> ";


    public static void Heads2(Player p){
        Inventory inv = Bukkit.createInventory(null, 54, "§fYT Heads");

        ItemStack CSP = new ItemStack(397, 1, (short)3);
        SkullMeta CSPMeta = (SkullMeta)CSP.getItemMeta();
        CSPMeta.setDisplayName("§fCaptainSparklez");
        CSPMeta.setOwner("CaptainSparklez");
        CSP.setItemMeta(CSPMeta);

        ItemStack SkyTheKid = new ItemStack(397, 1, (short)3);
        SkullMeta SkyTheKidMeta = (SkullMeta)SkyTheKid.getItemMeta();
        SkyTheKidMeta.setDisplayName("§fSkyTheKidRS");
        SkyTheKidMeta.setOwner("SkyTheKidRS");
        SkyTheKid.setItemMeta(SkyTheKidMeta);

        ItemStack Syn = new ItemStack(397, 1, (short)3);
        SkullMeta SynMeta = (SkullMeta)Syn.getItemMeta();
        SynMeta.setDisplayName("§fSynHD");
        SynMeta.setOwner("SynHD");
        Syn.setItemMeta(SynMeta);

        ItemStack YOG = new ItemStack(397,1,(short)3);
        SkullMeta YOGMeta = (SkullMeta)YOG.getItemMeta();
        YOGMeta.setDisplayName("§fYOGSCAST");
        YOGMeta.setOwner("YOGSCAST");
        YOG.setItemMeta(YOGMeta);

        ItemStack DAN = new ItemStack(397,1,(short)3);
        SkullMeta DANMeta = (SkullMeta)DAN.getItemMeta();
        DANMeta.setDisplayName("§fDanTDM");
        DANMeta.setOwner("DanTDM");
        DAN.setItemMeta(DANMeta);

        ItemStack Stampy = new ItemStack(397,1,(short)3);
        SkullMeta StampyMeta = (SkullMeta)Stampy.getItemMeta();
        StampyMeta.setDisplayName("§fStampyLongHead");
        StampyMeta.setOwner("StampyLongHead");
        Stampy.setItemMeta(StampyMeta);

        ItemStack Bajan = new ItemStack(397,1,(short)3);
        SkullMeta BajanMeta = (SkullMeta)Bajan.getItemMeta();
        BajanMeta.setDisplayName("§fTheBajanCanadian");
        BajanMeta.setOwner("TheBajanCanadian");
        Bajan.setItemMeta(BajanMeta);

        ItemStack MMoS = new ItemStack(397,1,(short)3);
        SkullMeta MMoSMeta = (SkullMeta)MMoS.getItemMeta();
        MMoSMeta.setDisplayName("§fPopularMMOS");
        MMoSMeta.setOwner("PopularMMOS");
        MMoS.setItemMeta(MMoSMeta);

        ItemStack SSUNDE = new ItemStack(397,1,(short)3);
        SkullMeta SSUNDEMEta = (SkullMeta)SSUNDE.getItemMeta();
        SSUNDEMEta.setDisplayName("§fSSundee");
        SSUNDEMEta.setOwner("SSundee");
        SSUNDE.setItemMeta(SSUNDEMEta);

        ItemStack Jerm = new ItemStack(397,1,(short)3);
        SkullMeta JermMeta = (SkullMeta) Jerm.getItemMeta();
        JermMeta.setDisplayName("§fJeromeASF");
        JermMeta.setOwner("JeromeASF");
        Jerm.setItemMeta(JermMeta);

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

        ItemStack Type = new ItemStack(Material.CLAY_BALL);
        ItemMeta TypeMeta = Type.getItemMeta();
        TypeMeta.setDisplayName("§fYouTubers");
        Type.setItemMeta(TypeMeta);

        ItemStack Page = new ItemStack(Material.BOOK);
        ItemMeta PageMeta = Page.getItemMeta();
        PageMeta.setDisplayName("Page #2");
        Page.setItemMeta(PageMeta);

        inv.setItem(13,Type);
        inv.setItem(20, CSP);
        inv.setItem(21, SkyTheKid);
        inv.setItem(22,Syn);
        inv.setItem(23,YOG);
        inv.setItem(24,DAN);
        inv.setItem(29,Stampy);
        inv.setItem(30,Bajan);
        inv.setItem(31,MMoS);
        inv.setItem(32,SSUNDE);
        inv.setItem(33,Jerm);
        inv.setItem(48, Back);
        inv.setItem(49, Clear);
        inv.setItem(50, Forward);
        inv.setItem(53, Page);

        p.openInventory(inv);
    }



    @EventHandler
    public void ItemClick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();

        if (e.getInventory().getName() != "§fYT Heads") {
            return;
        }
        if (e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR || !e.getCurrentItem().hasItemMeta()) {
            return;
        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§fStaff Members")) {
            e.setCancelled(true);
        }
        if(e.getCurrentItem().getItemMeta().getDisplayName().contains("§fCaptainSparklez")){
            e.setCancelled(true);
            ItemStack CSP = new ItemStack(397, 1, (short)3);
            SkullMeta CSPMeta = (SkullMeta)CSP.getItemMeta();
            CSPMeta.setDisplayName("§fCaptainSparklez");
            CSPMeta.setOwner("CaptainSparklez");
            CSP.setItemMeta(CSPMeta);


            p.getInventory().setHelmet(CSP);
            p.closeInventory();
            p.sendMessage(Prefix + "§fYou have equipped §aCaptainSparklez's §r§fHead");
        }
        if(e.getCurrentItem().getItemMeta().getDisplayName().contains("§fSkyTheKidRS")){
            e.setCancelled(true);
            ItemStack SkyTheKid = new ItemStack(397, 1, (short)3);
            SkullMeta SkyTheKidMeta = (SkullMeta)SkyTheKid.getItemMeta();
            SkyTheKidMeta.setDisplayName("§fSkyTheKidRS");
            SkyTheKidMeta.setOwner("SkyTheKidRS");
            SkyTheKid.setItemMeta(SkyTheKidMeta);

            p.getInventory().setHelmet(SkyTheKid);
            p.closeInventory();
            p.sendMessage(Prefix + "§fYou have equipped §aSkytheKidRS's §r§fHead");

        }
        if(e.getCurrentItem().getItemMeta().getDisplayName().contains("§fSynHD")){
            e.setCancelled(true);
            ItemStack Syn = new ItemStack(397, 1, (short)3);
            SkullMeta SynMeta = (SkullMeta)Syn.getItemMeta();
            SynMeta.setDisplayName("§fSynHD");
            SynMeta.setOwner("SynHD");
            Syn.setItemMeta(SynMeta);

            p.getInventory().setHelmet(Syn);
            p.closeInventory();
            p.sendMessage(Prefix + "§fYou have equipped §aSynHD's §r§fHead");
        }
        if(e.getCurrentItem().getItemMeta().getDisplayName().contains("§fYOGSCAST")){
            e.setCancelled(true);
            ItemStack YOG = new ItemStack(397,1,(short)3);
            SkullMeta YOGMeta = (SkullMeta)YOG.getItemMeta();
            YOGMeta.setDisplayName("§fYOGSCAST");
            YOGMeta.setOwner("YOGSCAST");
            YOG.setItemMeta(YOGMeta);

            p.getInventory().setHelmet(YOG);
            p.closeInventory();
            p.sendMessage(Prefix + "§fYou have equipped §aYOGSCAST's §r§fHead");
        }
        if(e.getCurrentItem().getItemMeta().getDisplayName().contains("§fDanTDM")){
            e.setCancelled(true);
            ItemStack DAN = new ItemStack(397,1,(short)3);
            SkullMeta DANMeta = (SkullMeta)DAN.getItemMeta();
            DANMeta.setDisplayName("§fDanTDM");
            DANMeta.setOwner("DanTDM");
            DAN.setItemMeta(DANMeta);

            p.getInventory().setHelmet(DAN);
            p.closeInventory();
            p.sendMessage(Prefix + "§fYou have equipped §aDanTDM's §r§fHead");
        }
        if(e.getCurrentItem().getItemMeta().getDisplayName().contains("§fStampyLongHead")){
            e.setCancelled(true);
            ItemStack Stampy = new ItemStack(397,1,(short)3);
            SkullMeta StampyMeta = (SkullMeta)Stampy.getItemMeta();
            StampyMeta.setDisplayName("§fStampyLongHead");
            StampyMeta.setOwner("StampyLongHead");
            Stampy.setItemMeta(StampyMeta);

            p.getInventory().setHelmet(Stampy);
            p.closeInventory();
            p.sendMessage(Prefix + "§fYou have equipped §aStampyLongHead's §r§fHead");
        }
        if(e.getCurrentItem().getItemMeta().getDisplayName().contains("§fTheBajanCanadian")){
            e.setCancelled(true);
            ItemStack Bajan = new ItemStack(397,1,(short)3);
            SkullMeta BajanMeta = (SkullMeta)Bajan.getItemMeta();
            BajanMeta.setDisplayName("§fTheBajanCanadian");
            BajanMeta.setOwner("TheBajanCanadian");
            Bajan.setItemMeta(BajanMeta);

            p.getInventory().setHelmet(Bajan);
            p.closeInventory();
            p.sendMessage(Prefix + "§fYou have equipped §aTheBajanCanadian's §r§fHead");
        }
        if(e.getCurrentItem().getItemMeta().getDisplayName().contains("§fPopularMMOS")){
            e.setCancelled(true);
            ItemStack MMoS = new ItemStack(397,1,(short)3);
            SkullMeta MMoSMeta = (SkullMeta)MMoS.getItemMeta();
            MMoSMeta.setDisplayName("§fPopularMMOS");
            MMoSMeta.setOwner("PopularMMOS");
            MMoS.setItemMeta(MMoSMeta);

            p.getInventory().setHelmet(MMoS);
            p.closeInventory();
            p.sendMessage(Prefix + "§fYou have equipped §a" + MMoS.getItemMeta().getDisplayName()+ "'s §r§fHead");

        }
        if(e.getCurrentItem().getItemMeta().getDisplayName().contains("§fSSundee")){
            e.setCancelled(true);
            ItemStack SSUNDE = new ItemStack(397,1,(short)3);
            SkullMeta SSUNDEMEta = (SkullMeta)SSUNDE.getItemMeta();
            SSUNDEMEta.setDisplayName("§fSSundee");
            SSUNDEMEta.setOwner("SSundee");
            SSUNDE.setItemMeta(SSUNDEMEta);

            p.getInventory().setHelmet(SSUNDE);
            p.closeInventory();
            p.sendMessage(Prefix + "§fYou have equipped §aSSundee's §r§fHead");
        }
        if(e.getCurrentItem().getItemMeta().getDisplayName().contains("§fJeromeASF")) {
            e.setCancelled(true);
            ItemStack Jerm = new ItemStack(397, 1, (short) 3);
            SkullMeta JermMeta = (SkullMeta) Jerm.getItemMeta();
            JermMeta.setDisplayName("§fJeromeASF");
            JermMeta.setOwner("JeromeASF");
            Jerm.setItemMeta(JermMeta);

            p.getInventory().setHelmet(Jerm);
            p.closeInventory();
            p.sendMessage(Prefix + "§fYou have equipped §aJeromeASF's §r§fHead");
        }
        if(e.getCurrentItem().getItemMeta().getDisplayName().contains("§fBack")){
            Heads1.HeadsP1(p);
        }
        if(e.getCurrentItem().getItemMeta().getDisplayName().contains("§fClear")){
            e.setCancelled(true);
            p.closeInventory();
            p.sendMessage(Prefix + "§fYou have cleared your head");
            p.getInventory().setHelmet(new ItemStack(Material.AIR));
        }
        if(e.getCurrentItem().getItemMeta().getDisplayName().contains("§fForward")){
            e.setCancelled(true);
            Heads3.Emoji(p);

        }
        if(e.getCurrentItem().getItemMeta().getDisplayName().contains("§fYouTubers")){
            e.setCancelled(true);
        }
        if(e.getCurrentItem().getItemMeta().getDisplayName().contains("Page #2")){
            e.setCancelled(true);
        }
    }





}
