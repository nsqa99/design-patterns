package decorator;

public class BlackBubbleDecorator extends MilkTeaDecorator {
  public BlackBubbleDecorator(MilkTea wrappee) {
    super(wrappee);
  }

  @Override
  public String getName() {
    return super.getName() + " Black Bubble ($1.2)";
  }

  @Override
  public double getCost() {
    return super.getCost() + 1.2;
  }
}
