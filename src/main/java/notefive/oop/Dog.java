package notefive.oop;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(habit, dog.habit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(habit);
    }

    @Override
    public void showName() {
        System.out.println("Dog.showName");
    }
}
