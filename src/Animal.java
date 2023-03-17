public class Animal {
    private static int countAnimals = 0;

    public Animal() {
        countAnimals++;
    }

    public static int getCountAnimals() {
        return countAnimals;
    }

    public void run(int distance) {
        System.out.println("Тварина пробігла " + distance + " м");
    }

    public void swim(int distance) {
        System.out.println("Тварина пропливла " + distance + " м");
    }

}
