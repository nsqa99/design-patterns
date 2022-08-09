package decorator;

public class LycheeJellyDecorator extends MilkTeaDecorator {
  public LycheeJellyDecorator(MilkTea wrappee) {
    super(wrappee);
  }

  @Override
  public String getName() {
    return super.getName() + " Lychee Jelly ($1.5)";
  }

  @Override
  public double getCost() {
    return super.getCost() + 1.5;
  }
}
