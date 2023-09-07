package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class ProductTest
{
    @Test
    public void shouldCountQuantity()
    {
        Product p1 = new FoodProduct(6745, 5.50, "Penne Pasta", 250, LocalDate.parse("2024-04-05"));
        Product p2 = new FoodProduct(8853, 6.50, "Spaghetti Pasta", 300, LocalDate.parse("2024-04-05"));
        Product p3 = new FoodProduct(2106, 4.50, "Linguine Pasta", 300, LocalDate.parse("2024-08-08"));
        assertEquals(p3.getTotalQuantity(), 3);
    }
}
 