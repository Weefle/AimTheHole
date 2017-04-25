package fr.weefle.ath;

import org.bukkit.event.Listener;

public class ATHJump implements Listener {
	
   /* @EventHandler
    public void onPlayerToggleFlight(PlayerToggleFlightEvent event) {
            Player player = event.getPlayer();
            if (player.getGameMode() == GameMode.CREATIVE)
                    return;
            event.setCancelled(true);
            player.setAllowFlight(false);
            player.setFlying(false);
            player.setVelocity(player.getLocation().getDirection().multiply(1.5).setY(1));
    }
   
    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
       Player player = event.getPlayer();
       if ((player.getGameMode() != GameMode.CREATIVE)&&(player.getLocation().subtract(0, 1, 0).getBlock().getType() !=Material.AIR)&&(!player.isFlying())) {
               player.setAllowFlight(true);
       }

}*/
}