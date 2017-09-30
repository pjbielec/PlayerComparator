package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Player Comparator");
        primaryStage.setScene(new Scene(root, 900, 600));
        primaryStage.show();
    }

    @Override
    public void init() throws Exception {
        try {
            PlayersStats.getInstance().loadPlayersStats();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }    }


    public static void main(String[] args) {
        launch(args);
    }
}
