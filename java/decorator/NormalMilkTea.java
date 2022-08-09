package decorator;

public class NormalMilkTea implements MilkTea {
  @Override
  public String getName() {
    return "Milk tea ($9.99)";
  }

  @Override
  public double getCost() {
    return 9.99;
  }
}
