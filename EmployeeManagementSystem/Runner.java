package com.gla.EmployeeManagementSystem;
import java.util.*;
public class Runner{
    public static void main(String[] args){
        Employee e1=new FullTimeEmployee(223,"Ashi Sharma",50000);
        Employee e2=new PartTimeEmployee(690,"Anju Sharma ",200,80);
        e1.assignDepartment("CSE");
        e2.assignDepartment("Electrical");
        ArrayList<Employee> employees=new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        for(Employee e:employees){
            e.displayDetails();
        }
    }
}