package com.itv.pratice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringInJava8 {
    public static void main(String [] args){
      String s="addfrtffdewwqwrse";
      IntStream stream=s.chars();
      String a="apple";



//  occurance of each charcater in string
       Map<Character,Long>map= stream.mapToObj(x->(char)x).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

       map.entrySet().forEach(x->System.out.println(x));

    //remove duplicate words
    String str="Hello hello ab  ";
    String arr[]=str.split(" ");
      str=Arrays.asList(arr).stream().distinct().collect(Collectors.joining(""));
      System.out.println(str);



    }
}
