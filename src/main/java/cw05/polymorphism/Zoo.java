package cw05.polymorphism;

public class Zoo {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal");
        // animal.speak();

        Animal cat = new Cat("Murka");
        Animal duck = new Duck("Murka");
        Animal dog = new Dog("Murka");
        Animal cow = new Cow("Milka");

        Animal[] animals = {cat, dog, duck, cow, animal};
        makeSpeak(animals);
    }

    static void makeSpeak(Animal[] animals) {
        for (Animal animal : animals) {
            animal.speak();
        }
    }

    /*static void makeSpeak(Animal[] animals) {
        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                Cat cat = (Cat) animal;
                cat.speak();
            }
            if (animal instanceof HomeDog) {
                HomeDog dog = (HomeDog) animal;
                dog.speak();
            }
            if (animal instanceof Duck) {
                Duck duck = (Duck) animal;
                duck.speak();
            }
        }
    }*/
}
