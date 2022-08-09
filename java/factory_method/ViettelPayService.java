package factory_method;

public class ViettelPayService extends EWalletService {
  @Override
  EWallet createEWallet() {
    return new ViettelPay();
  }
}
