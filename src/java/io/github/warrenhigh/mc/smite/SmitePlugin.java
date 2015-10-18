package io.github.warrenhigh.mc.smite;

import io.github.warrenhigh.mc.smite.gods.*;
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

        this.godStorage.registerGod(new RaGod("Ra", 1));
        this.godStorage.registerGod(new PoseidonGod("Poseidon", 2));
        this.godStorage.registerGod(new RamaGod("Rama", 3));
        this.godStorage.registerGod(new AnubisGod("Anubis", 4));
        this.godStorage.registerGod(new VishnuGod("Vishnu", 5));
        this.godStorage.registerGod(new AnhurGod("Anhur", 6));
        this.godStorage.registerGod(new LokiGod("Loki", 7));

        this.getServer().getPluginManager().registerEvents(new SmiteListener(this), this);

        this.getCommand("smite").setExecutor(new SmiteCommand(this));
        this.getCommand("opsmite").setExecutor(new OPSmiteCommand(this));
    }

    @Override
    public void onDisable(){

    }

    public GodStorage getGodStorage(){
        return godStorage;
    }
}
