package net.items.store.minigames.api.map;

import org.bukkit.entity.Player;

import java.util.List;

public interface IMapManager {

	/**
	 * Add a new Map to the AbstractMap List
	 * @param abstractMap
	 */
	void addMap(AbstractMap abstractMap);

	/**
	 * @return the AbstractMap List
	 */
	List<AbstractMap> getMaps();

	/**
	 * Take a randomMap from an AbstractMap List and set it to the current map
	 */
	void takeRandomMap();

	/**
	 * @return the current map
	 */
	AbstractMap getCurrentMap();

	/**
	 * Set the current map
	 * @param abstractMap
	 */
	void setCurrentMap(AbstractMap abstractMap);

	/**
	 * Teleports the given player to the current map spawn.
	 * @param player
	 */
	void teleportPlayerToCurrentMap(Player player);

}
