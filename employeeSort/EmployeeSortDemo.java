package JAVA_TRAINING.employeeSort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee {
    private int employeeId;
    private String employeeName;

    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public int getEmployeeId(){
        return employeeId;
    }
    public String getEmployeeName(){
        return employeeName;
    }

    @Override
    public String toString(){
        return "Employee{"+"employeeId=" + employeeId + ", employeeName='" +employeeName +'\'' +'}';
    }
}

public class EmployeeSortDemo{
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(102,"Alice"));
        employees.add(new Employee(101,"Bob"));
        employees.add(new Employee(104,"Charlie"));
        employees.add(new Employee(103,"Justin"));
        employees.add(new Employee(107,"John"));
        employees.add(new Employee(106,"David"));
        employees.add(new Employee(105,"Yash"));

        System.out.println("Original List:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        employees.sort(Comparator.comparing(Employee::getEmployeeName));

        System.out.println("\nSorted by Name:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        employees.sort(Comparator.comparing(Employee::getEmployeeId));

        System.out.println(("\nSorted ny Id:"));
        for (Employee emp : employees) {
            System.out.println(emp);
        }

    }

}

