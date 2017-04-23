package fr.weefle.ath.commands;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import fr.weefle.ath.Main;

public class CommandATH implements CommandExecutor {

	public static Location loc;

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (sender instanceof Player) {
			
            Player p = (Player) sender;
            
            loc = p.getLocation();
            
            Main.instance.getConfig().set("location", loc);
            
		}
		return true;
	}

}
