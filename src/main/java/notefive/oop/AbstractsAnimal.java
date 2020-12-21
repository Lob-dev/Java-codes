package notefive.oop;

public abstract class AbstractsAnimal {

    public String dog;

    public AbstractsAnimal() {
        System.out.println("AbstractsAnimal.AbstractsAnimal default constructor");
    }

    public abstract void showDog();

    public void showDogs(){
        System.out.println("AbstractsAnimal.showDogs");
        System.out.println(dog);
    }

    public void showPrint(){
        System.out.println("AbstractsAnimal.showPrint");
    }

}
