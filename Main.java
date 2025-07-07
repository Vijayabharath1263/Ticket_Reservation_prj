import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in);) {
            boolean loop = true;
            while (loop) {
                System.out.println(
                        "1.  Book Your Tickets\n2.  Cancell Your Tickets\n3.  Available Tickets\n4.  PassengerDetails\n5.  Exit");

                int choice = scan.nextInt();

                switch (choice) {
                    case 1: {
                        BookTicket.booking();
                        break;
                    }
                    case 2: {
                        CancellTicket.cancellTicket();
                        break;
                    }
                    case 3: {
                        AvailableTickets.availableTickets();
                        break;
                    }
                    case 4: {
                        ShowBooking.showbooking();
                        break;
                    }
                    case 5: {
                        loop = false;
                    }
                    default: {
                        System.out.println("Invalid Request: Please Enter the Corrected Option");
                        break;
                    }
                }

            }
        }

    }
}
