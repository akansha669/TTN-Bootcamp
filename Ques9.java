import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ques9 {
    public static void main(String[] args) {
        //defining different date forms according to zones
        SimpleDateFormat s1 = new SimpleDateFormat("d/M/yyyy hh:mm:ss a z");
        SimpleDateFormat s2 = new SimpleDateFormat("M/d/yyyy");
        SimpleDateFormat s3 = new SimpleDateFormat("d/MM/yyyy");
        SimpleDateFormat s4 = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat s5 = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat s6 = new SimpleDateFormat("yyyy-M-d");
        Calendar calendar = Calendar.getInstance();//return Calendar instance based on current time in that zone
        System.out.println("India: " + s1.format(calendar.getTime()));//return time
        System.out.println("United States: " + s2.format(calendar.getTime()));
        System.out.println("Australia: " + s3.format(calendar.getTime()));
        System.out.println("Russia: " + s4.format(calendar.getTime()));
        System.out.println("Japan: " + s5.format(calendar.getTime()));
        System.out.println("China: " + s6.format(calendar.getTime()));
    }
}
