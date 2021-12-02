package net.items.store.minigames.api.stats;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public abstract class AbstractGameStats extends AbstractStats {

    private int wonGames;
    private int lostGames;
    private int playedGames;

    public AbstractGameStats(UUID uniqueID) {
        super(uniqueID);
    }
}
