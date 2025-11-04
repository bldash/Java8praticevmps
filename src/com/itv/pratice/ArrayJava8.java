package com.itv.pratice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class ArrayJava8 {
  public static void main(String [] args){
      //print distinct number
//print even numbers
  //print odd numbers
  //sum of even numbers
  //sum of odd numbers
  //sum of all numbers
  //higest Number
  //2nd highest Number
  //nth highest Number
      int a[]={3,5,6,8,9,23,45,67};
      List<Integer> list=Arrays.asList(1,1,3,4,5,1,2,3,4,4,5,5,6,4,3,4,3,8,9,2,1,1,4,6,3,3,2,1,5,1);
      //print even numbers
      List<Integer> elist=list.stream().filter(x->x%2==0).collect(Collectors.toList());
      elist.forEach(z->System.out.println(z));
      //distinct element
      List<Integer> dlist=list.stream().distinct().collect(Collectors.toList());
      dlist.forEach(System.out::println);
      //sum of even distinct numbers
     Long edsum= list.stream().distinct().filter(c->c%2==0).reduce(0,(e,f)->e+f).longValue();
     //maxmimum number
     int maxnum=list.stream().mapToInt(f->f).max().orElseThrow();
     System.out.println(maxnum);
      // maximum number
      int maxNumber=list.stream().distinct().sorted((s,t)->t-s).findFirst().get();
      System.out.println("maxNumber"+maxNumber);
     //Second
     int sesonndhighestnum =list.stream().distinct().sorted((i,j)->j-i).skip(1).findFirst().get();

    System.out.println("second Hihest Number in java "+sesonndhighestnum);
     int n=4;
     //nth highest Number
    int nthhighestNumber=list.stream().distinct().sorted((q,r)->r-q).skip(n-1).findFirst().get();

    System.out.println("nthhighestNumber"+nthhighestNumber);





  }


}
