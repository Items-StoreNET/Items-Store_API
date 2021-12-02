package net.items.store.minigames.api.scoreboard;

import net.items.store.minigames.api.game.GameScoreboard;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;

import java.util.List;

public interface IScoreboardManager {

    /**
     * Adds a new gameScoreboard to the gameScoreboard-List
     * @param gameScoreboard
     */
    void addScoreboard(GameScoreboard gameScoreboard);

    /**
     * Sends the given gameScoreboard to the given Player
     * @param gameScoreboard
     * @param player
     */
    void sendScoreboardToPlayer(GameScoreboard gameScoreboard, Player player);

    /**
     * Updates the given gameScoreboard for the given Player
     * @param gameScoreboard
     * @param player
     */
    void updateScoreboardForPlayer(GameScoreboard gameScoreboard, Player player);

    /**
     * @return the gameScoreboard-List
     */
    List<GameScoreboard> getScoreboardList();

    /**
     * @param player
     * @return Scoreboard from the Player if one exists otherwise it return null
     */
    Scoreboard getPlayerScoreboard(Player player);

}
