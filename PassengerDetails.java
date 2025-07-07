public class Passenger_Details {
    String name;
    int age;
    static int iD = 1;
    String gender;
    String cname;
    int cage;
    String bp;
    String alloted;
    int passengerId = iD++;
    int number;

    public Passenger_Details(String name, int age, String cname, int cage, String bp, String gender) {
        this.name = name;
        this.age = age;
        this.cname = cname;
        this.cage = cage;
        this.gender = gender;
        this.bp = bp;
        this.alloted = " ";
        this.number = -1;
    }

}
