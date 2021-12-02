package net.items.store.minigames.api.team;

import org.bukkit.entity.Player;

import java.util.List;

public interface ITeamManager {

    /**
     * Adds a Team to the Team List
     * @param team
     */
    void addTeam(GameTeam team);

    /**
     * Change the Team of a Player
     * @param player
     * @param teamName
     */
    void joinTeam(Player player, String teamName);

    /**
     * Removes a Player from his current Team
     * @param player
     */
    void leaveTeam(Player player);

    /**
     * Adds a Player to a Random Team when Player not already in a Team
     * @param player
     * @return if player got a random Team or not
     */
    boolean randomTeamForPlayer(Player player);

    /**
     * @param player
     * @return the Team from the Player
     */
    GameTeam getPlayerTeam(Player player);

    /**
     * @return the complete Team List
     */
    List<GameTeam> getTeams();

    /**
     * Updates the Prefix from a Player to the Prefix of his current Team
     * @param player
     */
    void updatePlayerTeamPrefix(Player player);

}
