package net.thevoidmc.ula.Morphs;

import com.sgtflow.morphapi.MorphPlugin;
import com.sgtflow.morphapi.api.MorphAPI;
import com.sgtflow.morphapi.api.morph.MorphType;
import net.thevoidmc.ula.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by Ula on 10/9/16.
 */
public class Morphs implements Listener {

    private final Main plugin;

    public Morphs(Main plugin) {
        this.plugin = plugin;
    }

    String Prefix = "§8Hub> ";


    public static void MorphMenu(Player p){
        Inventory inv = Bukkit.createInventory(null, 54, "§fMorphs");


        ItemStack Creeper = new ItemStack(383, 1, (short) 50);
        ItemMeta CreeperMeta = Creeper.getItemMeta();
        CreeperMeta.setDisplayName("§fCreeper");
        Creeper.setItemMeta(CreeperMeta);

        ItemStack Skeleton = new ItemStack(383,1,(short)51);
        ItemMeta SkeletonMeta = Skeleton.getItemMeta();
        SkeletonMeta.setDisplayName("§fSkeleton");
        Skeleton.setItemMeta(SkeletonMeta);

        ItemStack Sheep = new ItemStack(383,1,(short) 65);
        ItemMeta SheepMeta = Sheep.getItemMeta();
        SheepMeta.setDisplayName("§fSheep");
        Sheep.setItemMeta(SheepMeta);

        ItemStack Pig = new ItemStack(383,1, (short) 90);
        ItemMeta PigMeta = Pig.getItemMeta();
        PigMeta.setDisplayName("§fPig");
        Pig.setItemMeta(PigMeta);

        ItemStack Cow = new ItemStack(383,1,(short) 92);
        ItemMeta CowMeta = Cow.getItemMeta();
        CowMeta.setDisplayName("§fCow");
        Cow.setItemMeta(CowMeta);

        ItemStack Chicken = new ItemStack(383, 1, (short) 93);
        ItemMeta ChickenMeta = Chicken.getItemMeta();
        ChickenMeta.setDisplayName("§fChicken");
        Chicken.setItemMeta(ChickenMeta);

        ItemStack Squid = new ItemStack(383, 1, (short) 94);
        ItemMeta SquidMeta = Squid.getItemMeta();
        SquidMeta.setDisplayName("§fSquid");
        Squid.setItemMeta(SquidMeta);

        ItemStack Villager = new ItemStack(383,1, (short) 120);
        ItemMeta VillagerMeta = Villager.getItemMeta();
        VillagerMeta.setDisplayName("§fVillager");
        Villager.setItemMeta(VillagerMeta);


        inv.setItem(20, Creeper);
        inv.setItem(21, Skeleton);
        inv.setItem(22, Sheep);
        inv.setItem(23, Pig);
        inv.setItem(24, Cow);
        inv.setItem(29, Chicken);
        inv.setItem(30, Squid);
        inv.setItem(31, Villager);

        p.openInventory(inv);
    }



    public static ArrayList<UUID> CreeperMorph = new ArrayList();
    public static ArrayList<UUID> SkeletonMorph = new ArrayList();
    public static ArrayList<UUID> SheepMorph = new ArrayList<>();
    public static ArrayList<UUID> PigMorph = new ArrayList<>();
    public static ArrayList<UUID> CowMorph = new ArrayList<>();
    public static ArrayList<UUID> ChickenMorph = new ArrayList<>();
    public static ArrayList<UUID> SquidMorph = new ArrayList<>();
    public static ArrayList<UUID> VillagerMorph = new ArrayList<>();

    MorphAPI morphAPI = MorphPlugin.getInstance().getMorphAPI();


    @EventHandler
    public void ItemClick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();

