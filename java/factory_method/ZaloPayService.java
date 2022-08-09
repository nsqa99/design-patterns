package factory_method;

public class ZaloPayService extends EWalletService {
  @Override
  EWallet createEWallet() {
    return new ZaloPay();
  }
}
