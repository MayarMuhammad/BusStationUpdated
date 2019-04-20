package sample;
public class Trips {
    private String ID;
    private  String DriverName;
    private String VehicleType;
    private String VehicleNumber;
    private String Source;
    private String Destination;
    private String TripWay;
    private String Stops;
    private String Classes;
    private String TimeSet;
    private String TimeReach;
    private String Date;

    public Trips(String id, String drivername, String vehicleType, String vehicleNumber, String source, String destination, String tripWay, String stops, String classes, String timeSet, String timeReach, String date) {

    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDriverName() {
        return DriverName;
    }

    public void setDriverName(String driverName) {
        DriverName = driverName;
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(String vehicleType) {
        VehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return VehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        VehicleNumber = vehicleNumber;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public String getTripWay() {
        return TripWay;
    }

    public void setTripWay(String tripWay) {
        TripWay = tripWay;
    }

    public String getStops() {
        return Stops;
    }

    public void setStops(String stops) {
        Stops = stops;
    }

    public String getClasses() {
        return Classes;
    }

    public void setClasses(String classes) {
        Classes = classes;
    }

    public String getTimeSet() {
        return TimeSet;
    }

    public void setTimeSet(String timeSet) {
        TimeSet = timeSet;
    }

    public String getTimeReach() {
        return TimeReach;
    }

    public void setTimeReach(String timeReach) {
        TimeReach = timeReach;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}

