package sample;

import java.sql.*;

public class TicketInfo {
    private double TicketNumber;
    private double Price;
    private String Date;
    private String Time;

    String url = "jdbc:mysql://localhost/newbus";
    String user = "root";
    String pass = "Mero1234";

    public double getTicketNumber() {
        return TicketNumber;
    }

    public void setTicketNumber(double ticketNumber) {
        TicketNumber = ticketNumber;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public TicketInfo(double ticketNumber, double price, String date, String time) {
        TicketNumber = ticketNumber;
        Price = price;
        Date = date;
        Time = time;
    }

//    public boolean IsAvailable(String destination,String date,String totalSeat) {
//        int seatNeed = Integer.parseInt(totalSeat);
//        boolean isAvailable = true;
//        int trainMaxSeat = Integer.parseInt(destination.total_seat);
//        String sql = "SELECT SUM(number_of_seat) as totalSeatBooked FROM booking WHERE destination_id = '"+destination.id+"'  AND journey_date ='"+date+"' ";
//        try {
//            Connection connection = DriverManager.getConnection(url, user, pass);
//            Statement statement = connection.createStatement();
//            ResultSet result = this.db.statement.executeQuery(sql);
//            if(result.next()) {
//                if(trainMaxSeat <= (result.getInt("totalSeatBooked") + seatNeed) ) {
//                    isAvailable = false;
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return isAvailable;
    }

