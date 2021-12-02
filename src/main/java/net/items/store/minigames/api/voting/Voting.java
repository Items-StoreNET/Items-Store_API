package net.items.store.minigames.api.voting;

import com.google.common.collect.Maps;
import lombok.Getter;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Getter
public class Voting {

    private VotingIdentifier identifier;
    private Map<String, List<UUID>> voteMap;

    public Voting(VotingIdentifier identifier){
        this.identifier = identifier;
        this.voteMap = Maps.newHashMap();
    }

}
