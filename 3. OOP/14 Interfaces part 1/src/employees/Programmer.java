package employees;

public class Programmer extends Employee implements CodeWritable {

    public Programmer(String name) {
        super(name);
    }

    @Override
    public void writeCode() {
        System.out.println("Пишу код.");
    }
}
