package proiect.fis.gym.aplication.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class RegisterManagerController {

    @FXML
    public PasswordField passwordField;

    @FXML
    public ChoiceBox selectRole;

    @FXML
    public TextField usernameField,ageField,phoneField,emailField,firstNameField,lastNameField,gymLocation,companyName;

    @FXML
    public void handleChooseButton(){
        String role = (String) selectRole.getValue();
        if( role.equals("Customer") ) {
            try {
                Stage stage = (Stage) selectRole.getScene().getWindow();
                Parent viewRegisterRoot = FXMLLoader.load(getClass().getResource("../fxml/register.fxml"));
                Scene scene = new Scene(viewRegisterRoot, 600, 500);
                stage.setScene(scene);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if( role.equals("Gym Manager") ) {
            try {
                Stage stage = (Stage) selectRole.getScene().getWindow();
                Parent viewRegisterRoot = FXMLLoader.load(getClass().getResource("../fxml/registerManager.fxml"));
                Scene scene = new Scene(viewRegisterRoot, 600, 500);
                stage.setScene(scene);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void handleSubmitRegistrationButton(){

    }

    public void handleBackToLoginButton(){
        try {
            Stage stage = (Stage) selectRole.getScene().getWindow();
            Parent viewRegisterRoot = FXMLLoader.load(getClass().getResource("../fxml/login.fxml"));
            Scene scene = new Scene(viewRegisterRoot, 600, 400);
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
