package lordpipe.lessentropy;

import java.util.Random;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;

public class PortalSpawnListener implements Listener {
    private LessEntropy plugin;

    private static Random rng = new Random();
    private double chance = 0.0;

    public PortalSpawnListener(LessEntropy pl) {
        plugin = pl;
        chance = pl.getConfig().getDouble("portal-spawn-chance");
    }

    @EventHandler(ignoreCancelled = true)
    public void onCreatureSpawn(CreatureSpawnEvent event) {
        if (event.getSpawnReason() == SpawnReason.NETHER_PORTAL) {
            if (rng.nextDouble() >= chance) {
                event.setCancelled(true);
            }
        }
    }
}
