package assignment;

import java.util.Arrays;
import java.util.List;

//3.Given a list of names, use the Stream API to count the number of names starting with
//the letter "J"

public class Problem3 {

    public static void main(String[] args) {
        
        List<String> list=Arrays.asList("apple","s","J","siddharth","Joy","Jerry");

        long result=list.stream()
        .filter((s)->s.startsWith("J"))
        .count();

        System.out.println(result);
    }
    
}
