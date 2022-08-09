package decorator;

public class DecoratorMain {
  public static void main(String[] args) {
    // Order: Milk Tea with Yarns Bubble, Lychee Jelly and Chia Seeds
    MilkTea milkTea = new YarnsBubbleDecorator(new LycheeJellyDecorator(new ChiaSeedsDecorator(new NormalMilkTea())));
    System.out.println(milkTea.getName());
    System.out.println(milkTea.getCost());
  }
}
