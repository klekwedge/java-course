package src;

public class Bool {
    public static void main(String[] args) {
        int temp = 26;
        boolean hot = temp != 25;

        if (hot) {
            System.out.println("Air conditioning on");
        }

        int temp2 = 40;
        int time = 24;
        boolean late = time >= 23;
        boolean hot2 = temp2 > 25;
        if (!hot2 || late) {
            System.out.println("Air conditioning off");
        }

        if (!hot2 && late) {
            System.out.println("Air conditioning off");
        }

    }
}
