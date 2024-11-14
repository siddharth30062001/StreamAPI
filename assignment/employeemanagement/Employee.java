package assignment.employeemanagement;

public class Employee {
    
    int id;
    String name;
    double salary;
    String department;
    int age;

    Employee(int id,String name, double salary, String department,int age){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.department=department;
        this.age=age;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public String getDepartment(){
        return department;
    }

    public int getID(){
        return id;
    }
    public int getAge(){
        return age;
    }

    public String toString(){
       return "id: "+id +" name: "+name+" salary: "+salary+" department: "+department+" age: "+age;
    }

    
}
