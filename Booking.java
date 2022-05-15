import java.util.ArrayList;


public class Booking {
    public void busDetails() {
        // create a collection class and store bus details
        Bus[] bus=null;
        ArrayList<Bus> busList= new ArrayList<>();
        busList.add(new Bus(111, "Chennai", "Banglore", 2000, 22));
        busList.add(new Bus(222, "Mumbai", "Pune", 1500, 28));
        busList.add(new Bus(333, "Chennai", "Hyderabad", 1000, 10));

        bus=new Bus[busList.size()];
        bus=busList.toArray(bus);
        System.out.println(
                String.format("%5s %15s %15s %5s %5s", "Bus Id", "Source", "Destination", "Price", "Seats Available"));

         for (Bus b:bus) {
        System.out.println(b);
        // System.out.println(String.format("%5s %15s %15s %5s %5s", ));
        }
    }

    public void bookSeats(int busId, String boarding, String destination, int price, int noOfSeats) {
        // calculate discount
    }
}
