public class Days {
    public static void main(String[] args) {
        int days = 5000;
        int years = 5000 / 365;
        int month = (days % 365) / 31;

        int leftDays = days - years * 365 - month * 31;

        System.out.println("Total number of days:" + days);
        System.out.println("Years:" + years);
        System.out.println("Moths:" + month);
        System.out.println("Days:" + leftDays);
    }
}
