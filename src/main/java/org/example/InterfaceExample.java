package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class InterfaceExample implements WaterBottle {
    public static void main(String[] args) {
        System.out.println(color);

        InterfaceExample ex = new InterfaceExample();
        ex.fillUp();

        // Anonymous Inner Class
        A obj = () -> System.out.println("Hi in show method!");
        obj.show();

        // Anonymous Inner Class
        IntegerOperation addition = (a, b) -> a + b;
        IntegerOperation substraction = (a, b) -> a - b;
        IntegerOperation multiplication = (a, b) -> a * b;

        System.out.println("Addition: " + addition.operate(15, 11));
        System.out.println("Substraction: " + substraction.operate(15, 11));
        System.out.println("Multiplication: " + multiplication.operate(15, 11));

        //  Filtrarea unei liste
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isOdd = n -> n % 2 != 0;

        List<Integer> oddNumbers = numbers.stream()
                .filter(isOdd)
                .collect(Collectors.toList());

        List<Integer> evenNumbers = numbers.stream()
                .filter(isEven)
                .collect(Collectors.toList());

        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);

        // Filtrarea unei liste de obiecte
        List<Person> people = List.of(
                new Person("Evan", 20),
                new Person("Jayson", 22),
                new Person("Jonathan", 24),
                new Person("Luke", 26),
                new Person("Elizabeth", 29));

        Predicate<Person> isAdult = person -> person.getAge() > 25;
        List<Person> adults = people.stream()
                .filter(isAdult)
                .collect(Collectors.toList());
        adults.forEach(System.out::println);
    }

    @Override
    public void fillUp() {
        System.out.println("It's filled");
    }

    @Override
    public void pourOut() {
    }
}