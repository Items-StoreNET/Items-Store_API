package net.items.store.minigames.api.location;

import org.bukkit.Location;

public interface ILocationManager {

    /**
     *
     * @param identifier
     * @return
     */
    Location getLocation(String identifier);

    /**
     *
     * @param identifier
     * @param location
     */
    void setLocation(String identifier, Location location);

}
