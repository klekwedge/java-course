package main;

public class Cat extends CatFamily {
//    public Cat() {
//        bigClaws = false;
//    }

//    public Cat() {
//        setBigClaws(false);
//    }

    public Cat() {
        super(2, 4, false);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("вискас");
    }

}
