public class Main {
    public static void main(String[] args) {
        Box box = new Box(10, 15, 20);
        System.out.println(box.volume());

        Box box2 = new Box(30, 30, 30);
        System.out.println(box2.volume());

        Employee employee = new Employee("Иван", "Программист", 50000);
        System.out.println(employee.getInfo(12));
    }
}
