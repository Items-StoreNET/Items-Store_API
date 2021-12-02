package net.items.store.minigames.api.stats;

import lombok.Getter;
import lombok.Setter;

import java.text.DecimalFormat;
import java.util.UUID;

@Getter
@Setter
public abstract class AbstractStats {

    private static final DecimalFormat decimalFormat = new DecimalFormat("0.00");
    private UUID uniqueID;
    private int kills;
    private int deaths;
    private int points;
    private int wonGames;
    private int lostGames;
    private int playedGames;

    public AbstractStats(UUID uniqueID){
        this.uniqueID = uniqueID;
        this.kills = 0;
        this.deaths = 0;
        this.points = 0;
        this.wonGames = 0;
        this.lostGames = 0;
        this.playedGames = 0;
    }

    public String getKd(){
        if(kills == 0){
            return "0.00";
        } else if(deaths == 0){
            return kills + ".00";
        } else {
            return decimalFormat.format((double) kills / (double) deaths);
        }
    }
}
