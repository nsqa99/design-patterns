package factory_method;

public abstract class EWalletService {
  public void makePayment() {
    EWallet eWallet = createEWallet();
    eWallet.prepareIntegration();
    eWallet.processTransaction();
  }

  abstract EWallet createEWallet();
}
