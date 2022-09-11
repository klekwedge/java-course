public class Main {
    public static void main(String[] args) {
        int a = 0;
//        try {
//            int b = 7 / a;
//            String s ="124fgkcf";
//            int i = Integer.parseInt(s);
//        }
//        catch (ArithmeticException e){
//            System.out.println("На 0 делить нельзя!");
//        }
//        catch (NumberFormatException error){
//            System.out.println("Ошибка преобразования!");
//        }

        try {
            int b = 7 / a;
            String s = "124fgkcf";
            int i = Integer.parseInt(s);
        } catch (ArithmeticException e) {
            System.out.println("На 0 делить нельзя!");
        } catch (Exception e) {

        } finally {
            System.out.println("Мы в блоке finally");
        }

        System.out.println("Привет!");

        //////////////////////////////////////////////
        // Homework
        //////////////////////////////////////////////

        try {
            int[] array = new int[10];
            System.out.println(array[25]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }
    }
}
