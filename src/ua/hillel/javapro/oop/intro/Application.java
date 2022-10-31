package ua.hillel.javapro.oop.intro;

import ua.hillel.javapro.oop.intro.one.SameName;

public class Application {
    public static void main(String[] args) {

        Employee employee = new Employee("Bob", "Junior", "admim@i.ua", 669525461, 25);
        System.out.println(employee.getName());
        employee.setAge(26);
        System.out.println(employee.getAge());


        // Можемо імпортувати потрібний нам class та звертатися до нього так
        SameName oneName = new SameName();

        // Також можливо не імпортувати і вказати повний шлях до class
        ua.hillel.javapro.oop.intro.two.SameName twoName = new ua.hillel.javapro.oop.intro.two.SameName();


        Car car = new Car();
        car.start();

    }
}
