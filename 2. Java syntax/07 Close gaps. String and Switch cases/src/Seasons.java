package src;

public class Seasons {
    public static void main(String[] args) {
        String month = "Сентябрь";

        if (month.equals("Декабрь") || month.equals("Январь") || month.equals("Февраль")) {
            System.out.println("Зима");
        } else if (month.equals("Март") || month.equals("Апрель") || month.equals("Май")) {
            System.out.println("Весна");
        } else if (month.equals("Июнь") || month.equals("Июль") || month.equals("Август")) {
            System.out.println("Лето");
        } else if (month.equals("Сентябрь") || month.equals("Октябрь") || month.equals("Ноябрь")) {
            System.out.println("Осень");
        } else {
            System.out.println("Несуществующее время года");
        }

        month = "Июнь";

        switch (month) {
            case "Декабрь":
            case "Январь":
            case "Февраль":
                System.out.println("Зима");
                break;
            case "Март":
            case "Апрель":
            case "Май":
                System.out.println("Весна");
                break;
            case "Июнь":
            case "Июль":
            case "Август":
                System.out.println("Лето");
                break;
            case "Сентябрь":
            case "Октябрь":
            case "Ноябрь":
                System.out.println("Осень");
                break;
            default:
                System.out.println("Несуществующее время года");
                break;
        }
    }
}
