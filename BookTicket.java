import java.util.Scanner;

public class BookTicket {

    public static void booking() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Name:");
        String name = scan.next();
        System.out.println("Age:");
        int age = scan.nextInt();
        System.out.println("Gender:");
        String gender = scan.next();

        if (gender.equals("F")) {
            System.out.println("1.Have a Child:\n2.Single:");
            int cchoice = scan.nextInt();
            if (cchoice == 1) {
                System.out.println("ChildName:");
                String cname = scan.next();
                System.out.println("ChildrenAge:");
                int cage = scan.nextInt();
                System.out.println("Berth Preference {L,M,U} :");
                String bp = scan.next();
                Passenger_Details p = new Passenger_Details(name, age, cname, cage, bp, gender);
                booking(p);
            } else if (cchoice == 2) {
                System.out.println("Berth Preference {L,M,U} :");
                String bp = scan.next();
                String cname = "null";
                int cage = 0;
                Passenger_Details p = new Passenger_Details(name, age, cname, cage, bp, gender);
                booking(p);
            }

        }
        if (gender.equals("M")) {
            System.out.println("Berth Preference {L,M,U}");
            String bp = scan.next();
            String cname = "null";
            int cage = 0;
            Passenger_Details p = new Passenger_Details(name, age, cname, cage, bp, gender);
            booking(p);
        }

        return;

    }

    public static void booking(Passenger_Details p) {

        if (p.bp.equals("L") && Tickets.available_Lower_Berth > 0
                || p.bp.equals("M") && Tickets.available_Middle_Berth > 0
                || p.bp.equals("U") && Tickets.available_Upper_Berth > 0) {
            System.out.println("Available Berth:");

            if ((p.bp.equals("L")) && (Tickets.available_Lower_Berth > 0)) {
                System.out.println("Lower Berth Given:");
                BookTicket.bookTicket(p, Tickets.lower_List.get(0), "L");
                Tickets.lower_List.remove(0);
                Tickets.available_Lower_Berth--;
            }

            else if ((p.bp.equals("M")) && (Tickets.available_Middle_Berth > 0)) {
                System.out.println("Middle Berth Given:");
                BookTicket.bookTicket(p, Tickets.middle_List.get(0), "M");
                Tickets.lower_List.remove(0);
                Tickets.available_Middle_Berth--;
            }

            else if ((p.bp.equals("U")) && (Tickets.available_Upper_Berth > 0)) {
                BookTicket.bookTicket(p, Tickets.upper_List.get(0), "U");
                Tickets.upper_List.remove(0);
                Tickets.available_Upper_Berth--;
            }

        } // Available Berth Conditions:

        else if (Tickets.available_Lower_Berth > 0) {
            System.out.println("Lower Berth Available:");
            BookTicket.bookTicket(p, Tickets.lower_List.get(0), "L");
            Tickets.lower_List.remove(0);
            Tickets.available_Lower_Berth--;
        }

        else if (Tickets.available_Middle_Berth > 0) {
            System.out.println("Middle Berth Available:");
            BookTicket.bookTicket(p, Tickets.middle_List.get(0), "M");
            Tickets.middle_List.remove(0);
            Tickets.available_Lower_Berth--;
        }

        else if (Tickets.available_Upper_Berth > 0) {
            System.out.println("Upper Berth Available:");
            BookTicket.bookTicket(p, Tickets.upper_List.get(0), "L");
            Tickets.upper_List.remove(0);
            Tickets.available_Upper_Berth--;
        }

        else if (Tickets.availabe_RAC > 0) {
            System.out.println("RAC:");
            BookTicket.bookTicket(p, Tickets.rac_List.get(0), "RAC");
            Tickets.rac_List.remove(0);
            Tickets.availabe_RAC--;
        }

        else if (Tickets.available_Waiting > 0) {
            System.out.println("You Are Waiting List:");
            BookTicket.bookTicket(p, Tickets.waiting_List.get(0), "Waiting");
            Tickets.waiting_List.remove(0);
            Tickets.available_Waiting--;
        }

        return;
    }

    public static void bookTicket(Passenger_Details p, int snumber, String allotedBerth) {

        p.number = snumber;
        p.alloted = allotedBerth;
        Tickets.stored_Details.put(p.passengerId, p);
        Tickets.booked_List.add(p.passengerId);

        System.out.println("Passenger Id:" + p.passengerId);
        System.out.println("Passenger Name:" + p.name);
        System.out.println("Passenger Age:" + p.age);
        System.out.println("passenger Gender:" + p.gender);
        System.out.println("Alloted Berth:" + snumber + allotedBerth);
        System.out
                .println("\t------Your Ticket Was Successfully Booked------");

    }

}
