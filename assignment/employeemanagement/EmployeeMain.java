package assignment.employeemanagement;

import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class EmployeeMain {

    public List<Employee> filterEmployees(List<Employee> elist){

        return elist.stream().filter((p)->p.getDepartment().equals("Engineering") && p.getSalary()>50000).collect(Collectors.toList());
    }

    public List<String> mapEmployees(List<Employee> elist){

        return elist.stream().filter((p)->p.getDepartment().equals("Engineering") && p.getSalary()>50000).map(p->p.getName()).collect(Collectors.toList());
    }

    public List<Employee> sortByAge(List<Employee> elist){

        return elist.stream().sorted(Comparator.comparingInt(Employee::getAge)).collect(Collectors.toList());
    }

    public String highestSalary(List<Employee> elist){

        return elist.stream().max((a,b)->a.salary>b.salary?1:-1).map(p->p.name).get();
    }

    public List<String> empNames(List<Employee> elist){

        return elist.stream().map(p->p.name).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        EmployeeMain e=new EmployeeMain();
        List<Employee> empList=new ArrayList<>();
        empList.add(new Employee(101,"Amit", 40000,"Engineering",24));
        empList.add(new Employee(102,"JOY", 60000,"MD",21));
        empList.add(new Employee(103,"Jerry", 70000,"HR",26));
        empList.add(new Employee(104,"Sumit", 100000,"Engineering",34));

       

        // List<Employee> elist= empList.stream()
        // .filter((p)->p.getDepartment().equals("Engineering") && p.getSalary()>50000).collect(Collectors.toList());
        // System.out.println("Employee with engineering department & salary>5000"+elist);

        // List<Employee> eList2=
        // empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
        // .collect(Collectors.toList());
        // System.out.println("salary decending order "+eList2);

        Map<String,List<Employee>> elist3=
        empList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(elist3);

        // List<String> list1=e.mapEmployees(empList);
        // System.out.println(list1);

        // List<Employee> list2=e.sortByAge(empList);
        // System.out.println(list2);

        // System.out.println("Highest: "+e.highestSalary(empList));

        // List<String> l=e.empNames(empList);
        // System.out.println(l);


    }
    
}
