import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MessageFormatExample {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd MMMMMM, yyyy");
        String message = MessageFormat.format("Hello {0}! Today is {1}.", args[0],
                sdf.format(Calendar.getInstance().getTime()));
        System.out.println(message);
    }
}
