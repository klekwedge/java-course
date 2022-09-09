public class Main {
    public static void main(String[] args) {
        Director director = new Director();
//        Cooker cooker = new Cooker();
//        director.force(cooker);
        director.force(new Cookable() {
            @Override
            public void cook() {
                System.out.println("Готовлю");
            }
        });


        director.force2(new Counter() {
            @Override
            public String report(int countOfMonths) {
                return "Отчет за " + countOfMonths + " месяцев";
            }
        }, 12);

        MyCounter counter = new MyCounter();
        director.force2(counter, 12);
    }

}
