package strategy;

public class PaymentService {
  private PayMethod payMethod;

  public void setPayMethod(PayMethod payMethod) {
    this.payMethod = payMethod;
  }

  public void makePayment() {
    payMethod.integrate();
    payMethod.processTransaction();
  }
}
