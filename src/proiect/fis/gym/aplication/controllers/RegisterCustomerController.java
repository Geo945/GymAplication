package proiect.fis.gym.aplication.controllers;


import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import proiect.fis.gym.aplication.exceptions.UsernameAlreadyExistsException;
import proiect.fis.gym.aplication.services.CustomerService;



public class RegisterCustomerController extends RegisterController {
    @FXML
    private ChoiceBox<String> selectRoleChoiceBox;

    private Text registrationMessage;

    @FXML
    private PasswordField passwordField;
    @FXML
    private TextField usernameField,firstNameField,lastNameField,ageField,phoneField,emailField;

    @FXML
    public void initialize(){
        selectRoleChoiceBoxAction(selectRoleChoiceBox);
    }

    public void handleSubmitRegistrationButton() {
        try {
            CustomerService.addUser(firstNameField.getText(),lastNameField.getText(),ageField.getText(),phoneField.getText(),emailField.getText(),usernameField.getText(),passwordField.getText(),(String)selectRoleChoiceBox.getValue());
            registrationMessage.setText("Account created successfully!");
        }catch (UsernameAlreadyExistsException e){
            registrationMessage.setText(e.getMessage());
        }
    }

    public void handleBackToLoginButton(){
        handleBackToLoginButtonLogic(selectRoleChoiceBox);
    }
}
