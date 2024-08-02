package LambdasAndStreams.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        //Normal Way
        List<String> fruits = new ArrayList<>();
        fruits.addAll(List.of("apple","apple","mango","guava","banana","pineapple"));

        //Traditional Approach
        //Filter Out fruits which contain the word apple inside it
        // 3 Steps -> For Loop, If,ToUpperCase, Print
        List<String> selectedFruits = new ArrayList<>();
        for(String fruit:fruits){
            if(fruit.contains("apple")){
                selectedFruits.add(fruit.toUpperCase());
            }
        }

        System.out.println(selectedFruits);

        //New Approach using Streams
        List<String> output = fruits.stream()
                                .filter(fruit->fruit.contains("apple"))
                                .map(fruit->fruit.toUpperCase())
                                .collect(Collectors.toList());

        System.out.println(output);

        //Filter out Even Numbers & Square Them
        List<Integer> numbers = new ArrayList<>(List.of(1,3,4,5,6,2));
        List<Integer> evenNumbers = numbers.stream()
                        .filter(number->number%2==0)
                        .map(number->number*number)
                        .collect(Collectors.toList());
        System.out.println(evenNumbers);

        //Length of fruits names that contain apple
        List<Integer> fruitLengths = fruits.stream()
                .filter(fruit->fruit.contains("apple"))
                .map(fruit->fruit.length())
                .collect(Collectors.toList());

        System.out.println(fruitLengths);

        //Sum of Fruits Lengths
        int sumOfFruitLengths = fruits.stream()
                .filter(fruit->fruit.contains("apple"))
                .map(fruit->fruit.length())
                .mapToInt(length->length.intValue())
                .sum();

        //Count - Fruits Length
        long countOfFruits = fruits.stream()
                .filter(fruit->fruit.contains("apple"))
                .distinct()
                .count();

        System.out.println(countOfFruits);

        //Take Input a List of Players
        // Sort the players according to rank
        // Collect the output in a List of Player Name
        //Input List<Players> , Output List<String>





    }
}
