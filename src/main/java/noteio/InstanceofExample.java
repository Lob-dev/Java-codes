package noteio;

public class InstanceofExample {

    public static void main(String[] args) {
        InstanceofExample example = new InstanceofExample();
        example.run();


    }

    public void run() {
        SomeClass someClass = new SomeClass();
        SomeClasz someClasz = new SomeClasz();
        SomeClassImpl someClassImpl = new SomeClassImpl();
        typeCheck(someClass);
        typeCheck(someClasz);
        typeCheck(someClassImpl);
    }

    public void typeCheck(Object obj){
        if (obj instanceof SomeClass){
            System.out.println("is SomeClass");
        }else if (obj instanceof SomeClasz){
            System.out.println("is SomeClasz");
        }
    }
    class SomeClass {
    }
    class SomeClassImpl extends SomeClass{
    }
    class SomeClasz {
    }
}
