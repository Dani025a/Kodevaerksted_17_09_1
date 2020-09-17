public class ShowCurrentTime {
    public static void main(String[] args) {

        long totalMilliSekunder = System.currentTimeMillis();
        BeregningerTilUr(totalMilliSekunder);
    }
    public static void BeregningerTilUr(long totalMilliSekunder){
        long totalSekunder = totalMilliSekunder / 1000;
        long sekunderNu = totalSekunder % 60;
        long totalMinuter = totalSekunder / 60;
        long minuterNu = totalMinuter % 60;
        long totalTimer = totalMinuter / 60;
        long timerNu = totalTimer % 24;
        System.out.println("Current time is " + timerNu + ":" + minuterNu + ":" + sekunderNu + " GMT");
    }
}
