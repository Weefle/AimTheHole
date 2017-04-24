package fr.weefle.ath;

import java.io.File;

public class CreateConfig {
	
	public static void createConfig() {
		
		File f = new File(Main.instance.getDataFolder(), "config.yml");
		
		if(f.exists()){
			
			System.out.println(Main.name + "The configuration's file exists!");
			
		}else{
			Main.instance.getConfig().options().copyDefaults(false);
			Main.instance.getConfig().createSection("Spawn");
			Main.instance.getConfig().createSection("Spawn.x");
			Main.instance.getConfig().createSection("Spawn.y");
			Main.instance.getConfig().createSection("Spawn.z");
			Main.instance.saveConfig();
			}

}
	
}