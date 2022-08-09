package decorator;

public class YarnsBubbleDecorator extends MilkTeaDecorator {
  public YarnsBubbleDecorator(MilkTea wrappee) {
    super(wrappee);
  }

  @Override
  public String getName() {
    return super.getName() + " Yarns Bubble ($1.4)";
  }

  @Override
  public double getCost() {
    return super.getCost() + 1.4;
  }
}
