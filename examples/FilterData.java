package examples;

import java.util.Arrays;
import java.util.List;

public class FilterData {

    public static void main(String[] args) {
        
        List<Integer> list=Arrays.asList(2,4,6,5,10);
        int sumOFevendoublenumber=list.stream()
        //filtering the even element
        .filter((n)->n%2==0)
        //double the filter result element
        .map((n)->n*2)
        //sum of result of element
        .reduce(0,(a,b)->a+b);

        System.out.println(sumOFevendoublenumber);
    }
    
}
