package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.sql.*;


public class ManagerProfile {

    @FXML
    private Label Information;

    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;


    public void ShowInformation() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/newbus", "root", "Mero1234");
            String sql = "SELECT * FROM trips";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            String Info = "";
            while (resultSet.next()) {
                String ID = resultSet.getString("ID");
                String DriverName = resultSet.getString("DriverName");
                String VehicleType = resultSet.getString("VehicleType");
                String VehicleNumber = resultSet.getString("VehicleNumber");
                String Source = resultSet.getString("Source");
                String Destination = resultSet.getString("Destination");
                String TripWay = resultSet.getString("TripWay");
                String Stops = resultSet.getString("Stops");
                String Classes = resultSet.getString("Classes");
                String TimeSet = resultSet.getString("TimeSet");
                String TimeReach = resultSet.getString("TimeReach");
                String Date = resultSet.getString("Date");
                String Price = resultSet.getString("Price");
                String AvaliableSeats = resultSet.getString("AvaliableSeats");
                Info = Info + ID + ") " + DriverName + ", " + VehicleType + ", " + VehicleNumber + ", " + Source + ", " + Destination + ", " + TripWay + ", " + Stops + ", " + Classes + ", " + TimeSet + ", " + TimeReach + ", " + Date + ", " + Price + ", " + AvaliableSeats + "\n";
            }
            Information.setText(Info);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


