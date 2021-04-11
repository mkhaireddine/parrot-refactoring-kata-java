package parrot;

public class AfricanParrot extends Parrot {

  public AfricanParrot(int numberOfCoconuts, double voltage, boolean isNailed) {
    super(ParrotTypeEnum.AFRICAN, numberOfCoconuts, voltage, isNailed);
  }

  @Override
  public double getSpeed() {
    return Math.max(0, getBaseSpeed() - getLoadFactor() * numberOfCoconuts);
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
