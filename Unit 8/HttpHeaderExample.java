import java.net.HttpURLConnection;
import java.net.URL;
import java.net.http.HttpHeaders;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class HttpHeaderExample {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://www.cooc.vn/");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        System.out.println("method: " + connection.getRequestMethod());

        Map<String, List<String>> headers = connection.getHeaderFields();
        BiConsumer<String, List<String>> header = (key, value) -> {
            System.out.println("Key: " + key + ", Values" + value);
        };
        headers.forEach(header);
    }
}
