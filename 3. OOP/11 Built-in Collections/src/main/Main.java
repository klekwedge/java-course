package main;

import com.sun.source.util.Trees;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();

        employees.add("Сергей");
        employees.add("Михаил");
        employees.add("Екатерина");
        employees.add("Николай");
        employees.add("Игорь");
        employees.add("Илья");
        employees.add("Елена");

        employees.remove(0);
        employees.remove("Игорь");

//        for (int i = 0; i < employees.size(); i++) {
//            System.out.println(employees.get(i));
//        }

        for (String name : employees) {
//            System.out.println(name);
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            numbers.add(i);
        }

        int sum = 0;
        for (int i : numbers) {
            sum += i;
//            System.out.println(i);
        }

//        System.out.println(sum);

        HashSet<String> names = new HashSet<>();

        names.add("Сергей");
        names.add("Михаил");
        names.add("Екатерина");
        names.add("Сергей");
        names.add("Николай");

        for (String name : names) {
//            System.out.println(name);
        }

        TreeSet<String> names2 = new TreeSet<>();

        names2.add("Сергей");
        names2.add("Михаил");
        names2.add("Екатерина");
        names2.add("Сергей");
        names2.add("Николай");

        for (String name : names2) {
//            System.out.println(name);
        }


        ArrayList<Integer> numbersArr = new ArrayList<>();
        ArrayList<String> namesArr = new ArrayList<>();
        ArrayList<String> namesAndNumbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbersArr.add(i);
        }
        namesArr.add("Андрей");
        namesArr.add("Катя");
        namesArr.add("Настя");
        namesArr.add("Антон");
        namesArr.add("Женя");
        namesArr.add("Дима");
        namesArr.add("Коля");
        namesArr.add("Мария");
        namesArr.add("Роман");
        namesArr.add("Павел");
        for (int i = 0; i < numbersArr.size(); i++) {
            String s = numbersArr.get(i) + " - " + namesArr.get(i);
            namesAndNumbers.add(s);
        }
        for (String s : namesAndNumbers) {
            System.out.println(s);
        }
    }
}
