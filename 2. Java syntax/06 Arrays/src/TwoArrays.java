package src;

public class TwoArrays {
    public static void main(String[] args) {
        int[] first = new int[900];

        for (int i = 0; i < first.length; i++) {
            first[i] = i + 100;
        }

        int[] second = new int[first.length];
        for (int i = 0, j = first.length - 1; i < first.length; i++, j--) {
            second[i] = first[j];
        }

        for (int k : second) {
            System.out.println(k);
        }
    }
}
