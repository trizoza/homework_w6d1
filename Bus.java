import java.util.*;

public class Bus{

  private int number;
  private ArrayList<Person> passengers;

  public Bus(int number){
    this.number = number;
    this.passengers = new ArrayList<Person>();
  }

  public int getNumber(){
    return this.number;
  }

  public int passengerCount(){
    return passengers.size();
  }

  public void addPassenger(Person person){
    if (passengerCount() < 75){
      passengers.add(person);
    }
  }

  public boolean isBusFull(){
    return passengerCount() == 75;
  }

}