package src;

public class Temp {
    public static void main(String[] args) {
        int temp = 30;
        if (temp > 25) {
            System.out.println("Air conditioning on");
        } else if (temp < 22) {
            System.out.println("Air conditioning off");
        } else {
            System.out.println("Air conditioning doing nothing");
        }
    }
}
