package airlinereservation;

public class DomesticFlight extends Flight {

    private String flightType;

    public DomesticFlight(String flightNumber, String airlineName,
                          String source, String destination,
                          String date, String departureTime,
                          double fare, int availableSeats) {

        super(flightNumber, airlineName, source, destination,
              date, departureTime, fare, availableSeats);

        this.flightType = "Domestic";
    }

    @Override
    public void displayFlight() {

        super.displayFlight();

        System.out.println("Flight Type     : " + flightType);
    }
}