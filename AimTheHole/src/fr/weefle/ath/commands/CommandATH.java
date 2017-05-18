package fr.weefle.ath.commands;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import fr.weefle.ath.Main;

public class CommandATH implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (sender instanceof Player) {
			
            Player p = (Player) sender;
            
            Location loc = p.getLocation();
            
            Main.instance.getConfig().set("Spawn.x", loc.getX());
            Main.instance.getConfig().set("Spawn.y", loc.getY());
            Main.instance.getConfig().set("Spawn.z", loc.getZ());
            Main.instance.saveConfig();
            
		}
		return true;
	}

}
