package main;

public class Main {
    public static void main(String[] args) {
//        String[] employees = {"Игорь", "Сергей", "Дмитрий", "Николай", "Влад"};
//
//        String[] second = new String[employees.length + 1];
//
//        for (int i = 0; i < employees.length; i++) {
//            second[i] = employees[i];
//        }
//
//        second[second.length - 1] = "Иван";
//        employees = second;
//        employees[1] = null;
//
//        String[] newNames = new String[employees.length - 1];
//
//        for (int i = 0, j = 0; i < employees.length; i++) {
//            if (employees[i] != null) {
//                newNames[j] = employees[i];
//                j++;
//            }
//        }
//
//        employees = newNames;
//
//        for (String name : employees) {
//            System.out.println(name);
//        }

        MyArrayList employees = new MyArrayList();
        employees.add("Игорь");
        employees.add("Сергей");
        employees.add("Дмитрий");
        employees.add("Николай");
        employees.add("Влад");
        employees.add("Дмитрий");
        employees.add("Алексей");

        employees.remove(2);

        for (int i = 1; i < 100; i++) {
            employees.add("Сотрудник" + i);
        }

        employees.remove("Игорь");

        for (int i = 0; i < employees.getSize(); i++) {
            System.out.println(employees.get(i));
        }
    }
}
