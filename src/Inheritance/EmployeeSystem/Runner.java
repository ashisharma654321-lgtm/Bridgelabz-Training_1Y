package Inheritance.EmployeeSystem;

public class Runner{
    public static void main(String[] args){
        Employee[] employees=new Employee[3];
        employees[0]=new Manager("Kratika",87,89999,3);
        employees[1]=new Developer("Shraddha",74,123000,"Java");
        employees[2]=new Intern("Alia",143,22000,4);
        for(Employee e:employees){
            e.displayDetails();
            System.out.println();
        }
    }
}