package io.github.warrenhigh.mc.smite;

import org.bukkit.entity.Player;

/**
 * Created by Mario Segura on 10/17/15.
 */
public interface God {
    int godID = 0;

    public void abilityOne(Player victim);

    public void abilityTwo(Player victim);

    public void abilityThree(Player player);

    public void abilityFour(Player victim);
}
