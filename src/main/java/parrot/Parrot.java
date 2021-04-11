package parrot;

public abstract class Parrot {

  static final double BASE_SPEED = 12.0;

  static Parrot createAfricanParrot(int numberOfCoconuts) {
    return new AfricanParrot(numberOfCoconuts);
  }

  static Parrot createNorwegianParrot(boolean isNailed, double voltage) {
    return new NorwegianBlueParrot(voltage, isNailed);
  }

  static Parrot createEuropeanParrot() {
    return new EuropeanParrot();
  }


  public abstract double getSpeed();

}
