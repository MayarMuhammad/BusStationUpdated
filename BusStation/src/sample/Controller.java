package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Button Passenger;
    @FXML
    private Label PassengerUsername;
    @FXML
    private Label PassengerPassword;
    @FXML
    private TextField PassengerUsernameText;
    @FXML
    private TextField PassengerPasswordText;
    @FXML
    private Button Manager;
    @FXML
    private Button Driver;
    @FXML
    private Button Submit;

    PassengerValidation passengerValidation = new PassengerValidation();
    ManagerProfile managerProfile = new ManagerProfile();


    public void onPassengerClicked() {
        PassengerUsernameText.setVisible(true);
        PassengerPasswordText.setVisible(true);
        Submit.setVisible(true);
        PassengerUsername.setVisible(true);
        PassengerPassword.setVisible(true);
        passengerValidation.setPassengerUsernameText(PassengerUsernameText);
        passengerValidation.setPassengerPasswordText(PassengerPasswordText);

    }

    public void onSubmitClicked() {
        String Name = PassengerUsernameText.getText();
        String Password = PassengerPasswordText.getText();
        try {
            passengerValidation.createDataBase();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
