package fr.weefle.ath;

import fr.weefle.ath.commands.CommandATH;

public class ATHCommands {



	public static void registerCommands(Main main) {
		// TODO Auto-generated method stub
		Main m = Main.getInstance();
		m.getCommand("ath").setExecutor(new CommandATH());
	}

}
