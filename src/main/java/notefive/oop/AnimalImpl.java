package notefive.oop;

public class AnimalImpl extends AbstractsAnimal {

    static {
        System.out.println("AnimalImpl.static initializer");
    }

    public AnimalImpl() {
        System.out.println("AnimalImpl.AnimalImpl default constructor");
    }

    @Override
    public void showDog() {
        System.out.println("AnimalImpl.showDog");
    }
}
