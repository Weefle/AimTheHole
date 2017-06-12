package fr.weefle.ath.game;

import java.util.UUID;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import fr.weefle.ath.Main;

public class ATHTeleport {
	
	private Main m;
	public ATHTeleport(Main m){
		this.m = m;
	}

	public void teleport() {
		for(UUID uuid : m.playeringame){
			Player pl = Bukkit.getPlayer(uuid);
			Location loc = new Location(pl.getWorld(), m.instance.getConfig().getDouble("Spawn.x"), m.instance.getConfig().getDouble("Spawn.y"), m.instance.getConfig().getDouble("Spawn.z"));
			if(loc != null){
			pl.teleport(loc);
			pl.sendMessage(m.name + "The game is strating...");

}
	}
}
}
