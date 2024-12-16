import java.util.ArrayList;
import java.util.Scanner;

class Ticket {
    private int ticketId;
    private String passengerName;
    private String trainName;
    private String destination;
    private int seatNumber;

    public Ticket(int ticketId, String passengerName, String trainName, String destination, int seatNumber) {
        this.ticketId = ticketId;
        this.passengerName = passengerName;
        this.trainName = trainName;
        this.destination = destination;
        this.seatNumber = seatNumber;
    }

    public void displayTicket() {
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Train Name: " + trainName);
        System.out.println("Destination: " + destination);
        System.out.println("Seat Number: " + seatNumber);
    }
}

public class RailwayBookingSystem {
    private static ArrayList<Ticket> tickets = new ArrayList<>();
    private static int ticketCounter = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Railway Ticket Booking System ---");
            System.out.println("1. Book Ticket");
            System.out.println("2. View Tickets");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    bookTicket(scanner);
                    break;
                case 2:
                    viewTickets();
                    break;
                case 3:
                    running = false;
                    System.out.println("Exiting the system. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    private static void bookTicket(Scanner scanner) {
        System.out.println("\n--- Book Ticket ---");
        System.out.print("Enter Passenger Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Train Name: ");
        String trainName = scanner.nextLine();
        System.out.print("Enter Destination: ");
        String destination = scanner.nextLine();
        System.out.print("Enter Seat Number: ");
        int seatNumber = scanner.nextInt();

        Ticket ticket = new Ticket(ticketCounter++, name, trainName, destination, seatNumber);
        tickets.add(ticket);
        System.out.println("Ticket booked successfully!");
    }

    private static void viewTickets() {
        System.out.println("\n--- Booked Tickets ---");
        if (tickets.isEmpty()) {
            System.out.println("No tickets booked yet.");
        } else {
            for (Ticket ticket : tickets) {
                ticket.displayTicket();
                System.out.println("---------------------");
            }
        }
    }
}