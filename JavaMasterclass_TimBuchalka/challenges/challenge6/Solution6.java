package challenges.challenge6;

public class Solution6 {
    public static boolean areEqualByThreeDecimalPlaces(double a, double b){
        a *= 1000;
        b *= 1000;

        return (int) a == (int) b;
    }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }
}
