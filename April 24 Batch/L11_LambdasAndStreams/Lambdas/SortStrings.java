package L11_LambdasAndStreams.Lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStrings {
    public static void main(String[] args) {
        List<String> birds = new ArrayList<>();
        birds.add("Myna");
        birds.add("Bulbul");
        birds.add("Drongo");
        birds.add("Peacock");
        birds.add("Sunbird");
        birds.add("Purple Rumped Sunbird");

        Collections.sort(birds,new BirdLengthComparator());
        System.out.println(birds);

    }
}
