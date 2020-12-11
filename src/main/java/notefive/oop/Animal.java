package notefive.oop;

public class Animal {
    String name;

    static {
        System.out.println("Animal.static initializer");
    }

    public Animal() {
        System.out.println("Animal.Animal default Constructor");
    }

    public void showName() {
        System.out.println("Animal.showName");
        System.out.println(name);
    }
}
