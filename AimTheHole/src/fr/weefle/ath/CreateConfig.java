package fr.weefle.ath;

import java.io.File;

public class CreateConfig {
	
	private Main m;
	public CreateConfig(Main m){
		this.m = m;
	}
	
	public void createConfig() {
		
		File f = new File(this.m.getDataFolder(), "config.yml");
		
		if(f.exists()){
			
			System.out.println(m.name + "The configuration's file is already created!");
			
		}else{
			m.getConfig().options().copyDefaults(false);
			m.getConfig().createSection("Spawn");
			m.getConfig().createSection("Spawn.x");
			m.getConfig().createSection("Spawn.y");
			m.getConfig().createSection("Spawn.z");
			m.saveConfig();
			}

}
	
}