        if (e.getInventory().getName() != "§fMorphs") {
            return;
        }
        if (e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR || !e.getCurrentItem().hasItemMeta()) {
            return;
        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§f" + p.getName())) {
            e.setCancelled(true);
        }
        if(e.getCurrentItem().getItemMeta().getDisplayName().contains("§fCreeper")){
            e.setCancelled(true);
            p.closeInventory();
            morphAPI.removeMorph(p.getPlayer());
            CreeperMorph.add(p.getPlayer().getUniqueId());
            if(CreeperMorph.contains(p.getPlayer().getUniqueId())){
                morphAPI.setMorph(MorphType.CREEPER, p.getPlayer());
            }

            p.sendMessage(Prefix + "§fYou have morphed into a §aCreeper");

            SkeletonMorph.remove(p.getPlayer().getUniqueId());
            SheepMorph.remove(p.getPlayer().getUniqueId());
            SheepMorph.remove(p.getPlayer().getUniqueId());
            PigMorph.remove(p.getPlayer().getUniqueId());
            CowMorph.remove(p.getPlayer().getUniqueId());
            ChickenMorph.remove(p.getPlayer().getUniqueId());
            SquidMorph.remove(p.getPlayer().getUniqueId());
            VillagerMorph.remove(p.getPlayer().getUniqueId());

        }
        if(e.getCurrentItem().getItemMeta().getDisplayName().contains("§fSkeleton")){
            e.setCancelled(true);
            p.closeInventory();
            morphAPI.removeMorph(p.getPlayer());
            SkeletonMorph.add(p.getPlayer().getUniqueId());
            if(SkeletonMorph.contains(p.getPlayer().getUniqueId())){
                morphAPI.setMorph(MorphType.SKELETON, p.getPlayer());
            }
            p.sendMessage(Prefix + "§fYou have morphed into a §aSkeleton");

            CreeperMorph.remove(p.getPlayer().getUniqueId());
            SheepMorph.remove(p.getPlayer().getUniqueId());
            SheepMorph.remove(p.getPlayer().getUniqueId());
            PigMorph.remove(p.getPlayer().getUniqueId());
            CowMorph.remove(p.getPlayer().getUniqueId());
            ChickenMorph.remove(p.getPlayer().getUniqueId());
            SquidMorph.remove(p.getPlayer().getUniqueId());
            VillagerMorph.remove(p.getPlayer().getUniqueId());

        }
        if(e.getCurrentItem().getItemMeta().getDisplayName().contains("§fSheep")){
            e.setCancelled(true);
            p.closeInventory();
            morphAPI.removeMorph(p.getPlayer());
            SheepMorph.add(p.getPlayer().getUniqueId());
            if(SheepMorph.contains(p.getPlayer().getUniqueId())){
                morphAPI.setMorph(MorphType.SHEEP, p.getPlayer());

            }
            p.sendMessage(Prefix + "§fYou have morphed into a §aSheep");

            CreeperMorph.remove(p.getPlayer().getUniqueId());
            SkeletonMorph.remove(p.getPlayer().getUniqueId());
            PigMorph.remove(p.getPlayer().getUniqueId());
            CowMorph.remove(p.getPlayer().getUniqueId());
            ChickenMorph.remove(p.getPlayer().getUniqueId());
            SquidMorph.remove(p.getPlayer().getUniqueId());
            VillagerMorph.remove(p.getPlayer().getUniqueId());


        }
        if(e.getCurrentItem().getItemMeta().getDisplayName().contains("§fPig")){
            e.setCancelled(true);
            p.closeInventory();
            morphAPI.removeMorph(p.getPlayer());
            PigMorph.add(p.getPlayer().getUniqueId());
            if(PigMorph.contains(p.getPlayer().getUniqueId())){
                morphAPI.setMorph(MorphType.PIG, p.getPlayer());
            }
            p.sendMessage(Prefix + "§fYou have morphed into a §aPig");

            CreeperMorph.remove(p.getPlayer().getUniqueId());
            SkeletonMorph.remove(p.getPlayer().getUniqueId());
            SheepMorph.remove(p.getPlayer().getUniqueId());
            CowMorph.remove(p.getPlayer().getUniqueId());
            ChickenMorph.remove(p.getPlayer().getUniqueId());
            SquidMorph.remove(p.getPlayer().getUniqueId());
            VillagerMorph.remove(p.getPlayer().getUniqueId());

        }
        if(e.getCurrentItem().getItemMeta().getDisplayName().contains("§fCow")){
            e.setCancelled(true);
            p.closeInventory();
            morphAPI.removeMorph(p.getPlayer());
            CowMorph.add(p.getPlayer().getUniqueId());
            if(CowMorph.contains(p.getPlayer().getUniqueId())){
                morphAPI.setMorph(MorphType.COW, p.getPlayer());
            }
            p.sendMessage(Prefix + "§fYou have morphed into a §aCow");

            CreeperMorph.remove(p.getPlayer().getUniqueId());
            SkeletonMorph.remove(p.getPlayer().getUniqueId());
            SheepMorph.remove(p.getPlayer().getUniqueId());
            PigMorph.remove(p.getPlayer().getUniqueId());
            ChickenMorph.remove(p.getPlayer().getUniqueId());
            SquidMorph.remove(p.getPlayer().getUniqueId());
            VillagerMorph.remove(p.getPlayer().getUniqueId());

        }
        if(e.getCurrentItem().getItemMeta().getDisplayName().contains("§fChicken")){
            e.setCancelled(true);
            p.closeInventory();
            morphAPI.removeMorph(p.getPlayer());
            ChickenMorph.add(p.getPlayer().getUniqueId());
            if(ChickenMorph.contains(p.getPlayer().getUniqueId())){
                morphAPI.setMorph(MorphType.CHICKEN, p.getPlayer());
            }
            p.sendMessage(Prefix + "§fYou have morphed into a §aChicken");

            CreeperMorph.remove(p.getPlayer().getUniqueId());
            SkeletonMorph.remove(p.getPlayer().getUniqueId());
            SheepMorph.remove(p.getPlayer().getUniqueId());
            PigMorph.remove(p.getPlayer().getUniqueId());
            CowMorph.remove(p.getPlayer().getUniqueId());
            SquidMorph.remove(p.getPlayer().getUniqueId());
            VillagerMorph.remove(p.getPlayer().getUniqueId());

        }
        if(e.getCurrentItem().getItemMeta().getDisplayName().contains("§fSquid")){
            e.setCancelled(true);
            p.closeInventory();
            morphAPI.removeMorph(p.getPlayer());
            SquidMorph.add(p.getPlayer().getUniqueId());
            if(SquidMorph.contains(p.getPlayer().getUniqueId())){
                morphAPI.setMorph(MorphType.SQUID, p.getPlayer());
            }
            p.sendMessage(Prefix + "§fYou have morphed into a §aSquid");

            CreeperMorph.remove(p.getPlayer().getUniqueId());
            SkeletonMorph.remove(p.getPlayer().getUniqueId());
            SheepMorph.remove(p.getPlayer().getUniqueId());
            PigMorph.remove(p.getPlayer().getUniqueId());
            CowMorph.remove(p.getPlayer().getUniqueId());
            ChickenMorph.remove(p.getPlayer().getUniqueId());
            VillagerMorph.remove(p.getPlayer().getUniqueId());

        }
        if(e.getCurrentItem().getItemMeta().getDisplayName().contains("§fVillager")){
            e.setCancelled(true);
            p.closeInventory();
            morphAPI.removeMorph(p.getPlayer());
            VillagerMorph.add(p.getPlayer().getUniqueId());
            if(VillagerMorph.contains(p.getPlayer().getUniqueId())){
                morphAPI.setMorph(MorphType.VILLAGER, p.getPlayer());
            }

            p.sendMessage(Prefix + "§fYou have morphed into a §aVillager");

            CreeperMorph.remove(p.getPlayer().getUniqueId());
            SkeletonMorph.remove(p.getPlayer().getUniqueId());
            SheepMorph.remove(p.getPlayer().getUniqueId());
            PigMorph.remove(p.getPlayer().getUniqueId());
            CowMorph.remove(p.getPlayer().getUniqueId());
            ChickenMorph.remove(p.getPlayer().getUniqueId());
            SquidMorph.remove(p.getPlayer().getUniqueId());


        }
    }


    @EventHandler
    public void Quit(PlayerQuitEvent e){
        Player p = e.getPlayer();

        CreeperMorph.remove(p.getPlayer().getUniqueId());
        SkeletonMorph.remove(p.getPlayer().getUniqueId());
        SheepMorph.remove(p.getPlayer().getUniqueId());
        PigMorph.remove(p.getPlayer().getUniqueId());
        CowMorph.remove(p.getPlayer().getUniqueId());
        ChickenMorph.remove(p.getPlayer().getUniqueId());
        SquidMorph.remove(p.getPlayer().getUniqueId());
        VillagerMorph.remove(p.getPlayer().getUniqueId());
        morphAPI.removeMorph(p.getPlayer());

    }
}
