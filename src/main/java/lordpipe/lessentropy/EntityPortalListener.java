package lordpipe.lessentropy;

import org.bukkit.Location;
import org.bukkit.PortalType;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPortalEvent;

public class EntityPortalListener implements Listener {
    private LessEntropy plugin;

    private Location padLocation;

    public EntityPortalListener(LessEntropy pl) {
        plugin = pl;
        padLocation = pl.getConfig().getLocation("end-return-portal-destination");
    }

    @EventHandler(ignoreCancelled = true)
    public void onEntityPortalEnter(EntityPortalEvent event) {
        if (event.getTo() == null) return;

        if (event.getPortalType().equals(PortalType.ENDER)
                && !event.getTo().getWorld().getEnvironment().equals(World.Environment.THE_END)
                && event.getFrom().getWorld().getEnvironment().equals(World.Environment.THE_END)
                && !event.getEntityType().equals(EntityType.PLAYER)) {
            event.setTo(padLocation);
        }
    }
}
