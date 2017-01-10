public class Bus{
  private int number;
  private Person[] passengers;

  public Bus(int number){
    this.number = number;
    this.passengers = new Person[10];
  }

  public int getNumber(){
    return this.number;
  }

  public int passengerCount(){
    int count = 0;
    for(Person person : passengers){
      if(person != null){
        count++;
      }
    }
    return count;
  }

  public void addPassenger(Person person){
    if(isBusFull()) return;
    int passengerCount = passengerCount();
    passengers[passengerCount] = person;
  }

  public boolean isBusFull(){
    return passengerCount() == passengers.length;
  }


}