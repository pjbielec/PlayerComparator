package sample;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class Controller {

    private String leftPlayerName;
    private String rightPlayerName;

    private double leftPlayerPoints = 0;
    private double rightPlayerPoints = 0;
    private double pointsDifference = 0;

    private double leftPlayerRebounds = 0;
    private double rightPlayerRebounds = 0;
    private double reboundsDifference = 0;

    private double leftPlayerAssists = 0;
    private double rightPlayerAssists = 0;
    private double assistsDifference = 0;

    private double leftPlayerBlocks = 0;
    private double rightPlayerBlocks = 0;
    private double blocksDifference = 0;

    private double leftPlayerSteals = 0;
    private double rightPlayerSteals = 0;
    private double stealsDifference = 0;

    private double leftPlayerMinutes = 0;
    private double rightPlayerMinutes = 0;
    private double minutesDifference = 0;

    private int leftPlayerGamesPlayed = 0;
    private int rightPlayerGamesPlayed = 0;
    private int gamesPlayedDifference = 0;


@FXML
private ComboBox playerOnTheLeft;
@FXML
private ComboBox playerOnTheRight;
@FXML
private TextArea leftPlayerStats;
@FXML
private TextArea rightPlayerStats;
@FXML
private TextArea pointsComparationArea;
@FXML
private TextArea reboundsComparationArea;
@FXML
private TextArea assistsComparationArea;
@FXML
private TextArea blocksComparationArea;
@FXML
private TextArea stealsComparationArea;
@FXML
private TextArea minutesComparationArea;
@FXML
private TextArea gamesPlayedComparationArea;



    public void initialize (){
        playerOnTheLeft.getItems().setAll(PlayersStats.getInstance().getTableOfPlayers());
        playerOnTheRight.getItems().setAll(PlayersStats.getInstance().getTableOfPlayers());
    }

    @FXML
    public void handleClickOnLeftComboBoxItem(){
        PlayerData player = (PlayerData) playerOnTheLeft.getSelectionModel().getSelectedItem();
        leftPlayerStats.setText(player.showPlayerStats());
        leftPlayerPoints = player.getPlayerPoints();
        leftPlayerRebounds = player.getPlayerRebounds();
        leftPlayerAssists = player.getPlayerAssists();
        leftPlayerBlocks = player.getPlayerBlocks();
        leftPlayerSteals = player.getPlayerSteals();
        leftPlayerMinutes = player.getPlayerMinutes();
        leftPlayerGamesPlayed = player.getPlayerGamesPlayed();
        leftPlayerName = player.getPlayerName();

    }

    @FXML
    public void handleClickOnRightComboBoxItem(){
        PlayerData player = (PlayerData) playerOnTheRight.getSelectionModel().getSelectedItem();
        rightPlayerStats.setText(player.showPlayerStats());
        rightPlayerPoints = player.getPlayerPoints();
        rightPlayerRebounds = player.getPlayerRebounds();
        rightPlayerAssists = player.getPlayerAssists();
        rightPlayerBlocks = player.getPlayerBlocks();
        rightPlayerSteals = player.getPlayerSteals();
        rightPlayerMinutes = player.getPlayerMinutes();
        rightPlayerGamesPlayed = player.getPlayerGamesPlayed();
        rightPlayerName = player.getPlayerName();
    }

    @FXML
    public void handlePerGameButtonClicked(){
        java.text.DecimalFormat df = new java.text.DecimalFormat("0.00");
        pointsDifference = leftPlayerPoints - rightPlayerPoints;
        reboundsDifference = leftPlayerRebounds - rightPlayerRebounds;
        assistsDifference = leftPlayerAssists - rightPlayerAssists;
        blocksDifference = leftPlayerBlocks - rightPlayerBlocks;
        stealsDifference = leftPlayerSteals - rightPlayerSteals;
        minutesDifference = leftPlayerMinutes - rightPlayerMinutes;
        gamesPlayedDifference = leftPlayerGamesPlayed - rightPlayerGamesPlayed;

        ///////// POINTS /////////
        if (pointsDifference > 0){
            pointsComparationArea.setText(leftPlayerName + " scores " + df.format(pointsDifference) + " points more then " + rightPlayerName);
        }
        else if (pointsDifference < 0){
            pointsComparationArea.setText(rightPlayerName + " scores " + df.format(-pointsDifference) + " points more then " + leftPlayerName);
        }
        else {
            pointsComparationArea.setText("Both players score the same amount of points");
        }

        ///////// REBOUNDS /////////
        if (reboundsDifference > 0){
            reboundsComparationArea.setText(leftPlayerName + " gets " + df.format(reboundsDifference) + " more rebounds then " + rightPlayerName);
        }
        else if (reboundsDifference < 0){
            reboundsComparationArea.setText(rightPlayerName + " gets " + df.format(-reboundsDifference) + " more rebounds then " + leftPlayerName);
        }
        else {
            reboundsComparationArea.setText("Both players get the same amount of rebounds");
        }

        ///////// ASSISTS /////////
        if (assistsDifference > 0){
            assistsComparationArea.setText(leftPlayerName + " makes " + df.format(assistsDifference) + " more assists then " + rightPlayerName);
        }
        else if (reboundsDifference < 0){
            assistsComparationArea.setText(rightPlayerName + " makes " + df.format(-assistsDifference) + " more assists then " + leftPlayerName);
        }
        else {
            assistsComparationArea.setText("Both players make the same amount of assists");
        }

        ///////// BLOCKS /////////
        if (blocksDifference > 0){
            blocksComparationArea.setText(leftPlayerName + " blocks " + df.format(blocksDifference) + " more shots then " + rightPlayerName);
        }
        else if (reboundsDifference < 0){
            blocksComparationArea.setText(rightPlayerName + " blocks " + df.format(-blocksDifference) + " more shots then " + leftPlayerName);
        }
        else {
            blocksComparationArea.setText("Both players blocks the same amount of shots");
        }

        ///////// STEALS /////////
        if (stealsDifference > 0){
            stealsComparationArea.setText(leftPlayerName + " steals " + df.format(stealsDifference) + " more balls then " + rightPlayerName);
        }
        else if (reboundsDifference < 0){
            stealsComparationArea.setText(rightPlayerName + " steals " + df.format(-stealsDifference) + " more balls then " + leftPlayerName);
        }
        else {
            stealsComparationArea.setText("Both players get the same amount of steals");
        }

        ///////// MINUTES /////////
        if (minutesDifference > 0){
            minutesComparationArea.setText(leftPlayerName + " plays " + df.format(minutesDifference) + " more minutes then " + rightPlayerName);
        }
        else if (minutesDifference < 0){
            minutesComparationArea.setText(rightPlayerName + " plays " + df.format(-minutesDifference) + " more minutes then " + leftPlayerName);
        }
        else {
            minutesComparationArea.setText("Both players get the same minutes");
        }

        ///////// GAMES PLAYED /////////
        if (gamesPlayedDifference > 0){
            gamesPlayedComparationArea.setText(leftPlayerName + " played in " + df.format(gamesPlayedDifference) + " more games then " + rightPlayerName);
        }
        else if (gamesPlayedDifference < 0){
            gamesPlayedComparationArea.setText(rightPlayerName + " played in  " + df.format(-gamesPlayedDifference) + " more games then " + leftPlayerName);
        }
        else {
            gamesPlayedComparationArea.setText("Both players played in the same amount of games");
        }
    }

}
