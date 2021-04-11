package parrot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ParrotTest {

  @Test
  public void getSpeedOfEuropeanParrot() {
    Parrot parrot = Parrot.createEuropeanParrot();
    assertEquals(12.0, parrot.getSpeed(), 0.0);
  }

  @Test
  public void getSpeedOfAfricanParrot_With_One_Coconut() {
    Parrot parrot = Parrot.createAfricanParrot(1);
    assertEquals(3.0, parrot.getSpeed(), 0.0);
  }

  @Test
  public void getSpeedOfAfricanParrot_With_Two_Coconuts() {
    Parrot parrot = Parrot.createAfricanParrot(2);
    assertEquals(0.0, parrot.getSpeed(), 0.0);
  }

  @Test
  public void getSpeedOfAfricanParrot_With_No_Coconuts() {
    Parrot parrot = Parrot.createAfricanParrot(0);
    assertEquals(12.0, parrot.getSpeed(), 0.0);
  }

  @Test
  public void getSpeedNorwegianBlueParrot_nailed() {
    Parrot parrot = Parrot.createNorwegianParrot(true, 1.5);
    assertEquals(0.0, parrot.getSpeed(), 0.0);
  }

  @Test
  public void getSpeedNorwegianBlueParrot_not_nailed() {
    Parrot parrot = Parrot.createNorwegianParrot(false, 1.5);
    assertEquals(18.0, parrot.getSpeed(), 0.0);
  }

  @Test
  public void getSpeedNorwegianBlueParrot_not_nailed_high_voltage() {
    Parrot parrot = Parrot.createNorwegianParrot(false, 4);
    assertEquals(24.0, parrot.getSpeed(), 0.0);
  }
}
