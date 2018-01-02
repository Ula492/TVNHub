package net.thevoidmc.ula.GadgetMenu;

import net.thevoidmc.ula.Main;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.util.Vector;

import java.util.List;
import java.util.Random;

/**
 * Created by Ula on 9/23/16.
 */
public class Jokes implements Listener{


    private final Main plugin;

    public Jokes(Main plugin) {
        this.plugin = plugin;
    }
    String Prefix = "§8Hub> ";

    String [] joke = {
            "§fWhy was 6 afraid of 7?    Because 7, 8, 9.",
            "§f What musical instrument is found in the bathroom?    A tuba toothpaste.",
            "§fWhere do pencils go for vacation?    Pencil-vania.",
            "§fCan a kangaroo jump higher than a house?    Of course, a house doesn’t jump at all.",
            "§fWhat kind of bagel can fly?    A plain bagel",
            "§fIs there a hole in your shoe? No; Then how did you get your foot into it?",
            "§fWhat did the traffic light say to the other traffic light?    Don't look! Im changing"};

    Random random = new Random();
    int select = random.nextInt(joke.length);


    @EventHandler
    public void Jokes(PlayerInteractEvent event){
        Player p = event.getPlayer();
        if (event.getItem() == null || event.getItem().getType() == Material.AIR || !event.getItem().hasItemMeta()) {
            return;
        }
        if(event.getItem().getType() == Material.COAL) {
            p.playSound(p.getLocation(), Sound.NOTE_PLING, .5F, .5F);
            p.sendMessage(joke[select]);
            }
        }


}
