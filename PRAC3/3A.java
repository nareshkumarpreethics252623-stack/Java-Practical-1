package practical.no.pkg3;

class FlightOverbookedException extends Exception {
    public FlightOverbookedException(String message) {
        super(message);
    }
}

class LuggageWeightExceededException extends Exception {
    public LuggageWeightExceededException(String message) {
        super(message);
    }
}

class Flight {
    private int availableSeats;
    private final double maxLuggageWeight = 32.0; 

    public Flight(int initialSeats) {
        this.availableSeats = initialSeats;
    }

    public void bookTicket(String passengerName, double luggageWeight) 
            throws FlightOverbookedException, LuggageWeightExceededException {
        
        if (availableSeats <= 0) {
            throw new FlightOverbookedException("Booking Failed: No seats remaining on this flight.");
        }
        if (luggageWeight > maxLuggageWeight) {
            throw new LuggageWeightExceededException("Booking Failed for " + passengerName + 
                    ": Luggage weight (" + luggageWeight + "kg) exceeds safety limits of " + maxLuggageWeight + "kg.");
        }

        availableSeats--;
        System.out.println("Successfully booked ticket for " + passengerName + "! Remaining seats: " + availableSeats);
    }
}

// Main class to test the booking system
public class PRACTICALNO3{
    public static void main(String[] args) {
        Flight flight = new Flight(1); 

        try {
            System.out.println("--- Passenger 1 Booking Request ---");
            flight.bookTicket("Alice", 45.5); 
        } catch (FlightOverbookedException e) {
            System.out.println("Reservation System Alert: " + e.getMessage());
        } catch (LuggageWeightExceededException e) {
            System.out.println("Airport Check-in Alert: " + e.getMessage());
        }

        System.out.println();

        try {
            System.out.println("--- Passenger 2 and 3 Booking Requests ---");
            flight.bookTicket("Bob", 20.0);  
            flight.bookTicket("Charlie", 15.0); 
        } catch (FlightOverbookedException e) {
            System.out.println("Reservation System Alert: " + e.getMessage());
        } catch (LuggageWeightExceededException e) {
            System.out.println("Airport Check-in Alert: " + e.getMessage());
        }
    }
}
