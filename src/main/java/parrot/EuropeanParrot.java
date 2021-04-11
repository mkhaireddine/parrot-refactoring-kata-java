package parrot;

public class EuropeanParrot extends Parrot {

  public EuropeanParrot(int numberOfCoconuts, double voltage, boolean isNailed) {
    super(ParrotTypeEnum.EUROPEAN, numberOfCoconuts, voltage, isNailed);
  }

  @Override
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

  @Override
  protected double getBaseSpeed(double voltage) {
    return Math.min(24.0, voltage * getBaseSpeed());
  }

  @Override
  protected double getLoadFactor() {
    return 9.0;
  }

  @Override
  protected double getBaseSpeed() {
    return 12.0;
  }
}
