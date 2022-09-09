import animals.Bird;
import animals.CanRun;
import animals.Fish;
import animals.Flyable;
import animals.Cat;
import animals.Dog;
import animals.Animal;

import employees.Programmer;
import employees.Driver;
import employees.Cooker;
import employees.CodeWritable;
import employees.Drivable;
import employees.Cookable;
import employees.Employee;



import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();
        Bird bird = new Bird();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        animals.add(fish);
        animals.add(bird);

        for (Animal animal : animals) {
            animal.eat();
        }

//        Animal animal = new Cat();
//        animal.eat();

        Dog dog1 = new Dog();
        dog1.run();

        Animal animal = dog1;
//        animal.run(); // error
        animal.eat();

//        dog1 = animal; // error
        dog1 = (Dog) animal;
        dog1.run();

//        Cat cat1 = new Cat();
//        Animal animal1 = cat1;
//        Dog dog2 = (Dog) animal1; // Error


        Dog dog10 = new Dog();
        Dog dog11 = new Dog();
        Dog dog12 = new Dog();
        Dog dog13 = new Dog();
        Dog dog14 = new Dog();

        Cat cat10 = new Cat();
        Cat cat11 = new Cat();
        Cat cat12 = new Cat();
        Cat cat13 = new Cat();
        Cat cat14 = new Cat();

        ArrayList<CanRun> runAnimals = new ArrayList<>();
        runAnimals.add(dog);
        runAnimals.add(cat);
        runAnimals.add(bird);
//        runAnimals.add(fish); // Error

        for (CanRun animalItem : runAnimals) {
            animalItem.run();
        }

        Dog dog20 = new Dog();
        CanRun canRun = dog20;
//        canRun.eat(); // Error
        dog20 = (Dog) canRun;
        dog.run();
        dog.eat();


        Flyable flyable = new Bird();
        flyable.fly();

        ///////
        ///////
        ///////

        Programmer programmer1 = new Programmer("Иван");
        Programmer programmer2 = new Programmer("Николай");
        Programmer programmer3 = new Programmer("Алена");
        Driver driver1 = new Driver("Сергей");
        Driver driver2 = new Driver("Костя");
        Driver driver3 = new Driver("Лера");
        Cooker cooker1 = new Cooker("Вадим");
        Cooker cooker2 = new Cooker("Виктор");
        Cooker cooker3 = new Cooker("Максим");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(programmer1);
        employees.add(programmer2);
        employees.add(programmer3);
        employees.add(driver1);
        employees.add(driver2);
        employees.add(driver3);
        employees.add(cooker1);
        employees.add(cooker2);
        employees.add(cooker3);
        for (Employee employee : employees) {
            employee.voice();
        }

        ArrayList<CodeWritable> programmers = new ArrayList<>();
        programmers.add(programmer1);
        programmers.add(programmer2);
        programmers.add(programmer3);
        for (CodeWritable programmer : programmers) {
            programmer.writeCode();
        }

        ArrayList<Drivable> drivers = new ArrayList<>();
        drivers.add(driver1);
        drivers.add(driver2);
        drivers.add(driver3);
        for (Drivable driver : drivers) {
            driver.drive();
        }

        ArrayList<Cookable> cookers = new ArrayList<>();
        cookers.add(cooker1);
        cookers.add(cooker2);
        cookers.add(cooker3);
        for (Cookable cookable : cookers) {
            cookable.cook();
        }
    }

}
