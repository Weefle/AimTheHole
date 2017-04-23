package fr.weefle.ath.game;

import java.util.UUID;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import fr.weefle.ath.Main;
import fr.weefle.ath.commands.CommandATH;

public class ATHTeleport {

	public static void teleport() {
		for(UUID uuid : Main.getInstance().playeringame){
			Player pl = Bukkit.getPlayer(uuid);
			pl.teleport(CommandATH.getLocation());
		
	}

}
}