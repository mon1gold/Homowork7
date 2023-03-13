import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animals cat = new Cat("Kasper", 7);
        cat.run(100);
        cat.swim(20);
        cat.run(350);
        Animals dog = new Dog("Bim", 12);
        dog.run(450);
        dog.swim(4);
        dog.run(600);



    }
}