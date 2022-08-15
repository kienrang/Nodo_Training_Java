public class Persion {
    private String name;

    public Persion(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class PersionTest {
    public static void main(String[] args) {
        Persion persion1 = new Persion(args[0]);
        Persion persion2 = new Persion(args[1]);

        System.out.println("Persion1's name is " + persion1.getName());
        System.out.println("Persion2's name is " + persion2.getName());

    }
}