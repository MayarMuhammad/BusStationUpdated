package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.sql.*;

public class DriverProfile {

    @FXML
    private TextField DriverName;
    @FXML
    private Label Driver;

    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    public void ShowData() {
        String Drivers = DriverName.getText();
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/newbus", "root", "Mero1234");
            String sql = "SELECT DriverName FROM trips Where DriverName='" + Drivers + "'";
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
            String Info = "";
            if (resultSet.next()) {
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
                Info = Info + DriverName + ", " + VehicleType + ", " + VehicleNumber + ", " + Source + ", " + Destination + ", " + TripWay + ", " + Stops + ", " + Classes + ", " + TimeSet + ", " + TimeReach + ", " + Date + ", " + Price + "\n";
                Driver.setText(Info);
            }
            else {
                Driver.setText("Driver not found ,Try Again");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
