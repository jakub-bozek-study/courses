package challenges.challenge5;

public class Solution5 {
    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999 || year % 4 != 0) return false;
        return (year % 100 != 0) || year % 400 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
    }
}
