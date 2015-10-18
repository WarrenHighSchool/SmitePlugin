package io.github.warrenhigh.mc.smite;

import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Mario Segura on 10/17/15.
 */
public class GodStorage {

    HashMap<Player, God> playerGodMap;
    List<God> godList;
    SmitePlugin plugin;

    public GodStorage(SmitePlugin plugin){
        this.plugin = plugin;
        this.playerGodMap = new HashMap<>();
        this.godList = new ArrayList<>();
    }

    public void registerGod(God god){
        plugin.getServer().getLogger().info("God " + god.name + " has been Registered");
        godList.add(god);
    }

    public void doAbilityOne(Player player, Player victim){
        if (playerGodMap.containsKey(player)){
            playerGodMap.get(player).abilityOne(victim);
        }
    }

    public void doAbilityTwo(Player player, Player victim){
        if (playerGodMap.containsKey(player)){
            playerGodMap.get(player).abilityTwo(victim);
        }
    }

    public void doAbilityThree(Player player, Player victim){
        if (playerGodMap.containsKey(player)){
            playerGodMap.get(player).abilityThree(player);
        }
    }

    public void doAbilityFour(Player player, Player victim){
        if (playerGodMap.containsKey(player)){
            playerGodMap.get(player).abilityFour(victim);
        }
    }
}
