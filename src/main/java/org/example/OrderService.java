package org.example;

public class OrderService {

    public static Order getOrder(String orderId) {
        return new Order(orderId, "Laptop", 1);
    }
}
