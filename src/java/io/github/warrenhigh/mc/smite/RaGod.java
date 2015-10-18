package io.github.warrenhigh.mc.smite;

import net.md_5.bungee.api.ChatColor;
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
        victim.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 20, 1));
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
        victim.getWorld().createExplosion(victim.getLocation(), 5);
        victim.sendMessage(ChatColor.GOLD + "[RPG] You have been attacked by Ra");
    }

    public RaGod(){
        super("Ra", 1);
    }
}
