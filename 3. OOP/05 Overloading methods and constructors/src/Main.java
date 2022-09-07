public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        int result = test.multiple(6, 5);
        System.out.println(result);

        double result2 = test.multiple(6.21, 5.5);
        System.out.println(result2);

        int result3 = test.multiple(10);
        System.out.println(result3);

        int result4 = Test.multiple(5);
        System.out.println(result4);

        Box box = new Box(10);
        System.out.println(box.volume());

        Box box2 = new Box(30, 30, 30);
        System.out.println(box2.volume());

        Box box3 = new Box();
        System.out.println(box3.volume());

        Monster monster1 = new Monster();
        Monster monster2 = new Monster(1,1,1);
        Monster monster3 = new Monster(4,2);
        monster1.voice();
        monster2.voice(3);
        monster3.voice(5, "Я монстр 3");
    }
}
