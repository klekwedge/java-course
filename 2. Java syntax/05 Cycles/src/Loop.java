package src;

public class Loop {
    public static void main(String[] args) {
//        int a = 10;
//        a = a + 1;
//        a += 1;
//        a++;
//
//        a = a - 1;
//        a -= 1;
//        a--;

//        int i = 1;
//        while (i <= 1000) {
//            System.out.println(i);
//            i++;
//
//            if (i == 5) {
//                break;
//            }
//        }

//        int j = 1000;
//        while (j >= 0) {
//            if (j % 2 == 0) {
//                System.out.println(j);
//            }
//            j--;
//        }

        int k = 1;
        int sum = 0;
        while (k <= 100) {
            sum += k;
            k++;
        }

        float result = sum / (float) k;
        System.out.println(result);

        int a = 0;
        do {
            System.out.println("Hello!");
        } while (a > 0);

        for (int i = 1000; i > 0; i--) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
