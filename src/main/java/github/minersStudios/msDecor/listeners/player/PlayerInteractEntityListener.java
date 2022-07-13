package github.minersStudios.msDecor.listeners.player;

import org.bukkit.entity.ItemFrame;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

import javax.annotation.Nonnull;

public class PlayerInteractEntityListener implements Listener {

    @EventHandler
    public void onPlayerInteractEntity(@Nonnull PlayerInteractEntityEvent event) {
        event.setCancelled(event.getRightClicked() instanceof ItemFrame itemFrame && itemFrame.getScoreboardTags().contains("customDecor"));
    }
}
