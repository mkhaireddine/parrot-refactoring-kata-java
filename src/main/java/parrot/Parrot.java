package parrot;

public abstract class Parrot {

  final ParrotTypeEnum type;
  final int numberOfCoconuts;
  final double voltage;
  final boolean isNailed;

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


  public abstract double getSpeed();

  protected abstract double getBaseSpeed(double voltage);

  protected abstract double getLoadFactor();

  protected abstract double getBaseSpeed();

}
