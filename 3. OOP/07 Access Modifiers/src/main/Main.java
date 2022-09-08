package main;
import box.Box;
import test.Man;

public class Main {
    public static void main(String[] args) {

        Man man = new Man("John", 27);
        man.setAge(28);
        man.showInfo();
        System.out.println(man.getAge());

        Box box = new Box();
    }
}
