package net.items.store.minigames.api.stats;

import java.util.List;
import java.util.UUID;

public interface IStatsManager {

    /**
     * Searches for stats in the Database.
     * If there are no stats in the database, they will be created.
     * @param uniqueID of the Player
     * @return an instance of the class AbstractStats
     */
    AbstractStats loadStats(UUID uniqueID);

    /**
     * Saves player stats to the Database
     * @param abstractStats
     */
    void saveStats(AbstractStats abstractStats);

    /**
     * @return All cached stats which have not yet been deleted.
     */
    List<AbstractStats> getCachedStats();

    /**
     * Clearing all cached stats
     */
    void clearCachedStats();

}
