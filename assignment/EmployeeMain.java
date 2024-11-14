package assignment;

import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;


//Given a list of employees, use the Stream API to group employees by their department.
// Approach: Define an Employee class with department. Convert the list to a stream
// and use collect(Collectors.groupingBy(Employee::getDepartment)).

class Employee{

    String name;
    String department;

    static List<Employee> elist=new ArrayList<>();

    Employee(String name,String department){
        this.department=department;
        this.name = name;
        
    }

    public String getDepartment(){
        return department;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return name;
    }

}
public class EmployeeMain {

    public static void main(String[] args) {

        Employee e1=new Employee("JOY", "SALES");
        Employee.elist.add(e1);
        Employee e2=new Employee("Amit", "IT");
        Employee.elist.add(e2);
        Employee e3=new Employee("Raj", "HR");
        Employee.elist.add(e3);
        Employee e4=new Employee("Jerry", "SALES");
        Employee.elist.add(e4);
        Employee e5=new Employee("sid", "IT");
        Employee.elist.add(e5);

        Map<String,List<Employee>> result=Employee.elist.stream()
        .collect(Collectors.groupingBy(Employee :: getDepartment));

        result.forEach((department,elist)->{
            System.out.println(department+" : "+elist);
        });
       
        


        
    }
    
}
