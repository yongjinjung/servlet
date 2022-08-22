package sample.em;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountRateV2Test {

    @Test
    void calculateFare() {
        int result = DiscountRateV2.compareAgeBaseline(6).calculateFare(3000);
        System.out.println("result = " + result);
    }
}