package notefive.oop;

public class Dog extends Animal {

    String habit;

    public Dog() {
        System.out.println("Dog.Dog default Constructor");
    }

    public void showHabit(){
        System.out.println("Dog.showHabit");
        System.out.println(habit);
    }

    @Override
    public void showName() {
        System.out.println("Dog.showName");
    }
}
