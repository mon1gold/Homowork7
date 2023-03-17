public class Cat extends Animal {
    private static int countCats = 0;
    private int maxRunDistance = 200;

    public Cat() {
        countCats++;
    }

    public static int getCountCats() {
        return countCats;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println("Кіт пробіг " + distance + " м");
        } else {
            System.out.println("Кіт не зміг пробігти " + distance + " м");
        }
    }
}