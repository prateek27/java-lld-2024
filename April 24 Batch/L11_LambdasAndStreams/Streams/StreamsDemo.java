package L11_LambdasAndStreams.Streams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;

public class StreamsDemo {
    public static void main(String[] args) {
        //List of Fruits
        // Collect fruits where name start with "A"
        // and convert them into upper case

        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("gauva");
        fruits.add("appricot");
        fruits.add("pineapple");

        //traditional way
        List<String> output = new ArrayList<>();
        for(String fruit:fruits){
            if(fruit.startsWith("a")){
                output.add(fruit.toUpperCase());
            }
        }
        System.out.println(output);

        //Example - 1 declarative way/functional programming
        List<String> output2 = fruits.stream()
                 .filter(fruit->fruit.startsWith("a"))
                    .map(fruit->fruit.toUpperCase())
                 .collect(Collectors.toList());

        System.out.println(output2);

        // Examples - 2 Filter Fruits whose length is > 5
        List<String> output3 = fruits.stream().filter(fruit->fruit.length()>5).collect(Collectors.toList());
        System.out.println(output3);

        // Example - 3 Count elements
        Long count = fruits.stream().filter(fruit->fruit.startsWith("a")).collect(counting());
        System.out.println(count);

        //Example 4 - Find out evens from a list and square them
        List<Integer> numbers = new ArrayList<>(List.of(5,7,10,12,14,18,21));
        //Predicate: It is functional interface in java that repreats a boolean valued function
        // Predicate<T>
        // Abstract Method boolean test(T t)
        Predicate<Integer> isEven =number->number%2==0 ;
        numbers.stream().filter(number->number%2==0).forEach(System.out::println);

        //DEMO
        Predicate<Integer> isEvenNumber =number->number%2==0;
        System.out.println(isEvenNumber.test(8));

        Consumer<String> consumer = object->System.out.println(object);
        consumer.accept("Hello World!!");

        Supplier<String> supplier = () -> "Hi!";
        System.out.println(supplier.get());

        Function<String,Integer> function = stringObj -> stringObj.length();
        System.out.println(function.apply("Hello"));

        //Birds
        System.out.println(fruits);
        System.out.println();
        // fruits.stream().map(fruit->fruit.length()).forEach(System.out::println);
        List<Integer> l =  fruits.stream()
                .filter(fruit->fruit.length()>5)
                .map(fruit->fruit.length())
                .collect(Collectors.toList());
        System.out.println(l);

        // Parallel Streams (multiple threads - each element should be processed a separate thread)
        IntStream.rangeClosed(20,40)
                .filter(number->number%5==0)
                .map(number->number*number)
                .forEach(System.out::println);

        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);

        // Sequential Processing
        listOfNumbers.stream()
                .forEach(number->
                System.out.println(number + "Thread " + Thread.currentThread().getName()));

        //Parallel Processing
        // useful exploit parallel processing using multiple cores
        // speed up the computation
        listOfNumbers.parallelStream()
                .forEach(number->
                        System.out.println(number + "Thread " + Thread.currentThread().getName()));

        //Advantages of Streams
        //1. Code Reduction
        //2. Parallelism
        //3. Separation of Concern
        // 4. Lazy Valuation (computation happens only when you need the result)
        // 5. Functional Programming (Transform data in immutable manner)
        // 6. Abstraction


    }
}

