package strategy;

public class StrategyMain {
  public static void main(String[] args) {
    PaymentService paymentService = new PaymentService();
    PayMethod payWithInternetBanking = new InternetBanking();
    paymentService.setPayMethod(payWithInternetBanking);
    paymentService.makePayment();
  }
}
