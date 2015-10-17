package io.github.warrenhigh.mc.smite;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Mario Segura on 10/17/15.
 */
public class SmitePlugin extends JavaPlugin {

    public GodStorage godStorage;

    @Override
    public void onEnable(){
        this.getServer().getLogger().info("SmitePlugin Start");
        this.godStorage = new GodStorage(this);
        this.godStorage.registerGod(new RaGod());
        this.getServer().getPluginManager().registerEvents(new SmiteListener(this), this);
    }

    @Override
    public void onDisable(){

    }

    public GodStorage getGodStorage(){
        return godStorage;
    }
}
