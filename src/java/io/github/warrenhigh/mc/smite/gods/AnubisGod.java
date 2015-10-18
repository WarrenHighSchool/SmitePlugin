package io.github.warrenhigh.mc.smite.gods;

import io.github.warrenhigh.mc.smite.God;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

/**
 * Created by Mario Segura on 10/17/15.
 */
public class AnubisGod extends God {
    @Override
    public void abilityOne(Player victim) {
        victim.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 5 * 20, 1));
        victim.sendMessage(ChatColor.GOLD + "[RPG] You have been attacked by Anubis");
    }

    @Override
    public void abilityTwo(Player victim) {
        victim.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 10* 20, 1));
        victim.sendMessage(ChatColor.GOLD + "[RPG] You have been attacked by Anubis");
    }

    @Override
    public void abilityThree(Player player) {
        player.setHealth(player.getMaxHealth());
        player.sendMessage(ChatColor.GOLD + "[RPG] The Gods have blessed you");
    }

    @Override
    public void abilityFour(Player victim) {
        // Blindness
        victim.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 10 * 20, 1));
        victim.sendMessage(ChatColor.GOLD + "[RPG] You have been attacked by Anubis");
    }

    public AnubisGod(String anubis, int i) {
        super(anubis, i);
    }
}
