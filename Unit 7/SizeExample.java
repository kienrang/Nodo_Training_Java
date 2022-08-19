import java.io.File;

public class SizeExample {
    private static long getSize(File f) {
        if (f.isFile()) {
            return f.length();
        }
        File[] files = f.listFiles();
        int length = 0;
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile() == false) {
                length += getSize(f);
                continue;
            }
            length += files[i].length();
        }
        return length;
    }

    public static void main(String[] args) {
        File file = new File("F:/Nodo_Training_Java/Unit 7");
        System.out.println("Size: " + (getSize(file) / (1024 * 1024)) + "MB");
    }
}
