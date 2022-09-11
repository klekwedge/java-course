public class Main {
    public static void main(String[] args) {
        Box box = new Box(15);
        BoxWeight boxWeight = new BoxWeight(10,20,30,15.5);
        box.showInfo();
        boxWeight.showInfo();

//        System.out.println(box);
        System.out.println(box.toString());
        System.out.println(box);

        Empty empty = new Empty();
//        empty.toString();
//        System.out.println(empty.toString());

//        double random = Math.random();
//        random *= 6;
//        int randomInt = (int) random;
//        randomInt++;
//        System.out.println(randomInt);

        int result = (int)(Math.random() * 6 + 1);
        System.out.println(result);

        ////////////////////////////////////////////
        // Homework
        ////////////////////////////////////////////

        int random = (int) (Math.random() * 90 + 10);
        String result2 = String.format("Случайное число %s. Попробуйте еще раз...", random);
        System.out.println(result2);
    }
}
