package fr.weefle.ath.game;

import java.util.UUID;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import fr.weefle.ath.Main;

public class ATHGame {

	public static void start() {
		
		for(UUID uuid : Main.playeringame){
			Player pl = Bukkit.getPlayer(uuid);
			Location loc = new Location(pl.getWorld(), Main.instance.getConfig().getDouble("Spawn.x"), Main.instance.getConfig().getDouble("Spawn.y"), Main.instance.getConfig().getDouble("Spawn.z"));
			pl.setGameMode(GameMode.ADVENTURE);
			ATHTeleport.teleport();
			pl.sendMessage(ChatColor.RED + "" + loc + " " + Main.name + "Teleported!");
		
	}
	
	}

}