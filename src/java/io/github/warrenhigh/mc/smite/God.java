package io.github.warrenhigh.mc.smite;

import org.bukkit.entity.Player;

/**
 * Created by Mario Segura on 10/17/15.
 */
public abstract class God {
    int godID = 0;

    String name = "GOD";

    public abstract void abilityOne(Player victim);

    public abstract void abilityTwo(Player victim);

    public abstract void abilityThree(Player player);

    public abstract void abilityFour(Player victim);

    public God(String name, int id){
        godID = id;
        this.name = name;
    }
}
