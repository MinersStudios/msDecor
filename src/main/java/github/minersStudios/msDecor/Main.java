package github.minersStudios.msDecor;

import github.minersStudios.msDecor.listeners.RegEvents;
import net.coreprotect.CoreProtect;
import net.coreprotect.CoreProtectAPI;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public static Main plugin;
    public static CoreProtectAPI coreProtectAPI = new CoreProtectAPI();

    private CoreProtectAPI getCoreProtect() {
        final Plugin coreProtect = getServer().getPluginManager().getPlugin("CoreProtect");

        if (coreProtect == null) return null;
        CoreProtectAPI CoreProtect = ((CoreProtect)coreProtect).getAPI();
        return (!CoreProtect.isEnabled() || CoreProtect.APIVersion() < 7 ? null : CoreProtect);
    }

    @Override
    public void onEnable() {
        plugin = this;

        coreProtectAPI = getCoreProtect();
        if (coreProtectAPI != null) coreProtectAPI.testAPI();

        new RegEvents();
    }
}
