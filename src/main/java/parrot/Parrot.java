package parrot;

public class Parrot {

  private final ParrotTypeEnum type;
  private final int numberOfCoconuts;
  private final double voltage;
  private final boolean isNailed;

  Parrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
    this.type = type;
    this.numberOfCoconuts = numberOfCoconuts;
    this.voltage = voltage;
    this.isNailed = isNailed;
  }

  public static Parrot createParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
    return switch (type) {
      case EUROPEAN -> new EuropeanParrot(numberOfCoconuts, voltage, isNailed);
      case AFRICAN -> new AfricanParrot(numberOfCoconuts, voltage, isNailed);
      case NORWEGIAN_BLUE -> new NorwegianBlueParrot(numberOfCoconuts, voltage, isNailed);
    };
  }


  public double getSpeed() {
    switch (type) {
      case EUROPEAN:
        return getBaseSpeed();
      case AFRICAN:
        return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
      case NORWEGIAN_BLUE:
        return (isNailed) ? 0 : getBaseSpeed(voltage);
      default:
        throw new RuntimeException("Should be unreachable");
    }
  }

  private double getBaseSpeed(double voltage) {
    return Math.min(24.0, voltage * getBaseSpeed());
  }

  private double getLoadFactor() {
    return 9.0;
  }

  private double getBaseSpeed() {
    return 12.0;
  }

}
