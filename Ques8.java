import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ques8 {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
        Calendar calendar = Calendar.getInstance();
        System.out.println("The date today: " + simpleDateFormat.format(calendar.getTime()));
    }
}
