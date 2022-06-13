package github.minersStudios.msDecor.listeners;

import github.minersStudios.msDecor.listeners.entity.EntityDamageByEntityListener;
import github.minersStudios.msDecor.listeners.entity.HangingBreakListener;
import github.minersStudios.msDecor.listeners.player.*;
import org.bukkit.plugin.PluginManager;

import static github.minersStudios.msDecor.Main.plugin;

public class RegEvents {
    /**
     * Registers default events
     */
    public RegEvents(){
        PluginManager pluginManager = plugin.getServer().getPluginManager();

        pluginManager.registerEvents(new EntityDamageByEntityListener(), plugin);
        pluginManager.registerEvents(new HangingBreakListener(), plugin);

        pluginManager.registerEvents(new BlockBreakListener(), plugin);
        pluginManager.registerEvents(new BlockPlaceListener(), plugin);
        pluginManager.registerEvents(new InventoryClickListener(), plugin);
        pluginManager.registerEvents(new InventoryCreativeListener(), plugin);
        pluginManager.registerEvents(new InventoryDragListener(), plugin);
        pluginManager.registerEvents(new PlayerInteractAtEntityListener(), plugin);
        pluginManager.registerEvents(new PlayerInteractEntityListener(), plugin);
        pluginManager.registerEvents(new PlayerInteractListener(), plugin);
    }
}
