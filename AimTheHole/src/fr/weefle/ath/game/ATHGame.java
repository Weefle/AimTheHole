package fr.weefle.ath.game;

import java.util.UUID;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import fr.weefle.ath.Main;
import fr.weefle.ath.commands.CommandATH;

public class ATHGame {

	public static void start() {
		
		for(UUID uuid : Main.playeringame){
			Player pl = Bukkit.getPlayer(uuid);
			pl.setGameMode(GameMode.ADVENTURE);
			ATHTeleport.teleport();
			pl.sendMessage(ChatColor.RED + "" + CommandATH.loc + " " + Main.name + "Teleported!");
		
	}
	
	}

}