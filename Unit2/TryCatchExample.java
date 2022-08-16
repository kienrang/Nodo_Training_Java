public class TryCatchExample {
    private static int toNumber(String value) {
        try {
            Integer integer = Integer.parseInt(value);
            return integer.intValue();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return -1;
    }

    public static void main(String[] args) {
        int number = toNumber("5");
        System.out.println("number = " + number);

        int number1 = toNumber("value");
        System.out.println("number = " + number1);

    }

}
