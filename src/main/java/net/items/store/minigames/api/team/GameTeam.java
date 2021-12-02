package net.items.store.minigames.api.team;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.Color;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
public class GameTeam {
	
	private String teamName;
	private String teamPrefix;
	private String fullTeamPrefix;
	private String scoreboardTeamName;
	private int maxPlayers;
	private List<UUID> teamPlayers;
	@Setter
	private boolean teamBedExists;
	@Setter
	private ItemStack teamInventoryItem;
	@Setter
	private Color teamColor;
	
	public GameTeam(String teamName, String teamPrefix, String fullTeamPrefix, String scoreboardTeamName, int maxPlayers) {
		this.teamName = teamName;
		this.teamPrefix = teamPrefix;
		this.fullTeamPrefix = fullTeamPrefix;
		this.scoreboardTeamName = scoreboardTeamName;
		this.maxPlayers = maxPlayers;
		this.teamPlayers = new ArrayList<>();
		this.teamBedExists = false;
		this.teamInventoryItem = null;
		this.teamColor = null;
	}
}