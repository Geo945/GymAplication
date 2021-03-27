package proiect.fis.gym.aplication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import proiect.fis.gym.aplication.services.CustomerService;

public class Main extends Application {

    public void start(Stage primaryStage) throws Exception{
        //CustomerService.loadUsersFromFile();
        Parent root = FXMLLoader.load(getClass().getResource("fxml/login.fxml"));
        primaryStage.setTitle("Gym Aplication");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}