package github.minersStudios.msDecor.listeners;

import github.minersStudios.msDecor.listeners.block.BlockBreakListener;
import github.minersStudios.msDecor.listeners.entity.EntityDamageByEntityListener;
import github.minersStudios.msDecor.listeners.entity.HangingBreakListener;
import github.minersStudios.msDecor.listeners.entity.HangingPlaceListener;
import github.minersStudios.msDecor.listeners.mechanics.Brazier;
import github.minersStudios.msDecor.listeners.mechanics.Lamps;
import github.minersStudios.msDecor.listeners.mechanics.TrashCan;
import github.minersStudios.msDecor.listeners.player.*;
import org.bukkit.plugin.PluginManager;

import static github.minersStudios.msDecor.Main.plugin;

public class RegEvents {

	public static void init() {
		PluginManager pluginManager = plugin.getServer().getPluginManager();

		pluginManager.registerEvents(new BlockBreakListener(), plugin);

		pluginManager.registerEvents(new EntityDamageByEntityListener(), plugin);
		pluginManager.registerEvents(new HangingBreakListener(), plugin);
		pluginManager.registerEvents(new HangingPlaceListener(), plugin);

		pluginManager.registerEvents(new InventoryClickListener(), plugin);
		pluginManager.registerEvents(new InventoryCreativeListener(), plugin);
		pluginManager.registerEvents(new InventoryDragListener(), plugin);
		pluginManager.registerEvents(new PlayerInteractAtEntityListener(), plugin);
		pluginManager.registerEvents(new PlayerInteractEntityListener(), plugin);
		pluginManager.registerEvents(new PlayerInteractListener(), plugin);

		pluginManager.registerEvents(new Lamps(), plugin);
		pluginManager.registerEvents(new Brazier(), plugin);
		pluginManager.registerEvents(new TrashCan(), plugin);
	}
}