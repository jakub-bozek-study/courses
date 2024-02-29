package challenges.challenge4;

public class Solution4 {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(!barking || hourOfDay < 0 || hourOfDay > 23) return false;
        if(hourOfDay < 8 || hourOfDay > 22) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
    }
}
