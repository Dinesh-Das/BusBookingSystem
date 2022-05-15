
public class Bus {
    private int busId;
    private String boarding;
    private String destination;
    private int price;
    private int noOfSeats;

    public Bus() {

    }

    public Bus(int busId, String boarding, String destination, int price, int noOfSeats) {
        this.busId = busId;
        this.boarding = boarding;
        this.destination = destination;
        this.price = price;
        this.noOfSeats = noOfSeats;
    }

    public void setBusId(int busId) {
        this.busId = busId;
    }

    public int getBusId() {
        return busId;
    }

    public void setBoarding(String boarding) {
        this.boarding = boarding;
    }

    public String getBoarding() {
        return boarding;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestiation() {
        return destination;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%5s %15s %15s %5s %5s", busId, boarding, destination, price, noOfSeats);
        // return "%5s"+busId+"%15s"+boarding+"%15s"+destination+"%5s"+price+"%5s"+noOfSeats;
    }
}
