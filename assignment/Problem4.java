package assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

//4.Use the Stream API to find the average of a list of double values.

public class Problem4 {

    public static void main(String[] args) {
        
        List<Double> list = new ArrayList<>();
        list.add(10.5);
        list.add(95.6);
        list.add(105.9);
        list.add(55.5);

        OptionalDouble result=list.stream()
        .mapToDouble((n)->n)
        .average();

        System.out.println(result.getAsDouble());
    }
    
}
