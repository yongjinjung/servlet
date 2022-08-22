package sample.em;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.function.IntPredicate;

public enum DiscountRateV2 {

    TWENTIES(0, 0, (age) -> 19 <= age),
    TEENAGERS(350, 0.2, (age) -> 13 <= age),
    PRESCHOOLER(350, 0.5, (age) -> 6 <= age),
    BABIES(0, 1, (age) -> 6 > age);


    private final int deducationFare;
    private final double discountRate;
    private final IntPredicate predicate;

    DiscountRateV2(int deducationFare, double discountRate, IntPredicate predicate) {

        this.deducationFare = deducationFare;
        this.discountRate = discountRate;
        this.predicate = predicate;
    }

    public static DiscountRateV2 compareAgeBaseline(int age){

        return Arrays.stream(values()).filter(discountRateV2 -> discountRateV2.predicate.test(age))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException(" 해당하는 DiscountRate 객체가 없습니다."));
    }

    public int calculateFare(int currentFare){
        return (int) ((currentFare - deducationFare) * (1 - discountRate));
    }
}
