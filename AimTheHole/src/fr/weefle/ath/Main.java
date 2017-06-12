package fr.weefle.ath;

import java.util.ArrayList;
import java.util.UUID;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import fr.weefle.ath.game.ATHGame;
import fr.weefle.ath.game.ATHTeleport;

public class Main extends JavaPlugin {
	
	public String name;
	public Main instance;
	public ATHEvents e = new ATHEvents(this);
	public ATHGame g = new ATHGame(this);
	public CreateConfig cc = new CreateConfig(this);
	public ATHTeleport t = new ATHTeleport(this);
	public ATHCommands c = new ATHCommands(this);
	public ArrayList<UUID> playeringame = new ArrayList<>();
	
	@Override
	public void onEnable() {
		instance =this;
		name = ChatColor.GREEN + "[AimTheHole] " + ChatColor.BLUE;
		e.registerEvents();
		c.registerCommands();
		cc.createConfig();
		super.onEnable();
	}

}
