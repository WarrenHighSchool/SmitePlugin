package io.github.warrenhigh.mc.smite.gods;

import io.github.warrenhigh.mc.smite.God;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

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
        victim.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 20 * 4, 1));
        victim.sendMessage(ChatColor.GOLD + "[RPG] You have been attacked by Ra");
    }

    @Override
    public void abilityThree(Player player) {
        // Heal
        player.setHealth(player.getMaxHealth());
        player.sendMessage(ChatColor.GOLD + "[RPG] Healed");
    }

    @Override
    public void abilityFour(Player victim) {
        // Explosion
        victim.getWorld().strikeLightningEffect(victim.getLocation());
        victim.setHealth(victim.getHealth() / 2);
        victim.sendMessage(ChatColor.GOLD + "[RPG] You have been attacked by Ra");
    }

    public RaGod(String name, int id){
        super(name, id);
    }
}
