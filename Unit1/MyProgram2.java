public class MyProgram2 {
    public static void main(String[] args) {
        // javaSystem.out.println("Say Hello to java");
        System.out.println("The number of arguments is" + args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println("Value at" + i + "is " + args[i]);
        }
    }

}
