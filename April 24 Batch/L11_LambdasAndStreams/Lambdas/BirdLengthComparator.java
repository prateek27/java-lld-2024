package L11_LambdasAndStreams.Lambdas;

import java.util.Comparator;

public class BirdLengthComparator implements Comparator<String> {
    @Override
    public int compare(String b1, String b2) {
        return b1.length() - b2.length();
    }
}
