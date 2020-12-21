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
    }

    @Test
    public void helloStatic(){
        Pororo pororo = new Pororo();
        System.out.println(pororo);
        Pororo pororo1 = new Pororo();
        System.out.println(pororo1);
    }

    @Test
    public void helloThis(){
        Animal animal = new Animal();
        animal.showName();
        System.out.println(animal);
    }

    @Test
    public void helloMethodOptimization(){
        Animal animal = new Animal();
        Animal animal2 = new Animal();
        Animal animal3 = new Animal();
        Animal animal4 = new Animal();
        Animal animal5 = new Animal();
        Animal animal6 = new Animal();

        animal.showName();
        animal2.showName();
        animal3.showName();
        animal4.showName();
        animal5.showName();
        animal6.showName();
    }

    @Test
    public void extendTest(){
        SuperClass clazz = new SubClazz();
        clazz.showPrint();
    }
}