public class Time {
    public static void main(String [] args){
        double milli = System.currentTimeMillis();
        double seconds = milli/1000;
        double currsec = seconds%60;
        double min = seconds/60;
        double currmin = min%60;
        double hours = min/60;
        double currhr = hours%24;

        System.out.format("Current time is %.0f:%.0f:%.0f GMT\n",Math.floor(currhr),Math.floor(currmin),currsec);

    }
}
