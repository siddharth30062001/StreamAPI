package assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//1.Given a list of integers, use the Stream API to find the sum of all even numbers.

public class SumOfEven {

    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(2,7,4,8,20,13);

        int result=list.stream().filter((n)->n%2==0)
        .reduce(0,(a,b)->a+b);

        System.out.println("sum of even numbers: "+result);
        
    }
    
}
