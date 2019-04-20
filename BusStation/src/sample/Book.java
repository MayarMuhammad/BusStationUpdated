package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Book {

    @FXML
    private Button Confirm;
    @FXML
    private Label Book;

    public void onConfirmPressed() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String sql = "SELECT * FROM trips WHERE AvaliableSeats";

    }

}
