# Employee Sorting Application

## Overview
This is a Java program that demonstrates sorting of employee objects. The program includes two types of employees:
- **Regular Employees**
- **Contract Employees** (who have an additional `contractId` field)

The application allows the user to sort the employees based on the following criteria:
1. By **Name**
2. By **Employee ID**
3. By **Contract ID** (for contract employees)

## Features
- Generates random employee data.
- Supports sorting by different attributes using user input.
- Demonstrates the use of inheritance (`ContractEmployee` extends `Employee`) and method overriding.
- Implements polymorphism to handle sorting of contract-specific fields.

## How It Works

### Generate Employees:
- The program generates a mix of random **regular employees** and **contract employees**.
- Regular employees have:
  - `employeeId`
  - `employeeName`
- Contract employees have:
  - `employeeId`
  - `employeeName`
  - `contractId`

### User Input:
- The user is prompted to choose how to sort the employees:
  1. By **Name**
  2. By **Employee ID**
  3. By **Contract ID**

### Sorting:
- The selected sorting option is applied using **Java's `Comparator`**.

### Output:
- The sorted list of employees is displayed based on the chosen sorting criterion.

## Code Structure

### Classes:
1. **`Employee`**:
   - Represents a regular employee with:
     - `employeeId`
     - `employeeName`
2. **`ContractEmployee`**:
   - Inherits from `Employee` and adds:
     - `contractId`
3. **`EmployeeSortDemo`**:
   - Main class containing the program logic.

### Methods:
1. **`addRandomEmployees(List<Employee> employees, int count)`**:
   - Adds random regular employees.
2. **`addRandomContractEmployees(List<Employee> employees, int count)`**:
   - Adds random contract employees.
3. **`main(String[] args)`**:
   - Handles user interaction and performs sorting.

