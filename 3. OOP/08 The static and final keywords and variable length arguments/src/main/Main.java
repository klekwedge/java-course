package main;
import test.MyMath;

public class Main {
    public static void main(String[] args) {
        System.out.println(MyMath.square(20));

        System.out.println(MyMath.length(10));

        int sum = MyMath.sum();
        System.out.println(sum);

        sum = MyMath.sum(1, 2, 3, 4, 5 );
        System.out.println(sum);
    }
}
