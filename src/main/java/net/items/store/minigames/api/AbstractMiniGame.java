package net.items.store.minigames.api;

import lombok.Getter;
import lombok.Setter;
import net.items.store.minigames.api.countdown.ICountdownManager;
import net.items.store.minigames.api.game.AbstractGame;
import net.items.store.minigames.api.kit.IKitManager;
import net.items.store.minigames.api.location.ILocationManager;
import net.items.store.minigames.api.map.IMapManager;
import net.items.store.minigames.api.message.IMessageManager;
import net.items.store.minigames.api.scoreboard.IScoreboardManager;
import net.items.store.minigames.api.stats.IStatsManager;
import net.items.store.minigames.api.team.ITeamManager;
import net.items.store.minigames.api.user.IUserManager;
import net.items.store.minigames.api.voting.IVotingManager;

@Getter
@Setter
public abstract class AbstractMiniGame {

    public AbstractGame abstractGame;
    public ICountdownManager countdownManager;
    public ILocationManager locationManager;
    public IMapManager mapManager;
    public IScoreboardManager scoreboardManager;
    public IStatsManager statsManager;
    public ITeamManager teamManager;
    public IUserManager userManager;
    public IKitManager kitManager;
    public IMessageManager messageManager;
    public IVotingManager votingManager;

}
