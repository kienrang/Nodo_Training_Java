import java.io.File;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("F:/Nodo_Tranning_Java/Unit 7/DecodingExample.java");
        if (file.isFile()) {
            System.out.println("This is file!");
        } else {
            System.out.println("This is folder");
        }
        isFolder();

        System.out.println("name: " + file.getName());
        System.out.println(file.length());
    }

    public static void isFolder() {
        File file = new File("F:/Nodo_Tranning_Java/Unit 7");
        System.out.println("This is " + (file.isFile() ? "file" : "folfer") + "!");
    }
}
