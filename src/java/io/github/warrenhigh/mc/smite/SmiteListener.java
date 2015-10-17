package io.github.warrenhigh.mc.smite;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created by Mario Segura on 10/17/15.
 */
@SuppressWarnings("unused")
public class SmiteListener implements Listener {

    private final SmitePlugin plugin;

    public SmiteListener(SmitePlugin plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void damageEvent(EntityDamageByEntityEvent event){
        if ((event.getDamager() instanceof Player) && (event.getEntity() instanceof Player)){
            Player damager = (Player)event.getDamager();
            Player victim = (Player)event.getEntity();

            GodStorage godStorage = plugin.getGodStorage();

            switch (damager.getInventory().getHeldItemSlot()){
                case 0:
                    // Ability 1
                    godStorage.doAbilityOne(damager, victim);
                    break;
                case 1:
                    // Ability 2
                    break;
                case 2:
                    // Ability 3
                    break;
                case 3:
                    // Ability 4
                    break;
                default:
                    break;
            }
        }
    }
}
