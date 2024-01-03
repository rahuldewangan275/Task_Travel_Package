
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //create a travel Package with a capacity of 10
        TravelPackage travelPackage = new TravelPackage("Package-A",10);

        //create destination
        Destination dubai = new Destination("Dubai");
        Destination thailand = new Destination("thailand");
        Destination banglore = new Destination("Banglore");


        //create activities
Activity skyDiving = new Activity("Sky_Diving","sky diving in dubai",3000,10,dubai);
Activity thaiMassage = new Activity("Thai_Massage","professtional thailand special massage",2000,20,dubai);
Activity templeVisit = new Activity("Temple-Visiting","visiting the oldes temples in Banglore old city",3000,10,dubai);

//add activities to destination
dubai.addActivity(skyDiving);
thailand.addActivity(thaiMassage);
banglore.addActivity(templeVisit);

//add destinations to travel Package
travelPackage.addDestination(dubai);
travelPackage.addDestination(thailand);
travelPackage.addDestination(banglore);

//create passengers with amount 5000
Passenger rahul = new Passenger("Rahul",1,PassengerType.STANDARD,5000);
Passenger kunal = new Passenger("Kunal",2,PassengerType.GOLD,5000);
Passenger ekant = new Passenger("Ekant",3,PassengerType.PREMIUM,5000);


        // addd passengers to travel package
        travelPackage.addPassenger(rahul);
        travelPackage.addPassenger(kunal);
        travelPackage.addPassenger(ekant);

        //1. Print itinerary of the travel package
        travelPackage.printItinerary();

        //2.Print the passenger list of the travel package including:
        travelPackage.printPassengerList();

        //signup for activity
        thaiMassage.registerActivity(rahul);
        skyDiving.registerActivity(kunal);
        templeVisit.registerActivity(ekant);

        //3. Print the details of an individual passenger
        travelPackage.printPassengerDetails(rahul);
        travelPackage.printPassengerDetails(kunal);
        travelPackage.printPassengerDetails(ekant);

       //Print the details of all the activities that still have spaces available, including how many spaces are available.
        travelPackage.printAvilableActvites();


    }
}