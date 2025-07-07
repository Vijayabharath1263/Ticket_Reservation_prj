
public class ShowBooking {

    public static void showbooking() {
        if (Tickets.stored_Details.size() == 0) {
            System.out.println("Sorry No Details Found:");
        } else {
            for (Passenger_Details p : Tickets.stored_Details.values()) {
                System.out.println("Passenger Id :" + p.passengerId);
                System.out.println("Passenger Name :" + p.name);
                System.out.println("Passenger Age :" + p.age);
                System.out.println("Passenger Gender :" + p.gender);
                System.out.println("Alloted Berth :" + p.number + p.alloted);
                System.out.println("child Name :" + p.cname);
                System.out.println("child Age :" + p.cage);
                System.out.println("-------------------------------------------------------------");
            }
            System.out.println();
        }
    }

}
