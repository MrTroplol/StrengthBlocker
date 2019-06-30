package fr.mrtroplol.strengthblocker.commands;

import fr.mrtroplol.strengthblocker.StrengthBlocker;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class StrengthBlockerCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(args.length > 0)
        {
            if(args[0].equalsIgnoreCase("reload"))
            {
                if(!sender.hasPermission("strengthblocker.reload"))
                {
                    sender.sendMessage(StrengthBlocker.getPlugin().getConfig().getString("noPermission").replaceAll("&", "§"));
                }
                sender.sendMessage(StrengthBlocker.getPlugin().getConfig().getString("reload").replaceAll("&", "§"));
                StrengthBlocker.getPlugin().reloadConfig();
            }
            else
            {
                sender.sendMessage(StrengthBlocker.getPlugin().getConfig().getString("unknowCommand").replaceAll("&", "§"));
            }
        }
        else
        {
            sender.sendMessage(StrengthBlocker.getPlugin().getConfig().getString("unknowCommand").replaceAll("&", "§"));
        }
        return false;
    }
}
