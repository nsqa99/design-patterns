package decorator;

public class ChiaSeedsDecorator extends MilkTeaDecorator {
  public ChiaSeedsDecorator(MilkTea wrappee) {
    super(wrappee);
  }

  @Override
  public String getName() {
    return super.getName() + " Chia Seeds ($1.3)";
  }

  @Override
  public double getCost() {
    return super.getCost() + 1.3;
  }
}
