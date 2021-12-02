package net.items.store.minigames.api.countdown;

import lombok.Getter;
import lombok.Setter;
import net.items.store.minigames.api.game.GameState;

@Getter
public abstract class AbstractCountdownTask {

	@Setter
	private String identifier;
	private GameState gameState;
	@Setter
	private int count;

	/**
	 * Execute a specified Task
	 */
	public abstract void executeEvent();

	protected void setGameState(GameState gameState) {
		this.gameState = gameState;
	}
}
