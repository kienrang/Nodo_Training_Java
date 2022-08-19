import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class FileOutoutExample {
    public static void main(String[] args) throws Exception {
        // File file = new File(
        // "F:/Nodo_Tranning_Java/Unit 7" + File.separator + "Tem" + File.separator +
        // "hanoi.txt");

        // FileOutputStream fileOutputStream = null;

        // fileOutputStream = new FileOutputStream(file);
        // String bytes = ("Kiên ràng");
        // try {
        // fileOutputStream.write(bytes.getBytes());
        // } catch (Exception e) {
        // e.printStackTrace();
        // } finally {
        // if (fileOutputStream != null) {
        // fileOutputStream.close();
        // }
        // }

        FOPStream1();

    }

    public static void FOPStream() {
        File file = new File("F:/Nodo_Tranning_Java/Unit 7/Tem/hanoi.txt");
        try (FileInputStream inputStream = new FileInputStream(file)) {
            byte[] bytes = new byte[10];
            inputStream.read(bytes);
            System.out.println(new String(bytes));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void FOPStream1() {
        File file = new File("F:/Nodo_Tranning_Java/Unit 7/Tem/hanoi.txt");
        try (FileInputStream inputStream = new FileInputStream(file)) {
            byte[] bytes = new byte[4 * 1024];
            int read = -1;
            StringBuilder builder = new StringBuilder();
            while ((read = inputStream.read(bytes)) != -1) {
                builder.append(new String(bytes, 0, read));
            }
            inputStream.read(bytes);
            System.out.println(new String(bytes));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
