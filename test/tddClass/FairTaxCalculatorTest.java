package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FairTaxCalculatorTest {

    private FairTaxCalculator fairTaxCalculator;
    @BeforeEach
    void setUp(){
        fairTaxCalculator = new FairTaxCalculator();

    }

    @Test
    void testThatFairTaxCanBeCalculated(){
        //given
        Product product = new Product("milo",100.00);
        //when
        double tax = fairTaxCalculator.calculateTax(product.getPrice());
        //assert
        assertEquals(23.00,tax);
    }

    @Test
    void testThatProductsTotalPriceCanBeCalculated(){
        //given
        fairTaxCalculator.setTotalPrice(50.00);
        //when
        double totalPrice =  fairTaxCalculator.TotalPrice(30.00);
        //check
        assertEquals(80.00, totalPrice);
    }

}
