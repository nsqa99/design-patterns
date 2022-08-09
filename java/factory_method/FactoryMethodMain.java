package factory_method;

public class FactoryMethodMain {
  public static void main(String[] args) {
    EWalletService service = new ViettelPayService();
    service.makePayment();
  }
}
