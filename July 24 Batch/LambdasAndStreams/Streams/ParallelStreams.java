package LambdasAndStreams.Streams;

import java.util.Arrays;
import java.util.List;

public class ParallelStreams {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);

        //Sequential Stream
        // listOfNumbers.stream()
        //        .forEach(System.out::println); //Terminal Operation

        //Parallel Stream (Process bulk operations in parallel)
        listOfNumbers.parallelStream()
                .forEach(number->{
                    System.out.print(number + " - ");
                    System.out.println(Thread.currentThread().getName());
                });

        //Tweet Processing Pipeline (Tweet : PersonId, TweetText )
        //1.limit the length 50 characters
        //2. check for abusive words
        // 3. group all the tweets belonging to one person
        // 4. Collect it

    }
}
