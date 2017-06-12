package fr.weefle.ath;

import java.io.File;

public class CreateConfig {
	
	private Main m;
	public CreateConfig(Main m){
		this.m = m;
	}
	
	public void createConfig() {
		
		File f = new File(this.m.instance.getDataFolder(), "config.yml");
		
		if(f.exists()){
			
			System.out.println(m.name + "The configuration's file exists!");
			
		}else{
			m.instance.getConfig().options().copyDefaults(false);
			m.instance.getConfig().createSection("Spawn");
			m.instance.getConfig().createSection("Spawn.x");
			m.instance.getConfig().createSection("Spawn.y");
			m.instance.getConfig().createSection("Spawn.z");
			m.instance.saveConfig();
			}

}
	
}