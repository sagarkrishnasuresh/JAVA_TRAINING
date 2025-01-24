Employee Sorting Application
Overview
This is a Java program that demonstrates sorting of employee objects. The program includes two types of employees:

Regular Employees
Contract Employees (who have an additional contractId field)
The application allows the user to sort the employees based on the following criteria:

By Name
By Employee ID
By Contract ID (for contract employees)
Features
Generates random employee data.
Supports sorting by different attributes using user input.
Demonstrates the use of inheritance (ContractEmployee extends Employee) and method overriding.
Implements polymorphism to handle sorting of contract-specific fields.
How It Works
Generate Employees:

The program generates a mix of random regular employees and contract employees.
Regular employees have an employeeId and employeeName.
Contract employees have an additional contractId.
User Input:

The user is prompted to choose how to sort the employees:
By Name
By Employee ID
By Contract ID
Sorting:

The selected sorting option is applied using Java's Comparator.
Output:

The sorted list of employees is displayed based on the chosen sorting criterion.
Code Structure
Classes:

Employee: Represents a regular employee with employeeId and employeeName.
ContractEmployee: Inherits from Employee and adds the contractId field.
EmployeeSortDemo: Main class containing the program logic.
Methods:

addRandomEmployees(List<Employee> employees, int count): Adds random regular employees.
addRandomContractEmployees(List<Employee> employees, int count): Adds random contract employees.
main(String[] args): Handles user interaction and performs sorting.