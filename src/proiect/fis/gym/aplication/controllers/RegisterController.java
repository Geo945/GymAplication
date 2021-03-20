package proiect.fis.gym.aplication.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class RegisterController {

    public ChoiceBox selectRole;

    @FXML
    public void handleChooseButton(){
        String role = (String) selectRole.getValue();
        if( role.equals("Customer") ) {
            try {
                Stage stage = (Stage) selectRole.getScene().getWindow();
                Parent viewRegisterRoot = FXMLLoader.load(getClass().getResource("../fxml/registerCustomer.fxml"));
                Scene scene = new Scene(viewRegisterRoot, 600, 400);
                stage.setScene(scene);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if( role.equals("GymManager") ) {
            try {
                Stage stage = (Stage) selectRole.getScene().getWindow();
                Parent viewRegisterRoot = FXMLLoader.load(getClass().getResource("../fxml/registerManager.fxml"));
                Scene scene = new Scene(viewRegisterRoot, 600, 400);
                stage.setScene(scene);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
