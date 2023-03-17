public class Dog extends Animal {
    private static int countDogs = 0;
    private int maxRunDistance = 500;
    private int maxSwimDistance = 10;

    public Dog() {
        countDogs++;
    }

    public static int getCountDogs() {
        return countDogs;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Собака пробігла " + distance + " м");
        } else {
            System.out.println("Собака не змогла пробігти " + distance + " м");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= maxSwimDistance) {
            System.out.println("Собака пропливла " + distance + " м");
        } else {
            System.out.println("Собака не змогла проплисти " + distance + " м");
        }
    }
}

