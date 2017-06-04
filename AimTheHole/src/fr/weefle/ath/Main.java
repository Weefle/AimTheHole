package fr.weefle.ath;

import java.util.ArrayList;
import java.util.UUID;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import com.github.theholywaffle.teamspeak3.TS3Api;
import com.github.theholywaffle.teamspeak3.TS3Config;
import com.github.theholywaffle.teamspeak3.TS3Query;

public class Main extends JavaPlugin {
	
	public static Main instance;
	public static String name;
	public static ArrayList<UUID> playeringame = new ArrayList<>();
	
	@Override
	public void onEnable() {
		instance = this;
		name = ChatColor.GREEN + "[AimTheHole] " + ChatColor.BLUE;
		ATHEvents.registerEvents();
		ATHCommands.registerCommands();
		CreateConfig.createConfig();
		final TS3Config config = new TS3Config();
		config.setHost("77.77.77.77");

		final TS3Query query = new TS3Query(config);
		query.connect();

		final TS3Api api = query.getApi();
		api.login("serveradmin", "serveradminpassword");
		api.selectVirtualServerById(1);
		api.setNickname("PutPutBot");
		api.sendChannelMessage("PutPutBot is online!");
		super.onEnable();
	}

}
