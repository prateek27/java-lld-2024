package LambdasAndStreams.Streams;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TweetProcessingPipeline {
    public static void main(String[] args) {
        // Sample tweets
        List<String> tweets = Arrays.asList(
                "RT @user1: This is a sample tweet!",
                "Learning Java Streams is fun!",
                "RT @user2: Another retweet here",
                "Parallel streams can improve performance.",
                "Stopwords should be removed from this text."
        );

        // Set of stopwords
        Set<String> stopwords = new HashSet<>(Arrays.asList("is", "a", "the", "and", "or", "be", "from", "this", "rt"));

        // Parallel stream processing pipeline
        ConcurrentMap<String, Long> wordCount = tweets.parallelStream()
                // Filter out retweets
                .filter(tweet -> !tweet.startsWith("RT"))
                // Convert text to lowercase
                .map(String::toLowerCase)
                // Split each tweet into words and flatten the stream
                .flatMap(tweet -> Stream.of(tweet.split("\\W+")))
                // Remove stopwords
                .filter(word -> !stopwords.contains(word))
                // Count the occurrences of each word
                .collect(Collectors.groupingByConcurrent(Function.identity(), Collectors.counting()));

        // Find the top 10 most common words
        List<Map.Entry<String, Long>> topWords = wordCount.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(10)
                .collect(Collectors.toList());

        // Print the results
        topWords.forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}