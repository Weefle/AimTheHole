package fr.weefle.ath.events;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import fr.weefle.ath.Main;


public class ATHJoin implements Listener {
	
	public int task;
	public int timer = 25;
	private Main m;
	public ATHJoin(Main m){
		this.m = m;
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		Player p = e.getPlayer();
		if(!m.playeringame.contains(p.getUniqueId())){
			m.playeringame.add(p.getUniqueId());
		
		if(m.playeringame.size() == 1){
			task = Bukkit.getScheduler().scheduleSyncRepeatingTask(m, new Runnable() {
				
				@Override
				public void run() {
					timer--;
					setLevel(timer);
					if(timer == 10){
						for(UUID uuid : m.playeringame){
							Player pl = Bukkit.getPlayer(uuid);
							pl.sendMessage(m.name + "AimTheHole will start in " + timer + " seconds!");
						}
					}
					if(timer == 0){
						Bukkit.getScheduler().cancelTask(task);
						m.g.start();
					}
				}
			}, 20, 20);
		}
	}
}
	
	public void setLevel(int timer){
		for(UUID uuid : m.playeringame){
			Player pl = Bukkit.getPlayer(uuid);
			pl.setLevel(timer);
		}
	}
	
	@EventHandler
	public void onQuit(PlayerQuitEvent e){
		Player p = e.getPlayer();
		m.playeringame.remove(p.getUniqueId());
	}
	
}