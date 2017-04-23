package fr.weefle.ath;

import java.util.ArrayList;
import java.util.UUID;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public static Main instance;
	public String name;
	public ArrayList<UUID> playeringame = new ArrayList<>();
	
	public static Main getInstance(){
		return instance;
	}
	
	@Override
	public void onEnable() {
		instance = this;
		name = ChatColor.GREEN + "[AimTheHole] " + ChatColor.BLUE;
		ATHEvents.registerEvents(this);
		ATHCommands.registerCommands(this);
		super.onEnable();
	}
	
	@Override
	public void onDisable() {
		super.onDisable();
	}

}
