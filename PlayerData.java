package sample;

/**
 * Created by Przemek on 03.09.2017.
 */
public class PlayerData {

    private String playerName;
    private double playerPoints;
    private double playerRebounds;
    private double playerAssists;
    private double playerBlocks;
    private double playerSteals;
    private double playerMinutes;
    private int playerGamesPlayed;

    public PlayerData(String playerName, double playerPoints, double playerRebounds, double playerAssists, double playerBlocks,
                      double playerSteals, double playerMinutes, int playerGamesPlayed) {
        this.playerName = playerName;
        this.playerPoints = playerPoints;
        this.playerRebounds = playerRebounds;
        this.playerAssists = playerAssists;
        this.playerBlocks = playerBlocks;
        this.playerSteals = playerSteals;
        this.playerMinutes = playerMinutes;
        this.playerGamesPlayed = playerGamesPlayed;

    }

    public String getPlayerName() {
        return playerName;
    }

    public double getPlayerPoints() {
        return playerPoints;
    }

    public double getPlayerRebounds() {
        return playerRebounds;
    }

    public double getPlayerAssists() {
        return playerAssists;
    }

    public double getPlayerBlocks() {
        return playerBlocks;
    }

    public double getPlayerSteals() {
        return playerSteals;
    }

    public double getPlayerMinutes() {
        return playerMinutes;
    }

    public int getPlayerGamesPlayed() {
        return playerGamesPlayed;
    }

    @Override
    public String toString() {
        return playerName;
    }

    public String showPlayerStats(){
        return "Points: " + playerPoints + "\nRebounds: " + playerRebounds + "\nAssists: " + playerAssists +
                "\nBlocks: " + playerBlocks + "\nSteals: " + playerSteals + "\nMinutes: " + playerMinutes + "\nGames Played: " + playerGamesPlayed;
    }
}
