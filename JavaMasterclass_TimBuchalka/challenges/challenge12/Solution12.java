package challenges.challenge12;

public class Solution12 {
    public static boolean isCatPlaying(boolean summer, int temperature){
        if(summer){
            return temperature >= 25 && 45 >= temperature;
        } else {
            return temperature >= 25 && 35 >= temperature;
        }
    }

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }
}
