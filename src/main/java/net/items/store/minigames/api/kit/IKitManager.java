package net.items.store.minigames.api.kit;

import org.bukkit.entity.Player;

import java.util.List;

public interface IKitManager {

	/**
	 * Adds a kit to the kit-List
	 * @param kit
	 */
	void addKit(Kit kit);

	/**
	 * @return the kit-List
	 */
	List<Kit> getKits();

	/**
	 * Clear the players inventory and give the given player the abstractKit.
	 * @param player
	 * @param abstractKit
	 */
	void givePlayerKit(Player player, Kit abstractKit);

	/**
	 * @param player
	 * @return player kit, if it exists, otherwise it give null back.
	 */
	Kit getPlayerKit(Player player);

	/**
	 * Get all kits from the player and gives him one random.
	 * @param player
	 */
	void takeRandomKit(Player player);

}
