package factory_method;

public class ZaloPay implements EWallet {
  @Override
  public void prepareIntegration() {
    System.out.println("Integrate ZaloPay");
  }

  @Override
  public void processTransaction() {
    System.out.println("Process transaction in ZaloPay way");
  }
}
