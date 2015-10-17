package io.github.warrenhigh.mc.smite;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;

/**
 * Created by Mario Segura on 10/17/15.
 */
public class RaGod extends God {

    @Override
    public void abilityOne(Player victim) {
        // Light On fire
        victim.setFireTicks(20 * 5);
        victim.sendMessage(ChatColor.GOLD + "[RPG] You have been attacked by Ra");
    }

    @Override
    public void abilityTwo(Player victim) {
        // Poison
    }

    @Override
    public void abilityThree(Player player) {
        // Heal
    }

    @Override
    public void abilityFour(Player victim) {
        // Explosion
    }

    public RaGod(){
        super("Ra", 1);
    }
}
