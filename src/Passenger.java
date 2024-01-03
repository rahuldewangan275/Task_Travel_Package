import java.util.ArrayList;
import java.util.List;

public class Passenger {
   private String name;
   private int passengerNumber;
   double balance;
   private PassengerType passengerType;
   private List<Activity> activities;

   public Passenger(String name, int passengerNumber, PassengerType passengerType,double balance){
      this.name=name;
      this.passengerNumber=passengerNumber;
      this.passengerType = passengerType;
      this.balance=balance;
      this.activities = new ArrayList<>();
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getPassengerNumber() {
      return passengerNumber;
   }

   public void setPassengerNumber(int passengerNumber) {
      this.passengerNumber = passengerNumber;
   }

   public double getBalance() {
      return balance;
   }

   public void setBalance(double balance) {
      this.balance = balance;
   }

   public PassengerType getPassengerType() {
      return passengerType;
   }

   public void setPassengerType(PassengerType passengerType) {
      this.passengerType = passengerType;
   }

   public List<Activity> getActivities() {
      return activities;
   }

   public void setActivities(List<Activity> activities) {
      this.activities = activities;
   }

   public boolean hasSufficientBalance(double cost) {
      return balance >= cost;
   }
   void deductBalance(double cost) {
      balance -= cost;
   }


}
