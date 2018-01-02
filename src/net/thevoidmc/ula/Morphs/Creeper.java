package net.thevoidmc.ula.Morphs;

import com.sgtflow.morphapi.MorphPlugin;
import com.sgtflow.morphapi.api.MorphAPI;
import de.slikey.effectlib.util.ParticleEffect;
import net.thevoidmc.ula.Main;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;

/**
 * Created by Ula on 10/9/16.
 */
public class Creeper implements Listener {

    private final Main plugin;
    public Creeper(Main plugin) {
        this.plugin = plugin;
    }



    @EventHandler
    public void Sneak(PlayerToggleSneakEvent e){
        Player p = e.getPlayer();
        if(p.getPlayer().isSneaking()){
            if(Morphs.CreeperMorph.contains(p.getPlayer().getUniqueId())){
                ParticleEffect.EXPLOSION_HUGE.display(0.0F, 0.0F, 0.0F, 0.0F, 3, p.getLocation(), 30.0D);
                p.playSound(p.getLocation(), Sound.CREEPER_HISS, 5F,5F);
            }
        }
    }
}
