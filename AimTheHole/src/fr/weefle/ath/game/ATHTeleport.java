package fr.weefle.ath.game;

import java.util.UUID;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import fr.weefle.ath.Main;
import fr.weefle.ath.commands.CommandATH;

public class ATHTeleport {

	public static void teleport() {
		for(UUID uuid : Main.playeringame){
			String location = Main.instance.getConfig().getString("location");
			Player pl = Bukkit.getPlayer(uuid);
			if(location != null){
			pl.teleport(location);
			pl.sendMessage(Main.name + "The game is strating...");
			}else{
				pl.sendMessage(Main.name + "You don't have defined the spawn!");
			}
		
	}

}
}