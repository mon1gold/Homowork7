public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        animal.run(100);
        animal.swim(5);

        dog.run(400);
        dog.swim(15);

        cat.run(150);

        System.out.println("Кітів створено: " + Cat.getCountCats());
        System.out.println("Собак створено: " + Dog.getCountDogs());
        System.out.println("Тварин створено:" + Animal.getCountAnimals());
    }
}