package fr.weefle.ath.game;

import java.util.UUID;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import fr.weefle.ath.Main;

public class ATHTeleport {

	public static void teleport() {
		for(UUID uuid : Main.playeringame){
			Player pl = Bukkit.getPlayer(uuid);
			Location loc = new Location(pl.getWorld(), Main.instance.getConfig().getDouble("Spawn.x"), Main.instance.getConfig().getDouble("Spawn.y"), Main.instance.getConfig().getDouble("Spawn.z"));
			if(loc != null){
			pl.teleport(loc);
			pl.sendMessage(Main.name + "The game is strating...");

}
	}
}
}
