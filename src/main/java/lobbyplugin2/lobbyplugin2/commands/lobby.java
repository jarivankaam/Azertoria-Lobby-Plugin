package lobbyplugin2.lobbyplugin2.commands;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class lobby implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("lobby")) {

            if (!(sender instanceof Player))
                return true;

            Player p = (Player) sender;
            p.sendMessage(ChatColor.AQUA + "[AN]" + ChatColor.BLUE + "Je word geteleporteerd naar de Lobby!");
            p.performCommand("warp hub");

            p.setGameMode(GameMode.ADVENTURE);

        }
        return true;
    }


}

