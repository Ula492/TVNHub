package net.thevoidmc.ula.CostmeticsMenu;

import com.sgtflow.morphapi.MorphPlugin;
import com.sgtflow.morphapi.api.MorphAPI;
import net.thevoidmc.ula.GadgetMenu.GadgetMenu;
import net.thevoidmc.ula.Heads.Heads1;
import net.thevoidmc.ula.Main;
import net.thevoidmc.ula.Morphs.Morphs;
import net.thevoidmc.ula.ParticleMenu.*;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

/**
 * Created by Ula on 9/5/16.
 */
public class CosmeticsMenu implements Listener {

    String Prefix = "§8Hub> ";

    private final Main plugin;

    public CosmeticsMenu(Main plugin) {
        this.plugin = plugin;
    }

    MorphAPI morphAPI = MorphPlugin.getInstance().getMorphAPI();


    public static void CostmeticMenu(Player p){
        Inventory inv = Bukkit.createInventory(null, 54, "Cosmetic Menu");

        ItemStack Crystal = new ItemStack(Material.NETHER_STAR);
        ItemMeta CrystalMeta = Crystal.getItemMeta();
        CrystalMeta.setDisplayName("§b§lCrystals");
        Crystal.setItemMeta(CrystalMeta);

        ItemStack Morph = new ItemStack(Material.MONSTER_EGG);
        ItemMeta MorphMeta = Morph.getItemMeta();
        MorphMeta.setDisplayName("§fMorph");
        Morph.setItemMeta(MorphMeta);

        ItemStack Skin = new ItemStack(Material.ARMOR_STAND);
        ItemMeta SkinMeta = Skin.getItemMeta();
        SkinMeta.setDisplayName("§fSkin");
        Skin.setItemMeta(SkinMeta);

        ItemStack Head = new ItemStack(Material.SKULL_ITEM);
        ItemMeta HeadMeta = Head.getItemMeta();
        HeadMeta.setDisplayName("§fHeads");
        Head.setItemMeta(HeadMeta);

        ItemStack Gadget = new ItemStack(Material.PISTON_BASE);
        ItemMeta GadgetMeta = Gadget.getItemMeta();
        GadgetMeta.setDisplayName("§fGadgets");
        Gadget.setItemMeta(GadgetMeta);

        ItemStack Pet = new ItemStack(Material.BONE);
        ItemMeta PetMeta = Pet.getItemMeta();
        PetMeta.setDisplayName("§fPets");
        Pet.setItemMeta(PetMeta);

        ItemStack Mount = new ItemStack(Material.IRON_BARDING);
        ItemMeta MountMeta = Morph.getItemMeta();
        MountMeta.setDisplayName("§fMounts");
        Mount.setItemMeta(MountMeta);

        ItemStack Particle = new ItemStack(Material.REDSTONE);
        ItemMeta ParticleMeta = Particle.getItemMeta();
        ParticleMeta.setDisplayName("§fParticles");
        Particle.setItemMeta(ParticleMeta);

        ItemStack Clear = new ItemStack(Material.BARRIER);
        ItemMeta ClearMeta = Clear.getItemMeta();
        ClearMeta.setDisplayName("§fClear All");
        Clear.setItemMeta(ClearMeta);

        inv.setItem(4,Crystal);
        inv.setItem(20, Morph);
        inv.setItem(22, Skin);
        inv.setItem(24, Head);
        inv.setItem(31, Gadget);
        inv.setItem(38, Pet);
        inv.setItem(40, Mount);
        inv.setItem(42, Particle);
        inv.setItem(49, Clear);

        p.openInventory(inv);
    }


    @EventHandler
    public void ItemClick(InventoryClickEvent e){
        Player p = (Player)e.getWhoClicked();

        if (e.getInventory().getName() != "Cosmetic Menu") {
            return;
        }
        if (e.getCurrentItem() == null || e.getCurrentItem().getType() == Material.AIR || !e.getCurrentItem().hasItemMeta()) {
            return;
        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§b§lCrystals")) {
            e.setCancelled(true);

        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§fMorph")) {
            e.setCancelled(true);
            Morphs.MorphMenu(p);

        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§fSkin")) {
            e.setCancelled(true);

        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§fHeads")) {
            e.setCancelled(true);
            Heads1.HeadsP1(p);

        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§fGadgets")) {
            e.setCancelled(true);
            GadgetMenu.GadgetMenu(p);

        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§fPets")) {
            e.setCancelled(true);

        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§fMounts")) {
            e.setCancelled(true);

        }
        if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§fParticles")) {
            e.setCancelled(true);
            if(p.hasPermission("Rank.Particle.Fire")) {
                ParticleMenu.ParticleFire(p);
            }else if(p.hasPermission("Rank.Particle.Air")){
                ParticleMenu.ParticleAir(p);
            }else if(p.hasPermission("Rank.Particle.Water")){
                ParticleMenu.ParticleWater(p);
            }else{
                ParticleMenu.ParticleDefault(p);
            }

        }

        if (e.getCurrentItem().getItemMeta().getDisplayName().contains("§fClear All")) {
            e.setCancelled(true);
            p.closeInventory();
            p.sendMessage(Prefix + "§aAll Cosmetics have been cleared");

            p.getInventory().setItem(5, new ItemStack(Material.AIR));
            WaterHelix.WaterHelix.remove(p.getPlayer().getUniqueId());
            WaterLord.WaterLord1.remove(p.getPlayer().getUniqueId());
            FireHelix.FireHelix1.remove(p.getPlayer().getUniqueId());
            FireLord.FireLord1.remove(p.getPlayer().getUniqueId());
            AirHelix.AirHelix1.remove(p.getPlayer().getUniqueId());
            AirLord.AirLord1.remove(p.getPlayer().getUniqueId());

            Morphs.SkeletonMorph.remove(p.getPlayer().getUniqueId());
            Morphs.CreeperMorph.remove(p.getPlayer().getUniqueId());
            Morphs.SheepMorph.remove(p.getPlayer().getUniqueId());
            Morphs.PigMorph.remove(p.getPlayer().getUniqueId());
            Morphs.SquidMorph.remove(p.getPlayer().getUniqueId());
            Morphs.ChickenMorph.remove(p.getPlayer().getUniqueId());
            Morphs.VillagerMorph.remove(p.getPlayer().getUniqueId());

            morphAPI.removeMorph(p.getPlayer());


        }



    }





}
