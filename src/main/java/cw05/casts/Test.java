package cw05.casts;

/**
 * Created by evgeniy on 19/08/16.
 */
public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal2 = new Cat();

        Cat cat = (Cat) animal2;
        cat.speak();
    }
}
