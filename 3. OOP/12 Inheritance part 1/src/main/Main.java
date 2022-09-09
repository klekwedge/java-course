package main;

import box.Box;
import box.BoxWeight;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Lion lion = new Lion();

//        System.out.println(lion.legs);
//        System.out.println(cat.bigClaws);

        cat.showInfo();
        lion.showInfo();

        cat.eat();
        lion.eat();

        Box box = new Box(15);
        BoxWeight boxWeight = new BoxWeight(10,20,30,15.5);
        box.showInfo();
        boxWeight.showInfo();
    }
}
