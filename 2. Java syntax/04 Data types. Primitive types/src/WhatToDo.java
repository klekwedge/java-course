package src;

public class WhatToDo {
    public static void main(String[] args) {
        int time = 19;
        boolean isGoodWeather = true;
        boolean late = time >= 23 || time <= 5;

        if (late) {
            System.out.println("Sleep");
        }

        if (!late && isGoodWeather) {
            System.out.println("Walk");
        }

        if (!late && !isGoodWeather) {
            System.out.println("Read");
        }
    }
}
