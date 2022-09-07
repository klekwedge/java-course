package src;

public class IntegerManipulation {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = a + b;
        int d;
        d = 22;
        System.out.println("a + b = " + c);
        c = c + 5;
        System.out.println("c = " + c);
        c = c * 10;
        System.out.println("c * 10 = " + c);

        a = 10;
        b = 3;
        c = a / b;
        System.out.println("c = " + c);

        c = a % b;
        System.out.println("c = " + c);

        c += 5;
        System.out.println("c + 5 = " + c);

        c *= 10;
        System.out.println("c * 10 = " + c);
    }
}
