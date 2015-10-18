package io.github.warrenhigh.mc.smite;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by Mario Segura on 10/18/15.
 */
public class OPSmiteCommand implements CommandExecutor {
    private final SmitePlugin plugin;

    public OPSmiteCommand(SmitePlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player target = plugin.getServer().getPlayer(strings[0]);
        plugin.getGodStorage().setPlayerGod(target, strings[1]);
        return true;
    }
}
