public class Activity {
    private String name;
    private String description;
    private double cost;
    private int capacity;
    Destination destination;

    public  Activity(String name, String description, double cost, int capacity, Destination destination) {
    this.name = name;
    this.description = description;
    this.cost = cost;
    this.capacity = capacity;
    this.destination = destination;
}
    public boolean hasAvailableSpace(){
        return capacity>0;
    }
    public void registerActivity(Passenger passenger) {
        double c = cost;
        if(PassengerType.GOLD == passenger.getPassengerType()){
            double v = cost/10;
            c=cost-v;
        } else if (PassengerType.PREMIUM ==passenger.getPassengerType()) {
            c=0;
        }

        if (hasAvailableSpace() && passenger.hasSufficientBalance(c)) {
            passenger.deductBalance(c);
            capacity--;
            passenger.getActivities().add(this);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }
}
