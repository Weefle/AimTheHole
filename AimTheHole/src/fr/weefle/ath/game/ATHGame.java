package fr.weefle.ath.game;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;

import fr.weefle.ath.Main;

public class ATHGame {

	public static void start() {
		
		for(UUID uuid : Main.getInstance().playeringame){
			Player pl = Bukkit.getPlayer(uuid);
			pl.setGameMode(GameMode.ADVENTURE);
			ATHTeleport.teleport();
		
	}
	
	}

}