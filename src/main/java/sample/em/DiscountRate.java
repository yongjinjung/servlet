package sample.em;

public enum DiscountRate {
    TWENTIES(19, 0, 0),
    TEENAGERS(13, 350, 0.2),
    PRESCHOOLER(6, 350, 0.05),
    BABIES(0, 0, 1);

    private final int ageBaseline;
    private final int deducationFare;
    private final double discountRate;

    DiscountRate(int ageBaseline, int deducationFare, double discountRate) {
        this.ageBaseline = ageBaseline;
        this.deducationFare = deducationFare;
        this.discountRate = discountRate;
    }

    public static DiscountRate compareAgeBaseline(int age){
        if(TWENTIES.ageBaseline <= age){
            return TWENTIES;
        }

        if(TEENAGERS.ageBaseline <= age){
            return TEENAGERS;
        }

        if(PRESCHOOLER.ageBaseline <= age){
            return PRESCHOOLER;
        }


        return BABIES;
    }

    public int calculateFare(int currentFare){
        return (int) ((currentFare - deducationFare) * (1 - discountRate));
    }
}
