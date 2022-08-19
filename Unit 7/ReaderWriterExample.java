import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.awt.*;

public class ReaderWriterExample {

    public static void main(String[] args) throws Exception {
        // File file = new File("F:/Nodo_Tranning_Java/Unit 7/Tem/hanoi.txt");
        // boolean append;
        // try (FileWriter fileWriter = new FileWriter(file, append = true)) {
        // fileWriter.write("\r\n");
        // fileWriter.write("Tran thi B");
        // Desktop.getDesktop().open(file);
        // }

        ReaderWri();
    }

    public static void ReaderWri() {
        File file = new File("F:/Nodo_Tranning_Java/Unit 7/Tem/hanoi.txt");
        try {
            FileReader reader = null;
            reader = new FileReader(file);
            char[] buffer = new char[4 * 1024];
            StringBuilder builder = new StringBuilder();
            int read = -1;
            while ((read = reader.read(buffer)) != -1) {
                builder.append(buffer, 0, read);
            }
            System.out.println(builder);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
