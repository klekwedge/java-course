package src;

public class Food {
    public static void main(String[] args) {
        int money = 600;

        if (money > 500) {
            System.out.println("Pizza");
        }
        else if(money < 100){
            System.out.println("Burger");
        }
        else{
            System.out.println("Something other");
        }

    }
}
