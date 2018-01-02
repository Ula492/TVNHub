package net.thevoidmc.ula.Events;

import net.thevoidmc.ula.Main;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

/**
 * Created by Ula on 9/5/16.
 */
public class DropItems implements Listener{
    private final Main plugin;

    public DropItems(Main plugin) {
        this.plugin = plugin;
    }

    public void DropItem(PlayerDropItemEvent e){
        Player p = e.getPlayer();
        if(p.getGameMode() == GameMode.CREATIVE){
            e.setCancelled(false);
        }else{
            e.setCancelled(true);
        }
    }


}
