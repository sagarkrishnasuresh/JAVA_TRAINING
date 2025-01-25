package java_training.employeeSort;

import java.util.*;

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
        return "Employee{"+"employeeId=" + employeeId + ", employeeName='" +employeeName +"'}";
    }
}


class ContractEmployee extends Employee{

    private int contractId;

    public ContractEmployee(int employeeId, String employeeName, int contractId) {
        super(employeeId, employeeName);
        this.contractId = contractId;
    }

    public int getContractId(){ return contractId; }

    @Override
    public String toString() {
        return super.toString() + ", contract Id = " + contractId +'}';
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

        addRandomEmployees(employees,10);
        addRandomContractEmployees(employees,10);


        int empLength= employees.size();
        System.out.println("Size of array:"+ empLength);

        System.out.println("Original List:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nHow would you like to sort the employees?");
        System.out.println("1. By Name");
        System.out.println("2. By ID");
        System.out.println("3. By contract Id");
        System.out.print("Enter your choice (1 or 2 or 3): ");

        int choice = scanner.nextInt();
        employees.sort(Comparator.comparing(Employee::getEmployeeName));


        if(choice==1){

            System.out.println("\nSorted by Name:");
            for (Employee emp : employees) {
                System.out.println(emp);
            }

        }

        else if(choice==2){

            employees.sort(Comparator.comparing(Employee::getEmployeeId));

            System.out.println(("\nSorted ny Id:"));
            for (Employee emp : employees) {
                System.out.println(emp);
            }
        }

        else if(choice==3){

            employees.sort(Comparator.comparingInt(emp -> {
                if (emp instanceof ContractEmployee) {
                    return ((ContractEmployee) emp).getContractId();
                }
                return Integer.MAX_VALUE; // Regular employees are sorted to the end
            }));
            System.out.println("\nSorted by Contract ID (Contract Employees first):");
            for (Employee emp : employees) {
                System.out.println(emp);
            }

        }

        else {
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


