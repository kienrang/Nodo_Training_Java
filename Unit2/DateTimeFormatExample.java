
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class DateTimeFormatExample {
    public static void main(String[] args) {
        Locale locale = new Locale("vi", "VN");
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd MMMMM yyyy", locale);
        Calendar calendar = Calendar.getInstance();
        System.out.println(sdf.format(calendar.getTime()));
    }
}
