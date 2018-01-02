package net.thevoidmc.ula.GadgetMenu;


import net.thevoidmc.ula.Main;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.Material;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Random;

/**
 * Created by Ula on 9/11/16.
 */
public class Fireworks implements Listener {


    private final Main plugin;

    public Fireworks(Main plugin) {
        this.plugin = plugin;
    }


    @EventHandler
    public void firework(PlayerInteractEvent event){
        Player p = event.getPlayer();
        if (event.getItem() == null || event.getItem().getType() == Material.AIR || !event.getItem().hasItemMeta()) {
            return;
        }
        if(event.getItem().getItemMeta().getDisplayName().contains("§fFirework")) {
            Firework fw = (Firework) p.getLocation().getWorld().spawn(p.getLocation(), Firework.class);
            FireworkMeta fm = fw.getFireworkMeta();
            Random r = new Random();
            int fType = r.nextInt(5) + 1;
            FireworkEffect.Type type = null;
            switch (fType) {
                default:
                case 1:
                    type = FireworkEffect.Type.BALL;
                    break;
                case 2:
                    type = FireworkEffect.Type.BALL_LARGE;
                    break;
                case 3:
                    type = FireworkEffect.Type.BURST;
                    break;
                case 4:
                    type = FireworkEffect.Type.CREEPER;
                    break;
                case 6:
                    type = FireworkEffect.Type.STAR;
                    break;
            }
            int c1i = r.nextInt(16) +1;
            int c2i = r.nextInt(16) +1;
            Color c1 = getColour(c1i);
            Color c2 = getColour(c2i);
            FireworkEffect effect = FireworkEffect.builder().flicker(r.nextBoolean()).withColor(c1).withFade(c2)
                    .with(type).trail(r.nextBoolean()).build();
            fm.addEffect(effect);
            int power = r.nextInt(2) +1;
            fm.setPower(power);
            fw.setFireworkMeta(fm);

        }
    }
    public Color getColour(int c) {
        switch (c) {
            default:
            case 1:return Color.AQUA;
            case 2:return Color.BLACK;
            case 3:return Color.BLUE;
            case 4:return Color.FUCHSIA;
            case 5:return Color.GRAY;
            case 6:return Color.GREEN;
            case 7:return Color.LIME;
            case 8:return Color.MAROON;
            case 9:return Color.NAVY;
            case 10:return Color.OLIVE;
            case 11:return Color.PURPLE;
            case 12:return Color.RED;
            case 13:return Color.SILVER;
            case 14:return Color.TEAL;
            case 15:return Color.WHITE;
            case 16:return Color.YELLOW;
        }
    }




}
