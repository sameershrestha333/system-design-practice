package lld.designpattern.structural.adapter;

// Target interface — payment contract expected by the application
public interface PaymentProcess {
    void pay(PaymentRequest paymentRequest);
}
