package fr.weefle.ath;

import fr.weefle.ath.commands.CommandATH;

public class ATHCommands {

	private Main m;
	public ATHCommands(Main m){
		this.m = m;
	}

	public void registerCommands() {
		m.getCommand("ath").setExecutor(new CommandATH(m));
	}

}
