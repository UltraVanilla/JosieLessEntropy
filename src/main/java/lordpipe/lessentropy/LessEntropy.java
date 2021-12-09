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
        if (getConfig().getDouble("enderman-block-pickup-chance") < 1.0)
            getServer().getPluginManager().registerEvents(new EndermanListener(this), this);

        if (getConfig().getDouble("portal-spawn-chance") < 1.0)
            getServer().getPluginManager().registerEvents(new PortalSpawnListener(this), this);

        if (getConfig().getDouble("dragon-block-break-chance") < 1.0)
            getServer().getPluginManager().registerEvents(new DragonListener(this), this);

        saveDefaultConfig();
    }
}
