public class MethodExample {
    public static void main(String[] args) {
        System.out.println("4 + 7 = " + add(4, 7));
        int value1 = Integer.parseInt(args[0]);
        int value2 = Integer.parseInt(args[1]);
        System.out.println(value1 + " + " + value2 + " = " + add(value1, value2));
        System.out.println("Sum = " + add1(4, 7, 6));
    }

    private static int add(int number1, int number2) {
        return number1 + number2;
    }

    private static int add1(int... values) {

        int total = 0;
        for (int element : values) {
            total += element;
        }
        return total;
    }
}
