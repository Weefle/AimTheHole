package fr.weefle.ath;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;

import fr.weefle.ath.events.ATHJoin;

public class ATHEvents {

	public static void registerEvents() {
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new ATHJoin(), Main.instance);
		pm.registerEvents(new ATHJump(), Main.instance);
	}

}
