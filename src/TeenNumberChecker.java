public class TeenNumberChecker {

    public static boolean hasTeen (int firstParameter, int secondParameter, int thirdParameter) {

       if (isTeen(firstParameter) || isTeen(secondParameter) || isTeen(thirdParameter)) {
           return true;
        } else {
           return false;
        }
    }

    public static boolean isTeen (int number) {

        if (number >= 13 && number <= 19) {
            return true;
        } else {
            return false;
        }
    }
}
