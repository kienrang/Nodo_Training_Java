import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLConectionExample {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://cooc.vn/");

        URLConnection connectException = url.openConnection();
        InputStream stream = connectException.getInputStream();
        byte[] bytes = new byte[100];
        int read = stream.read(bytes);
        while (read != -1) {
            System.out.println(new String(bytes, 0, read));
        }
    }
}
