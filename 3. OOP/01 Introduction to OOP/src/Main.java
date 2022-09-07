public class Main {
    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.height = 10.2;
        myBox.length = 15;
        myBox.width = 11.3;

        Box box2 = new Box();
        box2.height = 5;
        box2.length = 5;
        box2.width = 5;

        Box box3 = new Box();
        box3.height = 10;
        box3.length = 10;
        box3.width = 10;

        double volume = myBox.height * myBox.length * myBox.width;
        System.out.println(volume);

        double volume2 = box2.height * box2.length * box2.width;
        System.out.println(volume2);

        Box box4 = box3;
        box4.height = 100;

        double volume3 = box3.height * box3.length * box3.width;
        System.out.println(volume3);

        Man man1 = new Man();
        Man man2 = new Man();
        Man man3 = new Man();
        Man man4 = new Man();
        Man man5 = new Man();

        man1.name = "Иван";
        man1.age = 18;
        man1.weight = 70.2;
        man2.name = "Игорь";
        man2.age = 18;
        man2.weight = 75;
        man3.name = "Виталий";
        man3.age = 25;
        man3.weight = 80;
        man4.name = "Алексей";
        man4.age = 22;
        man4.weight = 95;
        man5.name = "Виктор";
        man5.age = 20;
        man5.weight = 70;

        Man[] men = new Man[5];
        men[0] = man1;
        men[1] = man2;
        men[2] = man3;
        men[3] = man4;
        men[4] = man5;

        int sum = 0;
        for (int i = 0; i < men.length; i++) {
            sum += men[i].age;
        }
        System.out.println(sum/(double)men.length);
    }
}
