package fr.weefle.ath.events;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import fr.weefle.ath.Main;
import fr.weefle.ath.game.ATHGame;

public class ATHJoin implements Listener {
	
	public static int task;
	public static int timer = 30;
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		Player p = e.getPlayer();
		if(!Main.getInstance().playeringame.contains(p.getUniqueId())){
			Main.getInstance().playeringame.add(p.getUniqueId());
		
		if(Main.getInstance().playeringame.size() == 1){
			task = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getInstance(), new Runnable() {
				
				@Override
				public void run() {
					timer--;
					setLevel(timer);
					if(timer == 15){
						for(UUID uuid : Main.getInstance().playeringame){
							Player pl = Bukkit.getPlayer(uuid);
							pl.sendMessage(Main.getInstance().name + "AimTheHole will start in 15 seconds!");
						}
					}
					if(timer == 0){
						Bukkit.getScheduler().cancelTask(task);
						ATHGame.start();
					}
				}
			}, 20, 20);
		}
	}
}
	
	public void setLevel(int timer){
		for(UUID uuid : Main.getInstance().playeringame){
			Player pl = Bukkit.getPlayer(uuid);
			pl.setLevel(timer);
		}
	}
	
	@EventHandler
	public void onQuit(PlayerQuitEvent e){
		Player p = e.getPlayer();
		Main.getInstance().playeringame.remove(p.getUniqueId());
	}
	
}