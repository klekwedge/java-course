public class Main {
    public static void main(String[] args) {

        Box box = new Box(100);
        Box box2 = new Box(30, 30, 30);
        box2.compare(box);
        box2.compare(box2);

        Box box3 = new Box(10);
        Box box4 = new Box(box3);
        int result = box3.compare(box4);

        Box box5 = new Box(10);
        Box box6 =box5.increase(2);

        box5.showVolume();
        box6.showVolume();


        switch (result) {
            case -1:
                System.out.println("Наша коробка меньше");
                break;
            case 0:
                System.out.println("Наши коробки равны");
                break;
            case 1:
                System.out.println("Наша коробка больше");
                break;
        }

        Box box7 = new Box(10);
        Box box8 = new Box(20,20,10);
        Box box9 = box7.sumBox(box8);
        Box box10 = new Box(box7, box8);
        box9.showVolume();
        box10.showVolume();

        double volumeSum = box7.volume() + box8.volume();
        System.out.println("box7 + box8 = " + volumeSum);
    }
}
