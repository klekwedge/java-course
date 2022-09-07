public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();

        box1.height = 5;
        box1.length = 5;
        box1.width = 5;

        box2.height = 10;
        box2.length = 10;
        box2.width = 10;

        box1.showVolume();
        box2.showVolume();

        System.out.println(box1.volume());
        System.out.println(box2.volume());

        Dog dog = new Dog();
        dog.name = "Шарик";
        dog.breed = "Такса";
        dog.speed = 10;
        dog.run();
        System.out.println(dog.info());
    }
}
