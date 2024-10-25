package examples;

import java.util.Arrays;
import java.util.List;

//Program for finding maximum and minimum element in the list

public class Example3 {

    public static void main(String[] args) {
        
        List<Integer> list=Arrays.asList(2,4,6,500,10,1);
        int maxElement=list.stream().max((a,b)->a>b?1:-1).get();
        System.out.println("maxElement: "+maxElement);

        int minElement=list.stream().min((a,b)->a<b?1:1).get();
        System.out.println("minElement: " +minElement);

    }
    
}
