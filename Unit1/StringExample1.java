public class StringExample1 {
    public static void main(String[] args) {
        String text = "say hello to everyone";
        System.out.println("length of text is" + text.length());

        System.out.println("vị trí của tu hello là " + text.indexOf("hello"));
        System.out.println("Cắt từ = " + text.substring(4, 8));
    }
}
