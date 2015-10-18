package io.github.warrenhigh.mc.smite.gods;

import io.github.warrenhigh.mc.smite.God;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

/**
 * Created by Mario Segura on 10/17/15.
 */
public class LokiGod extends God {
    @Override
    public void abilityOne(Player victim) {
        victim.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 5*20, 1));
        victim.sendMessage(ChatColor.GOLD + "[RPG] You have been attacked by Loki");
    }

    @Override
    public void abilityTwo(Player victim) {
        victim.setHealth(victim.getHealth() - 3.0);
        victim.sendMessage(ChatColor.GOLD + "[RPG] You have been attacked by Loki");
    }

    @Override
    public void abilityThree(Player player) {
        player.setHealth(player.getMaxHealth());
        player.sendMessage(ChatColor.GOLD + "[RPG] You have been bleesed by the Gods");
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
