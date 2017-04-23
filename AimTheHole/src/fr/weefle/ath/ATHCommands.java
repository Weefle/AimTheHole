package fr.weefle.ath;

import fr.weefle.ath.commands.CommandATH;

public class ATHCommands {



	public static void registerCommands(Main main) {
		Main.instance.getCommand("ath").setExecutor(new CommandATH());
	}

}
