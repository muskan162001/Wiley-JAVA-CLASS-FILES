package streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamsClass {
    int [] arr = {1, 2, 4, 8, 16};
    IntStream total = Arrays.stream(arr).filter(n -> n % 2 == 0);
    
    List < String > list = Arrays.asList("Java", "Pythom")
}
