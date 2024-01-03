import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class TravelPackage {
    private String name;
    private int passengerCapacity;

    private List<Destination> Itinerary;
    private List<Passenger> passengers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public List<Destination> getItinerary() {
        return Itinerary;
    }

    public void setItinerary(List<Destination> itinerary) {
        Itinerary = itinerary;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public TravelPackage(String name, int passengerCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.Itinerary = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    public void addDestination(Destination destination){
        Itinerary.add(destination);
    }
    public void addPassenger(Passenger passenger){
        passengers.add(passenger);
    }

    public void printItinerary() {
        System.out.println("Itinerary for : " + name + ":");

        for (Destination destination : Itinerary) {
            System.out.println("Destination : " + destination.getName());

            for (Activity activity : destination.getActivities()) {
                System.out.println("Activity : " + activity.getName() + " | Cost:" + activity.getCost() + " | Capacity:" + activity.getCapacity() + " | Description:" + activity.getDescription());
            }
        }
    }


        //print list of passengers List
        public void printPassengerList(){
            System.out.println("Passenger List for " + name + ":");
            System.out.println("Capacity: " + passengerCapacity + ", Enrolled Passengers: " + passengers.size());
            for (Passenger passenger : passengers) {
                System.out.println("  Passenger: " + passenger.getName() + ", Number: " + passenger.getPassengerNumber());
            }
        }

        //passenger details
     public void printPassengerDetails(Passenger passenger) {
            System.out.println("   Details for passenger " + passenger.getName() + " : ");
            System.out.println("Number :" + passenger.getPassengerNumber() + " Balance :" + passenger.balance);
            System.out.println(" Enrolled activites ");
            for (Activity activity : passenger.getActivities()) {
                System.out.println("Activity:" + activity.getName() + " at " + activity.destination.getName() + ",Cost:"
                        + activity.getCost());
            }
        }

    public void printAvilableActvites() {
        System.out.println("Avilable actvites for " + name + " :");
        for (Destination destination : Itinerary) {
            for (Activity activity : destination.getActivities()) {
                if (activity.hasAvailableSpace()) {
                    System.out.println(
                            "Activity: " + activity.getName() + " at " + destination.getName() + " ,cost " + activity.getCost()+",space available: "+activity.getCapacity());
                }
            }
        }
    }

}
