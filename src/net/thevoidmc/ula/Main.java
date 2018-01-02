package net.thevoidmc.ula;

import com.earth2me.essentials.Essentials;
import net.thevoidmc.ula.CostmeticsMenu.CosmeticsMenu;
import net.thevoidmc.ula.Events.DropItems;
import net.thevoidmc.ula.Events.HotBar;
import net.thevoidmc.ula.Events.Top;
import net.thevoidmc.ula.GadgetMenu.*;
import net.thevoidmc.ula.Heads.Heads1;
import net.thevoidmc.ula.Heads.Heads2;
import net.thevoidmc.ula.Heads.Heads3;
import net.thevoidmc.ula.Morphs.*;
import net.thevoidmc.ula.ParticleMenu.*;
import net.thevoidmc.ula.Utils.BarUtils;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Ula on 9/4/16.
 */
public class Main extends JavaPlugin implements Listener {


    private static Plugin plugin;
    private static Main instance;
    public static Main getInstance() {
        return instance;
    }

    Essentials essApi;

    public void onEnable(){
        System.out.print("TVNHub Enabled Correctly");


        this.getServer().getMessenger().registerOutgoingPluginChannel((Plugin)this, "BungeeCord");
        plugin = this;
        instance = this;
        PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvents(this, this);
        pm.registerEvents(new DropItems(this), this);
        pm.registerEvents(new HotBar(this), this);


        pm.registerEvents(new BatBlaster(this), this);
        pm.registerEvents(new Snowball(this), this);
        pm.registerEvents(new TNTLauncher(this), this);
        pm.registerEvents(new Freezer(this), this);
        pm.registerEvents(new Fireworks(this), this);
        pm.registerEvents(new Jokes(this), this);
        pm.registerEvents(new Flash(this), this);

        pm.registerEvents(new WaterHelix(this), this);
        pm.registerEvents(new WaterLord(this), this);
        pm.registerEvents(new AirHelix(this), this);
        pm.registerEvents(new AirLord(this), this);
        pm.registerEvents(new FireHelix(this), this);
        pm.registerEvents(new FireLord(this), this);

        pm.registerEvents(new Creeper(this), this);
        pm.registerEvents(new Skeleton(this),this);
        pm.registerEvents(new Sheep(this), this);
        pm.registerEvents(new Pig(this), this);
        pm.registerEvents(new Cow(this), this);
        pm.registerEvents(new Chicken(this), this);
        pm.registerEvents(new Squid(this), this);
        pm.registerEvents(new Villager(this), this);

        pm.registerEvents(new Heads1(this), this);
        pm.registerEvents(new Heads2(this), this);
        pm.registerEvents(new Heads3(this), this);




        pm.registerEvents(new Top(this), this);


        pm.registerEvents(new GadgetMenu(this), this);
        pm.registerEvents(new CosmeticsMenu(this), this);
        pm.registerEvents(new ParticleMenu(this), this);
        pm.registerEvents(new Morphs(this), this);


        this.essApi = ((Essentials)getServer().getPluginManager().getPlugin("Essentials"));


        new Thread(new Runnable() {

            @Override
            public void run() {
                while(true) {
                    for(String s : BarUtils.getPlayers()) {
                        Player o = Bukkit.getPlayer(s);
                        if(o != null) BarUtils.teleportBar(o);
                    }

                    try {
                        Thread.sleep(1000); // 1000 = 1 sec
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }).start();

    }


    public void onDisable(){
        System.out.print("TVNHub Disabled Correctly");

    }












}
