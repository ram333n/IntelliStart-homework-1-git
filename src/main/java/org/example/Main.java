package org.example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Apple", BigDecimal.valueOf(20));
        System.out.println("Created product!");
    }
}