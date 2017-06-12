package fr.weefle.ath.commands;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import fr.weefle.ath.Main;

public class CommandATH implements CommandExecutor {
	
	private Main m;
	public CommandATH(Main m){
		this.m = m;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (sender instanceof Player) {
			
            Player p = (Player) sender;
            
            Location loc = p.getLocation();
            
            m.getConfig().set("Spawn.x", loc.getX());
            m.getConfig().set("Spawn.y", loc.getY());
            m.getConfig().set("Spawn.z", loc.getZ());
            m.saveConfig();
            
		}
		return true;
	}

}
