package DispatchSnacks;

public class DispatchCalculator {
    public static int wage(int collectionRate) {
        if (collectionRate < 0) {
            throw new IllegalArgumentException("collection rate can not be less than  0");
        }
        if (collectionRate < 50) {
            return collectionRate * 160 + 5000;
        } else if (collectionRate < 60) {
            return collectionRate * 200 + 500;
        }
        {
            return collectionRate * 250 + 500;
        }
    }
}