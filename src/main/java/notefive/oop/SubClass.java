package notefive.oop;

public class SubClass extends SuperClass{

    public SubClass() {
        System.out.println("SubClass constructor");
    }

    @Override
    public void showPrint() {
        System.out.println(this);
        System.out.println("SubClass.showPrint");
    }
}
