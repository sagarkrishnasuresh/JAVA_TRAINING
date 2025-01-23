package JAVA_TRAINING.employeeSort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

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

//        employees.add(new Employee(102,"Alice"));
//        employees.add(new Employee(101,"Bob"));
//        employees.add(new Employee(104,"Charlie"));
//        employees.add(new Employee(103,"Justin"));
//        employees.add(new Employee(107,"John"));
//        employees.add(new Employee(106,"David"));
//        employees.add(new Employee(105,"Yash"));

        addRandomEmployees(employees,20);

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

    private static void addRandomEmployees(List<Employee> employees, int count) {
        Random random = new Random();
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Hank", "Ivy", "Jack",
                "Kevin", "Laura", "Mona", "Nancy", "Oscar", "Paul", "Quincy", "Rachel", "Steve", "Tom"};

        for (int i = 0; i < count; i++) {
            int id = 100 + random.nextInt(900);
            String name = names[random.nextInt(names.length)];
            employees.add(new Employee(id, name));
        }
    }

}


