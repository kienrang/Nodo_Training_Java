public class StringExample3 {
    public static void main(String[] args) {
        String text = "Absolute value";
        byte[] bytes = text.getBytes();
        System.out.println("Byte value are " + bytes);

        for (int i = 0; i < bytes.length; i++) {
            System.out.println((int) bytes[i] + ", ");
        }
    }
}
