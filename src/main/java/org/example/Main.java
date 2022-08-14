package org.example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        User user = new User("Name", "Surname", (short) 21);
        Product product = new Product("Apple", BigDecimal.valueOf(20));
        System.out.println("Created user!");
        System.out.println("Created product!");
    }
}