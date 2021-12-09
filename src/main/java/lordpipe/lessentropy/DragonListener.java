package lordpipe.lessentropy;

import java.util.Random;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.entity.EnderDragon;

public class DragonListener implements Listener {
    private LessEntropy plugin;

    private static Random rng = new Random();
    private double chance = 0.0;

    public DragonListener(LessEntropy pl) {
        plugin = pl;
        chance = pl.getConfig().getDouble("dragon-block-break-chance");
    }

    @EventHandler(ignoreCancelled = true)
    public void onEntityExplode(EntityExplodeEvent event) {
        if (!event.isCancelled() && event.getEntity() instanceof EnderDragon) {
            if (rng.nextDouble() >= chance) {
                event.blockList().clear();
            }
        }
    }
}
