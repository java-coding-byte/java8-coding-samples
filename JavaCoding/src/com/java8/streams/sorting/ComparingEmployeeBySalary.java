package com.java8.streams.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparingEmployeeBySalary {
	
	String name;
    int age;
    double salary;
    
    public ComparingEmployeeBySalary(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    
   public static void main(String[] args) {
	   List<ComparingEmployeeBySalary> employees=
			   Arrays.asList(new ComparingEmployeeBySalary("Alice",30,70000),
					   new ComparingEmployeeBySalary("Bob",25,50000),
					   new ComparingEmployeeBySalary("Charlie",30,80000));
	   
	   employees.sort(Comparator.comparing((ComparingEmployeeBySalary e)->e.age)
			   .thenComparing((ComparingEmployeeBySalary e)->e.salary,Comparator.naturalOrder()));
	   
	   System.out.println("Sorted Employees in reverse Order.."+employees);
	   
}

   @Override
   public String toString() {
       return name + " (Age: " + age + ", Salary: " + salary + ")";
   }

}
