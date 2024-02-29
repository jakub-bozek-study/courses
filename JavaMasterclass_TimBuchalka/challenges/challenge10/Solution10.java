package challenges.challenge10;

public class Solution10 {
    public static void printYearsAndDays(long minutes){
        if(minutes < 0) System.out.println("Invalid Value");
        else {
            int hour = (int) (minutes / 60);
            int day = hour / 24;
            int year = day / 365;
            day = day % 365;
            System.out.println(minutes + " min = " + year + " y and " + day + " d");
        }

    }

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
}
