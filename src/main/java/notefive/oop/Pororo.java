package notefive.oop;

public final class Pororo {

    static {
        System.out.println("Pororo.static initializer");
    }

    public Pororo() {
        System.out.println("Pororo.default constructor");
    }

    public final void hello(){
        System.out.println("Pororo.hello");
    }
}
