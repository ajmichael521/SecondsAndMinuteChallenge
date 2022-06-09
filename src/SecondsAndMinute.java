public class SecondsAndMinute {
    public static int getDurationString (int minutes, int seconds) {
       if(minutes <= 0 || seconds <= 0 && seconds >= 59) {
           System.out.println("invalid parameter");
       }

       int hours = minutes / 60;
     int nMinutes = minutes % 60;

        System.out.println(hours + "h " + nMinutes + "m " + seconds + "s");
        return hours;
    }
    public static  int getDurationString (int seconds) {
        if (seconds <= 0) {
            System.out.println("invalid value");
        }
      int  nMinutes = seconds / 60;
        int mSeconds = seconds  % 60;
        return getDurationString(nMinutes,mSeconds);
    }

}
