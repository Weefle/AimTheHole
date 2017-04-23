package fr.weefle.ath.game;

import java.util.UUID;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import fr.weefle.ath.Main;
import fr.weefle.ath.commands.CommandATH;

public class ATHTeleport {

	public static void teleport() {
		for(UUID uuid : Main.playeringame){
			Player pl = Bukkit.getPlayer(uuid);
			if(CommandATH.loc != null){
			pl.teleport(CommandATH.loc);
			pl.sendMessage(Main.name + "The game is strating...");
			}else{
				pl.sendMessage(Main.name + "You don't have defined the spawn!");
			}
		
	}

}
}