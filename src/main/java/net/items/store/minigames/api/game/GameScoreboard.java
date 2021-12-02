package net.items.store.minigames.api.game;

import com.google.common.collect.Maps;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Map;

@Getter
@AllArgsConstructor
public class GameScoreboard {

    private String identifier;
    private String title;
    private Map<Integer, String> scoreboardLines;

    public GameScoreboard(String identifier, String title){
        this.identifier = identifier;
        this.title = title;
        this.scoreboardLines = Maps.newHashMap();
    }

}
