package net.items.store.minigames.api.voting;

import java.util.List;

public interface IVotingManager {

    /**
     * Adding new Voting to the Voting-List
     * @param voting
     */
    void addVoting(Voting voting);

    /**
     * Ends the Voting and display the result
     */
    void endVoting();

    /**
     * @return the Voting-List
     */
    List<Voting> getVotings();

}
