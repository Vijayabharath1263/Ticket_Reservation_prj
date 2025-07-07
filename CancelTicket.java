import java.util.Scanner;

public class CancellTicket {

    public static void cancellTicket() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Passenger ID :");
        int id = scan.nextInt();

        if (!Tickets.stored_Details.containsKey(id)) {
            System.out.println("Invalid ID:");
        } else {
            cancellationProcess(id);
        }
        
        
    }

    public static void cancellationProcess(int id) {
        Passenger_Details p = Tickets.stored_Details.get(id);
        Tickets.booked_List.remove(Integer.valueOf(id));
        int psnumber = p.number;
        System.out.println("Your Ticket Was cancelled :");
    }

}
