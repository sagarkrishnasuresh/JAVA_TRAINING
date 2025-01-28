package com.example.employeeSort;

import java.util.*;

class Employee {
    private int employeeId;
    private String employeeName;

    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeId=" + employeeId + ", employeeName='" + employeeName + "'}";
    }
}


class ContractEmployee extends Employee {

    private int contractId;

    public ContractEmployee(int employeeId, String employeeName, int contractId) {
        super(employeeId, employeeName);
        this.contractId = contractId;
    }

    public int getContractId() {
        return contractId;
    }

    @Override
    public String toString() {
        return super.toString() + ", contract Id = " + contractId + '}';
    }
}


public class EmployeeSortDemo {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

//        employees.add(new Employee(102,"Alice"));
//        employees.add(new Employee(101,"Bob"));
//        employees.add(new Employee(104,"Charlie"));
//        employees.add(new Employee(103,"Justin"));
//        employees.add(new Employee(107,"John"));
//        employees.add(new Employee(106,"David"));
//        employees.add(new Employee(105,"Yash"));

        addRandomEmployees(employees, 10);
        addRandomContractEmployees(employees, 10);


        int empLength = employees.size();
        System.out.println("Size of array:" + empLength);

        System.out.println("Original List:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        Scanner scanner = new Scanner(System.in);

        Map<Integer, Comparator<Employee>> sortingOptions = new HashMap<>();
        sortingOptions.put(1, Comparator.comparing(Employee::getEmployeeName)); // Sort by Name
        sortingOptions.put(2, Comparator.comparing(Employee::getEmployeeId));  // Sort by ID
        sortingOptions.put(3, (e1, e2) -> { // Sort by Contract ID
            if (e1 instanceof ContractEmployee && e2 instanceof ContractEmployee) {
                return Integer.compare(
                        ((ContractEmployee) e1).getContractId(),
                        ((ContractEmployee) e2).getContractId()
                );
            } else if (e1 instanceof ContractEmployee) {
                return -1;
            } else if (e2 instanceof ContractEmployee) {
                return 1;
            }
            return 0;
        });

        System.out.println("\nHow would you like to sort the employees?");
        System.out.println("1. By Name");
        System.out.println("2. By ID");
        System.out.println("3. By Contract ID");
        System.out.print("Enter your choice (1, 2, or 3): ");

        int choice = scanner.nextInt();
        Comparator<Employee> comparator = sortingOptions.get(choice);

        if (comparator != null) {
            employees.sort(comparator);
            System.out.println("\nSorted List:");
            employees.forEach(System.out::println);
        } else {
            System.out.println("Invalid input!");
        }

        scanner.close();
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

    private static void addRandomContractEmployees(List<Employee> employees, int count) {
        Random random = new Random();
        String[] names = {"Kevin", "Laura", "Mona", "Nancy", "Oscar", "Paul", "Quincy", "Rachel", "Steve", "Tom"};

        for (int i = 0; i < count; i++) {
            int id = 100 + random.nextInt(900);
            String name = names[random.nextInt(names.length)];
            int contractDays = 1000 + random.nextInt(500); // Random contract days between 30 and 90
            employees.add(new ContractEmployee(id, name, contractDays));
        }

    }

}


