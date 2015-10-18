package io.github.warrenhigh.mc.smite;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

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

        return true;
    }
}
