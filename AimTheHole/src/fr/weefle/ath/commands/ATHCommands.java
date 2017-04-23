package fr.weefle.ath.commands;

import fr.weefle.ath.Main;

public class ATHCommands {



	public static void registerCommands(Main main) {
		// TODO Auto-generated method stub
		Main m = Main.getInstance();
		m.getCommand("ath").setExecutor(new CommandATH());
	}

}
