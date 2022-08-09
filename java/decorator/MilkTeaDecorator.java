package decorator;

public class MilkTeaDecorator implements MilkTea {
  private final MilkTea wrappee;

  public MilkTeaDecorator(MilkTea wrappee) {
    this.wrappee = wrappee;
  }

  @Override
  public String getName() {
    return wrappee.getName();
  }

  @Override
  public double getCost() {
    return wrappee.getCost();
  }
}
