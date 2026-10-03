package airlinereservation;

public class Flight {

    private String flightNumber;
    private String airlineName;
    private String source;
    private String destination;
    private String date;
    private String departureTime;
    private double fare;
    private int availableSeats;

    // Constructor
    public Flight(String flightNumber, String airlineName, String source,
                  String destination, String date, String departureTime,
                  double fare, int availableSeats) {

        this.flightNumber = flightNumber;
        this.airlineName = airlineName;
        this.source = source;
        this.destination = destination;
        this.date = date;
        this.departureTime = departureTime;
        this.fare = fare;
        this.availableSeats = availableSeats;
    }

    // Getters
    public String getFlightNumber() {
        return flightNumber;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public String getDate() {
        return date;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public double getFare() {
        return fare;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    // Display flight details
    public void displayFlight() {
        System.out.println("Flight Number   : " + flightNumber);
        System.out.println("Airline         : " + airlineName);
        System.out.println("Source          : " + source);
        System.out.println("Destination     : " + destination);
        System.out.println("Date            : " + date);
        System.out.println("Departure Time  : " + departureTime);
        System.out.println("Fare            : " + fare);
        System.out.println("Available Seats : " + availableSeats);
    }

    // Check seat availability
    public boolean checkAvailability() {
        return availableSeats > 0;
    }

    // Reduce seats when booking
    public boolean bookSeat() {

        if (availableSeats > 0) {
            availableSeats--;
            return true;
        }

        return false;
    }

    // Increase seats when cancelling
    public void cancelSeat() {
        availableSeats++;
    }
}