package sample;

import javafx.collections.FXCollections;

import java.util.List;

/**
 * Created by Przemek on 25.08.2017.
 */
public class PlayersStats {

    PlayerData lebronJames = new PlayerData
            ("Lebron James",25,8.8,8.5,1,1.5, 38.2, 75);
    PlayerData kevinDurant = new PlayerData
            ("Kevin Durant",30,8.5,5,1.5,1, 37.6,78);
    PlayerData stepCurry = new PlayerData
            ("Steph Curry",28,5,8,0.3,2.2,35.4, 74);
    PlayerData kawhiLeonard = new PlayerData
            ("Kawhi Leonard",25,7,5,1.2,2.1,33.1,75);
    PlayerData jamesHarden = new PlayerData
            ("James Harden",28,8,12,0.2,1.5,40.1,82);
    PlayerData russelWestbrook = new PlayerData
            ("Russel Westbrook",30,10,10,0.3,2,42.4,81);
    PlayerData anthonyDavis = new PlayerData
            ("Anthony Davis", 24.8,11.4,3.2,3.1,1.2,38.1,71);

    private static PlayersStats instance = new PlayersStats();

    private List<PlayerData> tableOfPlayers;

    public static PlayersStats getInstance(){
        return instance;
    }

    public List<PlayerData> getTableOfPlayers(){
        return tableOfPlayers;
    }

    public void addPlayerStats(PlayerData player){
        tableOfPlayers.add(player);
    }

    public void loadPlayersStats(){
        tableOfPlayers = FXCollections.observableArrayList();
        tableOfPlayers.add(lebronJames);
        tableOfPlayers.add(kevinDurant);
        tableOfPlayers.add(stepCurry);
        tableOfPlayers.add(kawhiLeonard);
        tableOfPlayers.add(jamesHarden);
        tableOfPlayers.add(russelWestbrook);
        tableOfPlayers.add(anthonyDavis);
    }


}
