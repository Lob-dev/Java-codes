package notefive.oop;

import org.junit.Test;

public class AnimalTest {

    @Test
    public void run() {
        System.out.println("AnimalTest.run test");
        Dog dog = new Dog();
        dog.name = "푸들";
        dog.habit = "멍멍";
        dog.showHabit();
        dog.showName();

        System.out.println();
        System.out.println();

        Animal animal = new Dog();
        animal.name = "리트리버";
        animal.showName();

        System.out.println();
        System.out.println();

        AnimalImpl animal1 = new AnimalImpl();
        animal1.dog = "불독";
        animal1.showDog();
        animal1.showDogs();
    }

    @Test
    public void helloStatic(){
        Pororo pororo = new Pororo();
        System.out.println(pororo);
        Pororo pororo1 = new Pororo();
        System.out.println(pororo1);

    }
}