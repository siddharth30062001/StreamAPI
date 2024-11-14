package assignment;

import java.util.Arrays;
import java.util.List;

//Given a list of strings, use the Stream API to find the longest string.
public class LongestString {

    public static void main(String[] args) {
        
        List<String> list=Arrays.asList("apple","s"," ","siddharth");

        String longeststring=list.stream()
        .max((s1,s2)->s1.length()>s2.length()?1:-1).get();

        System.out.println(longeststring);
    }
    
}
