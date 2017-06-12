package fr.weefle.ath.game;

import java.util.UUID;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import fr.weefle.ath.Main;

public class ATHGame {
	
	private Main m;
	public ATHGame(Main m){
		this.m = m;
	}

	public void start() {
		
		for(UUID uuid : m.playeringame){
			Player pl = Bukkit.getPlayer(uuid);
			Location loc = new Location(pl.getWorld(), m.instance.getConfig().getDouble("Spawn.x"), m.instance.getConfig().getDouble("Spawn.y"), m.instance.getConfig().getDouble("Spawn.z"));
			pl.setGameMode(GameMode.ADVENTURE);
			m.t.teleport();
			pl.sendMessage(ChatColor.RED + "" + loc + " " + m.name + "Teleported!");
		
	}
	
	}

}