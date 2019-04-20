package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.*;

public class PassengerValidation {
    @FXML
    private TextField PassengerUsernameText;
    @FXML
    private TextField PassengerPasswordText;
    @FXML
    private Label Validate;

    public void setValidate(Label validate) {
        Validate = validate;
    }

    public void setPassengerUsernameText(TextField passengerUsernameText) {
        PassengerUsernameText = passengerUsernameText;
    }

    public TextField getPassengerUsernameText() {
        return PassengerUsernameText;
    }

    public void setPassengerPasswordText(TextField passengerPasswordText) {
        PassengerPasswordText = passengerPasswordText;

    }

    public void createDataBase() throws SQLException {
        String url = "jdbc:mysql://localhost/newbus";
        String user = "root";
        String pass = "Mero1234";

        String username = PassengerUsernameText.getText();
        String password = PassengerPasswordText.getText();
        try {
            Connection connection = DriverManager.getConnection(url, user, pass);
            Statement statement = connection.createStatement();
            String sql = "Select * from passengerinformation Where PassengerUsername='" + username + "' and PassengerPassword='" + password + "'";
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {

            } else {

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}




