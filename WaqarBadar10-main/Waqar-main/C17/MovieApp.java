package C17;

// Problem: Create a class to manage simple movie ticket booking.

class Movie {
    String title; int availableSeats;
    Movie(String title, int seats) {
        this.title = title; this.availableSeats = seats;
    }

    void bookTicket(int seats) {
        if (seats <= availableSeats) {
            availableSeats -= seats;
            System.out.println("Booked " + seats + " seat(s) for " + title);
        } else {
            System.out.println("Not enough seats available!");
        }
    }
}

public class MovieApp {
    public static void main(String[] args) {
        Movie m = new Movie("Avengers", 5);
        m.bookTicket(2); // Book 2
        m.bookTicket(4); // Try booking 4 (should fail)
    }
}

/* Output:
Booked 2 seat(s) for Avengers
Not enough seats available!
*/
