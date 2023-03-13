public class Dog extends Animals {
    private static final int maxRunDistance = 500;
    private static final int maxSwimDistance = 10;

    public Dog(String name, int age) {
        super(name, age);

    }

    @Override
    public void run(int distance) {
        if (distance < maxRunDistance) {
            System.out.println(name + " пробіг " + distance + " м");
        } else {
            System.out.println(name + " не може пробігти таку дистанцію " + distance + " м");
        }

    }

    @Override
    public void swim(int distance) {
        if (distance < maxSwimDistance) {
            System.out.println(name + " проплив " + distance + " м");
        } else {
            System.out.println(name + " не зміг пропливти таку дистанцію " + distance + " м");
        }
    }
}
