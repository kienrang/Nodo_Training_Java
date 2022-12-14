import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.awt.*;

public class HttpConnectionExample {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://cooc.vn");
        URLConnection connection = url.openConnection();
        Path path = Paths.get("test.html");
        int read;
        byte[] bytes = new byte[100];
        try (InputStream inputStream = connection.getInputStream();
                OutputStream outputStream = Files.newOutputStream(path, StandardOpenOption.CREATE.APPEND)) {
            while ((read = inputStream.read()) != -1) {
                outputStream.write(bytes, 0, read);
            }
        } finally {
            Desktop.getDesktop().open(path.toFile());
        }
    }
}
