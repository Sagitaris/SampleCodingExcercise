public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces (double firstParameter, double secondParameter) {

        if ((int)(firstParameter * 1000) == (int)(secondParameter * 1000)){
            return true;
        } else {
            return false;
        }
    }
}
