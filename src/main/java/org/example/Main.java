package org.example;

import org.apache.commons.lang3.tuple.MutablePair;
import org.apache.commons.lang3.tuple.MutableTriple;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.tuple.Triple;

public class Main {

    //Using apache commons lang to get multiple return values instead of Map
    // Pair - 2 return value
    // Triple - 3 return value
    public static Pair<Order, ShippingDetails> getOrderInfo(String orderId) {
        Order order = OrderService.getOrder(orderId);
        ShippingDetails shippingDetails = UserProfileService.getShippingDetails("john");
        //IMMUTABLE
        return Pair.of(order, shippingDetails);
        //MUTABLE
//        return MutablePair.of(order, shippingDetails);
    }

    public static Triple<Order, ShippingDetails, PaymentDetails> getOrderInfoWithTx(String orderId) {
        Order order = OrderService.getOrder(orderId);
        ShippingDetails shippingDetails = UserProfileService.getShippingDetails("john");
        PaymentDetails paymentDetails = PaymentService.getPaymentDetails(orderId);
        //IMMUTABLE
        return Triple.of(order, shippingDetails, paymentDetails);
        //MUTABLE
//        return MutableTriple.of(order, shippingDetails, paymentDetails);
    }

    public static void main(String[] args) {
        Pair<Order, ShippingDetails> orderInfo = getOrderInfo("ORD123");
        System.out.println("Order details: " + orderInfo.getLeft());
        System.out.println("Shipping details: " + orderInfo.getRight());

        System.out.println("--------------------------");

        Triple<Order, ShippingDetails, PaymentDetails> orderInfoWithTriple = getOrderInfoWithTx("ORD123");
        System.out.println("Order details: " + orderInfoWithTriple.getLeft());
        System.out.println("Shipping details: " + orderInfoWithTriple.getMiddle());
        System.out.println("Payment details: " + orderInfoWithTriple.getRight());

    }
}