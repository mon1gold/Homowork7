import java.util.Scanner;

public class Animals {

        protected String name;
        protected int age;
        protected static int count = 0;

        public Animals(String name, int age) {
            this.name = name;
            this.age = age;
            count++;
        }

        public void run(int distance) {
            System.out.println(name + " пробіг " + distance + " м.");
        }

        public void swim(int distance) {
            System.out.println(name + " проплив " + distance + " м.");
        }

        public static int getCount() {
            return count;
        }
}
