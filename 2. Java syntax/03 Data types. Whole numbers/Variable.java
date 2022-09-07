public class Variable {
    public static void main(String[] args) {
        int days = 1000;
        int speed = 300000;

        long seconds = days * 24 * 60 * 60;
        long distance = speed * seconds;

        System.out.println(distance);

        byte a = 127;
        a += 1;
        System.out.println(a);
        a += 1;
        System.out.println(a);
        a += 1;
        System.out.println(a);

        int speed2 = 300000;

        int seconds2 = days * 24 * 60 * 60;
        long distance2 = speed * seconds2;
        System.out.println(distance2);

        byte b = 10;
        int c = b;
        System.out.println(c);

//        int f = 15;
//        byte g = f;
//        System.out.println(g);
        int f = 1321;
        byte g = (byte)f;
        System.out.println(g);
    }
}
