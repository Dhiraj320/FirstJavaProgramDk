package DSA.FunctionalProgramming.ForProblemSolvingInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        //Predicate <T>
        // Purpose-Used to check a condition.
        // Lambda to check if string length is > 5
        Predicate<String> isLongString = str -> str.length() > 5;

        System.out.println(isLongString.test("Java"));        // false
        System.out.println(isLongString.test("Programming")); // true
//        Consumer <T>
//        Purpose: Takes an input and performs an operation without returning anything.
        // Lambda to print a message in uppercase
        Consumer<String> printUpper = msg -> System.out.println(msg.toUpperCase());

        printUpper.accept("hello world");
//        Function <T, R>
//        Purpose: Takes an input of type T and transforms it into a result of type R.
        // Lambda to convert String to Integer length
        Function<String, Integer> getLength = str -> str.length();
        // Lambda to square a number
        Function<Integer, Integer> square = num -> num * num;
        int length = getLength.apply("Indore");
        System.out.println("Length: " + length); // Output: 6

//        Supplier <T>
//        Purpose: Returns a result without taking any input.
        // Lambda to supply a random double
        Supplier<Double> randomValue = () -> Math.random();

        System.out.println(randomValue.get());

        // Lambda to supply a default error message
        Supplier<String> errorMessage = () -> "404 - Page Not Found";
        System.out.println(errorMessage.get());



//        BiPredicate<T, U>: Checks condition on two arguments.
        // Example: Check if the first number is greater than the second
        BiPredicate<Integer, Integer> isGreater = (a, b) -> a > b;
        System.out.println(isGreater.test(10, 20));      // false
//        BiConsumer<T, U>: Consumes two arguments.
//        The most common use case is iterating over a Map (Keys and Values),
//        or formatting and printing two related pieces of data.
        // Example: Concatenate and print two strings
        BiConsumer<String, String> printFullName = (first, last) ->
                System.out.println("Full Name: " + first + " " + last);

        printFullName.accept("John", "Doe");

        // --- REAL WORLD USAGE (Iterating a Map) ---
        Map<String, Integer> salaries = new HashMap<>();
        salaries.put("Alice", 50000);
        salaries.put("Bob", 60000);

        // Map.forEach accepts a BiConsumer (Key, Value)
        salaries.forEach((name, salary) ->
                System.out.println("Employee: " + name + " | Salary: $" + salary)
        );
//        BiFunction<T, U, R>: Transforms two arguments (T, U) into result R.
//        Use Case: Math calculations (adding two numbers), merging data, or creating an object from two inputs.
        BiFunction<Integer, Integer, String> sumToString = (num1, num2) ->
                "The sum is: " + (num1 + num2);

        System.out.println(sumToString.apply(10, 20));
    }
}
