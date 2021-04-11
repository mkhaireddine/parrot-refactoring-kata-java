package parrot;

public class NorwegianBlueParrot extends Parrot {

  public NorwegianBlueParrot(int numberOfCoconuts, double voltage, boolean isNailed) {
    super(ParrotTypeEnum.NORWEGIAN_BLUE, numberOfCoconuts, voltage, isNailed);
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

}
