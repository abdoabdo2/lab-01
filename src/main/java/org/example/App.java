package org.example;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        Product p1 = new FoodProduct(6745, 5.50, "Penne Pasta", 200.3, LocalDate.parse("2024-01-01"));
        Product p2 = new FoodProduct(8853, 6.50, "Spaghetti Pasta", 300.2, LocalDate.parse("2024-01-01"));
        Product p3 = new FoodProduct(2106, 4.50, "Linguine Pasta", 232.1, LocalDate.parse("2024-01-01"));
        System.out.println("Total Quantity: " + p3.getTotalQuantity());

        Product p4 = new FoodProduct(1234, 9.99, "water", 34.5, LocalDate.parse("2024-04-05"));
        FoodProduct p5 = new FoodProduct(3452, 10.0, "Cheddar Cheese", 12.3,
                LocalDate.parse("2022-06-07"));
        ElectricProduct p6 = new ElectricProduct(4875, 30.0, "Extension cord", 45.0, "220v");

        Product[] product = {p1, p2, p3, p4, p5, p6};

        for (Product p : product){
            System.out.println(p);
        }

        p1.setWeight(-1);


    }
}
