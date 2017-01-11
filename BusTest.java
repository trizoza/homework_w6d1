import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest{
  Bus bus;
  Person person;

  @Before
  public void before(){
    bus = new Bus(35);
    person = new Person();
  }

  @Test
  public void hasNumber(){
    assertEquals( 35, bus.getNumber() );
  }

  @Test
  public void hasNoPassengers(){
    assertEquals( 0, bus.passengerCount() );
  }

  @Test
  public void hasPassengers(){
    bus.addPassenger(person);
    assertEquals( 1, bus.passengerCount() );
  }

  @Test
  public void hasTooManyPassengers(){
    for(int i = 0; i < 100; i++){
      bus.addPassenger(person);
    }
    assertEquals( 75, bus.passengerCount() );
  }

}