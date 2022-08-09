package strategy;

public class InternetBanking implements PayMethod {
  @Override
  public void integrate() {
    System.out.println("Integrate With Internet Banking");
  }

  @Override
  public void processTransaction() {
    System.out.println("Process Transaction With Internet Banking");
  }
}
