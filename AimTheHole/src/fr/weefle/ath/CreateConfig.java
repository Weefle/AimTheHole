package fr.weefle.ath;

import java.io.File;
import org.bukkit.plugin.java.JavaPlugin;

public class CreateConfig extends JavaPlugin {
	
	public static Main main;
	
	public static void createConfig() {
	    try {
	        if (!main.getDataFolder().exists()) {
	        	main.getDataFolder().mkdirs();
	        }
	        File file = new File(main.getDataFolder(), "config.yml");
	        if (!file.exists()) {
	        	main.getLogger().info("Config.yml not found, creating!");
	        	main.saveDefaultConfig();
	        } else {
	        	main.getLogger().info("Config.yml found, loading!");
	        }
	    } catch (Exception e) {
	        e.printStackTrace();

	    }

	}

}
