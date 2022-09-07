public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        int square = test.square(80);
        System.out.println(square);

        Box box = new Box();
        box.setDimens(15,15,15);
        System.out.println(box.volume());

        Rect rect = new Rect();
        rect.setDimens(20, 30);
        System.out.println(rect.perimeter());
        System.out.println(rect.area());
    }
}
