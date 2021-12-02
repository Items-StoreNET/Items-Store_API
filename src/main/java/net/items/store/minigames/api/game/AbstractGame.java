package net.items.store.minigames.api.game;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AbstractGame {
	
	private GameState gameState;
	private int minPlayers;
	private int maxPlayers;
	
	public AbstractGame() {
		loadKits();
		loadCountdowns();
		loadMaps();
		loadTeams();
		loadScoreboards();
	}
	
	protected abstract void loadKits();
	protected abstract void loadCountdowns();
	protected abstract void loadMaps();
	protected abstract void loadTeams();
	protected abstract void loadScoreboards();

}
