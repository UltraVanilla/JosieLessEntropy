package lordpipe.lessentropy;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Plugin to prevent dragon griefing
 *
 * @author Copyright (c) lordpipe. Licensed GPLv3
 */
public class LessEntropy extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new EventListener(this), this);
        saveDefaultConfig();
    }
}
