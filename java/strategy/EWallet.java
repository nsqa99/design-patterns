package strategy;

public class EWallet implements PayMethod {
  @Override
  public void integrate() {
    System.out.println("Integrate With EWallet");
  }

  @Override
  public void processTransaction() {
    System.out.println("Process Transaction With EWallet");
  }
}
