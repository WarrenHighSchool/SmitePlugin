package io.github.warrenhigh.mc.smite;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

/**
 * Created by Mario Segura on 10/17/15.
 */
public class SmiteCommand implements CommandExecutor {
    private final SmitePlugin plugin;

    public SmiteCommand(SmitePlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof ConsoleCommandSender){
            commandSender.sendMessage("[RPG] You are not allowed");
            return true;
        }

        Player player = (Player)commandSender;

        if (strings.length == 1){
            plugin.godStorage.setPlayerGod(player, strings[0]);
            return true;
        }

        return true;
    }
}

