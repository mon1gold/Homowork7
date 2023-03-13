public class Cat extends Animals {
    private static final int maxRunDistance = 200;

    public Cat(String name, int age) {
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
        System.out.println(name + " не вміє плавати");
    }
}
