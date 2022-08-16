import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Locale.Category;

public class StringSwitchStatement {

    String getTypeOfDay(Calendar calendar) {
        String type = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, new Locale("vi"));

        switch (type) {
            case "Th 2":
                return "Start of word week";
            case "Th 3":
                return "Second of word week";
            case "Th 4":
                return "Third of word week";
            case "Th 5":
                return "Midweek";
            case "Th 6":
                return "Midweek";
            case "Th 7":
                return "Midweek";
            case "CN":
                return "Weekend";
        }
        return "Unknown";

    }

    public static void main(String[] args) {
        StringSwitchStatement statement = new StringSwitchStatement();
        Calendar calendar = Calendar.getInstance();
        System.out.println("Today is " + statement.getTypeOfDay(calendar));
        calendar.set(Calendar.DATE, calendar.get(Calendar.DATE) + 1);
        System.out.println("Tomorow is " + statement.getTypeOfDay(calendar));
    }
}
