package src;

public class Time {
    public static void main(String[] args) {
        int seconds = 86400;

        int secondsInMinutes = 60;
        int secondsInHours = secondsInMinutes * 60;
        int secondsInDays = secondsInHours * 24;

        int minutes = ((seconds % secondsInDays) % secondsInHours) / secondsInMinutes;
        int days = seconds / secondsInDays;
        int hours = (seconds % secondsInDays) / secondsInHours;
        int leftSeconds = seconds - days * secondsInDays - hours * secondsInHours - minutes * secondsInMinutes;

        System.out.println("Seconds: " + seconds);
        System.out.println("Minutes: " + minutes);
        System.out.println("Hours: " + hours);
        System.out.println("Days: " + days);
    }
}
