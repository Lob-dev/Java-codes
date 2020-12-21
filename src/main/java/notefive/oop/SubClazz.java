package notefive.oop;

public class SubClazz extends SuperClass{

    public SubClazz() {
        System.out.println("SubClazz constructor");
    }

    @Override
    public void showPrint() {
        System.out.println(this);
        System.out.println("SubClazz.showPrint");
    }
}
