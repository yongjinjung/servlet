package sample.em;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountRateTest {

    @Test
    void calculateFare() {

        int result = DiscountRate.compareAgeBaseline(6).calculateFare(2000);
        System.out.println("result = " + result);
    }
}