package io.github.warrenhigh.mc.smite.gods;

import io.github.warrenhigh.mc.smite.God;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;

/**
 * Created by Mario Segura on 10/17/15.
 */
public class LokiGod extends God {
    @Override
    public void abilityOne(Player victim) {

    }

    @Override
    public void abilityTwo(Player victim) {

    }

    @Override
    public void abilityThree(Player player) {

    }

    @Override
    public void abilityFour(Player victim) {
        // Thunderbolt
        victim.getWorld().strikeLightning(victim.getLocation());
        victim.sendMessage(ChatColor.GOLD + "[RPG] You have been attacked by Loki");
    }

    public LokiGod(String loki, int i) {
        super(loki, i);
    }
}
