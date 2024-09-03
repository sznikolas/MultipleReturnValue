package org.example;

public class PaymentService {

    public static PaymentDetails getPaymentDetails (String orderId) {
        return new PaymentDetails("Credit card", "transacion12345");

    }
}
