public class PlayingCat {
    public static void main (String args []) {
        boolean result = isCatPlaying ( false, 35 );
        System.out.println(result);

    }
    public static boolean isCatPlaying(boolean summer, int temperature){
        boolean t = false;
           if (temperature >= 25) {
                if (temperature <= 35) return t = true;
            }
            return t;

}
