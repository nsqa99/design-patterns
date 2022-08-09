package strategy;

public class Paypal implements PayMethod {
  @Override
  public void integrate() {
    System.out.println("Integrate With Paypal");
  }

  @Override
  public void processTransaction() {
    System.out.println("Process Transaction With Paypal");
  }
}
