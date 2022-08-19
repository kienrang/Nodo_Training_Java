import java.io.File;
import java.awt.*;
import java.io.RandomAccessFile;

public class RandomAccessExample {
    public static void main(String[] args) throws Exception {
        File file = new File("F:/Nodo_Tranning_Java/Unit 7/Tem/hanoi.txt");
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw")) {
            randomAccessFile.seek(9);
            byte[] bytes = new byte[4 * 102];
            int read = randomAccessFile.read(bytes);
            System.out.println(new String(bytes, 0, read, "utf8"));

            randomAccessFile.seek(file.length());
            randomAccessFile.write("/r/n".getBytes());
            randomAccessFile.writeChars("Hello Co Can");
            Desktop.getDesktop().open(file);
        }
    }
}