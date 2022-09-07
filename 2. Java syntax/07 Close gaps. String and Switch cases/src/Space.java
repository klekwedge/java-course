package src;

public class Space {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int[] dayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//        for (int i : dayOfMonth) {
//            System.out.println(i);
//        }

        String s = "Hello world!";
//      System.out.println(s);

        String name = "John";
        int age = 33;
        String result = "Hello, \"" + name + "\"! \nYou are " + age + " years old";
//        System.out.println(result);

        String[] namesOfMonth = {"January", "February",
                "March", "April", "May", "June", "July",
                "August", "September", "October", "November",
                "December" };

        String resultMonth = "";
        for (int i = 0; i < namesOfMonth.length; i++) {
            resultMonth += namesOfMonth[i];
            if(i == namesOfMonth.length - 1){
                resultMonth += ".";
            }
            else{
                resultMonth += ", ";
            }
        }
        System.out.println(resultMonth);
    }
}
