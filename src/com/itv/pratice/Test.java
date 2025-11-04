package com.itv.pratice;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Test {
    public static void main(String [] args){
        Employee empployee1=new Employee(17,"qwram1","zxece",8600);
        Employee empployee6=new Employee(617,"qwram1rt","zxece",2300);
        Employee empployee2=new Employee(81,"zdram1","rtece",7600);
        Employee empployee3=new Employee(91,"xcram1","tyece",9600);
        Employee empployee4=new Employee(14,"yuram1","yuece",6600);
        Employee empployee5=new Employee(614,"yuram1rt","yuece",9600);

        List<Employee> list=new ArrayList<Employee>();
        list.add( empployee1);
        list.add( empployee2);
        list.add( empployee3);
        list.add( empployee4);
        list.add( empployee5);
        list.add( empployee6);
        //Each department employee
        //count of number of employees in each Department
        //highest Salary in each Department
        //list of employee whose slary 2000;
        //highest salary in each department
        //nth highest salary in each department

         //employees according to there department Type
        Map<String,List<Employee>> emplistmapdept=list.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.toList()));
        emplistmapdept.entrySet().forEach(x->System.out.println(x.getKey()+"..."+x.getValue()));

        //Numberof employees in each Department
      Map<String,Long>  map=list.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
      map.entrySet().forEach(x->System.out.println(x.getKey()+x.getValue()));

      //maxmium salary each Department
     Map<String , Optional<Employee> >maph=  list.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
      maph.entrySet().forEach(x->System.out.println(x.getKey()+"...."+x.getValue()));

    }

}
