import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppConfig {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean");
        context.start();
    }

}
