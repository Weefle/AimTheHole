package fr.weefle.ath;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;

import fr.weefle.ath.events.ATHJoin;

public class ATHEvents {
	
	private Main m;
	public ATHEvents(Main m){
		this.m = m;
	}
	
	public void registerEvents() {
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new ATHJoin(m), m.instance);
		/*pm.registerEvents(new ATHJump(m), m.instance);*/
	}

}
