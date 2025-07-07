import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Tickets {

    static int available_Lower_Berth = 3;
    static int available_Middle_Berth = 3;
    static int available_Upper_Berth = 3;

    static int availabe_RAC = 1;
    static int available_Waiting = 1;

    static List<Integer> lower_List = new ArrayList<Integer>(Arrays.asList(1, 2, 3));

    static List<Integer> middle_List = new ArrayList<Integer>(Arrays.asList(1, 2, 3));

    static List<Integer> upper_List = new ArrayList<Integer>(Arrays.asList(1, 2, 3));

    static List<Integer> rac_List = new ArrayList<Integer>(Arrays.asList(1, 2, 3));

    static List<Integer> waiting_List = new ArrayList<Integer>(Arrays.asList(1,2,3));

    static List<Integer> booked_List = new ArrayList<Integer>();

    static Queue<Integer> rac = new LinkedList<Integer>();

    static Queue<Integer> waiting = new LinkedList<Integer>();

    static Map<Integer, Passenger_Details> stored_Details = new HashMap<Integer, Passenger_Details>();


}
