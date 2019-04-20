package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.sql.*;

public class AddATrip {
    @FXML
    private TextField ID;
    @FXML
    private TextField DriverName;
    @FXML
    private TextField VehicleType;
    @FXML
    private TextField VehicleNumber;
    @FXML
    private TextField Source;
    @FXML
    private TextField Destination;
    @FXML
    private TextField TripWay;
    @FXML
    private TextField Stops;
    @FXML
    private TextField Classes;
    @FXML
    private TextField TimeSet;
    @FXML
    private TextField TimeReach;
    @FXML
    private TextField Date;
    @FXML
    private TextField Price;

    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    public void onAddPressed() {
        try {
            String sql = "INSERT INTO trips"
                    + "(DriverName, VehicleType, VehicleNumber, Source, Destination, TripWay, Stops, Classes, TimeSet, TimeReach, Date, Price)"
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            connection = DriverManager.getConnection("jdbc:mysql://localhost/newbus", "root", "Mero1234");
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, DriverName.getText());
            preparedStatement.setString(2, VehicleType.getText());
            preparedStatement.setString(3, VehicleNumber.getText());
            preparedStatement.setString(4, Source.getText());
            preparedStatement.setString(5, Destination.getText());
            preparedStatement.setString(6, TripWay.getText());
            preparedStatement.setString(7, Stops.getText());
            preparedStatement.setString(8, Classes.getText());
            preparedStatement.setString(9, TimeSet.getText());
            preparedStatement.setString(10, TimeReach.getText());
            preparedStatement.setString(11, Date.getText());
            preparedStatement.setString(12, Price.getText());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void onDeletePressed() {
        try {
            String sql = "DELETE FROM trips WHERE ID =?";
            connection = DriverManager.getConnection("jdbc:mysql://localhost/newbus", "root", "Mero1234");
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, ID.getText());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void onEditPressed() {
        try {
            String sql = "UPDATE trips SET DriverName =?,VehicleType=?,VehicleNumber=?,Source=?,Destination=?,TripWay=?,Stops=?,Classes=?,TimeSet=?,TimeReach=?,Date=?,Price=? WHERE ID =?";
            connection = DriverManager.getConnection("jdbc:mysql://localhost/newbus", "root", "Mero1234");
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(13, ID.getText());
            preparedStatement.setString(1, DriverName.getText());
            preparedStatement.setString(2, VehicleType.getText());
            preparedStatement.setString(3, VehicleNumber.getText());
            preparedStatement.setString(4, Source.getText());
            preparedStatement.setString(5, Destination.getText());
            preparedStatement.setString(6, TripWay.getText());
            preparedStatement.setString(7, Stops.getText());
            preparedStatement.setString(8, Classes.getText());
            preparedStatement.setString(9, TimeSet.getText());
            preparedStatement.setString(10, TimeReach.getText());
            preparedStatement.setString(11, Date.getText());
            preparedStatement.setString(12, Price.getText());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
