package examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CheckNumber {

    public static void main(String[] args) {
        
        List<Integer> list=Arrays.asList(2,4,6,5,10);

        Stream<Integer> result=list.stream()
        .filter((n)-> n%2==1)
        .map((n)->n*2);
        
        result.forEach((s)->{
            System.out.println(s);
        });
        
    }

    
}