package main;

public class Main {
    public static void main(String[] args) {

//        byte a;
//        Byte a1;
//        short b;
//        Short b1;
//        int c = 5;
//        Integer c1 = 5;
//        long d;
//        Long d1;
//        char e;
//        Character e1;
//        float f;
//        Float f1;
//        double g;
//        Double g1;
//        boolean bool;
//        Boolean bool1;


//        String s = "1000";
//        String test = "2000";
//        System.out.println(s + test);
//
//        int a = Integer.parseInt(s);
//        int b = Integer.parseInt(test);
//        System.out.println(a + b);

        String s = "false";
        boolean b = Boolean.parseBoolean(s);
        System.out.println(b);

        String a = "Это Игорь. Он строитель";
        String firstName = a.substring(4, 9);
        System.out.println(firstName);

        String sourceData = "Это Иван. Ему 34 года. Его рост 166.3 см. Должность \"Программист\"";
        String name = sourceData.substring(4,8);
        String ageString = sourceData.substring(14,16);
        int age = Integer.parseInt(ageString);
        String heightString = sourceData.substring(32,37);
        double height = Double.parseDouble(heightString);
        String position = sourceData.substring(53, 64);
        Man man = new Man(name, position, age, height);
        System.out.println(man.getName() + " " + man.getPosition() + " " + man.getAge() + " года, рост: " + man.getHeight() + "см.");

    }
}
