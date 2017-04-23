package fr.weefle.ath;

import fr.weefle.ath.commands.CommandATH;

public class ATHCommands {

	public static void registerCommands() {
		Main.instance.getCommand("ath").setExecutor(new CommandATH());
	}

}
