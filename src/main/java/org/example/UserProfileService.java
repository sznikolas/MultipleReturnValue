package org.example;

public class UserProfileService {

    public static ShippingDetails getShippingDetails(String userId) {
        return new ShippingDetails("123 Tech Lane, Silicon Valley","2024-08-18", "TRACK1235");
     }
}
