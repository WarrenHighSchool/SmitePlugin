package io.github.warrenhigh.mc.smite.gods;

import io.github.warrenhigh.mc.smite.God;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

import java.util.Random;

/**
 * Created by Mario Segura on 10/17/15.
 */
public class AnhurGod extends God {

    private static final Random random = new Random();

    @Override
    public void abilityOne(Player victim) {
        victim.setHealth(victim.getHealth() - 2.0);
        victim.sendMessage(ChatColor.GOLD + "[RPG] You have been attacked by Anhur");
    }

    @Override
    public void abilityTwo(Player victim) {
        victim.setVelocity(new Vector(
                random.nextDouble() * 10.0 - 5,
                random.nextDouble() * 10,
                random.nextDouble() * 10.0 - 5));
        victim.sendMessage(ChatColor.GOLD + "[RPG] You have been attacked by Anhur");
    }

    @Override
    public void abilityThree(Player player) {
        player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 20 * 5, 1));
        player.sendMessage(ChatColor.GOLD + "[RPG] Added Healing for 5 Sec");
    }

    @Override
    public void abilityFour(Player victim) {
        victim.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 10 * 20, 1));
        victim.sendMessage(ChatColor.GOLD + "[RPG] You have been attacked by Anhur");
    }

    public AnhurGod(String anhur, int i) {
        super(anhur, i);
    }
}
