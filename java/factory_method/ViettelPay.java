package factory_method;

public class ViettelPay implements EWallet {
  @Override
  public void prepareIntegration() {
    System.out.println("Integrate ViettelPay");
  }

  @Override
  public void processTransaction() {
    System.out.println("Process transaction in ViettelPay way");
  }
}
