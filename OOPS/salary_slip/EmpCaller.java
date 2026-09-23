package OOPS.salary_slip;

public class EmpCaller {
    public static void main(String[] args) {
        // Employee - data type
        // emp - reference variable
        // new - create new object in memory
        // Employee() - default constructor inside Employee class
        // Employee emp = new Employee();
        // System.out.println(emp);
        
        // We cannot access empId because it's private inside Employee class
        // System.out.println(emp.empId);

        // Call parameterised constructor
        Employee emp = new Employee(101, "John", 3, 56_000);
        System.out.println("=======================");
        System.out.println("Emp ID : " + emp.getEmpId());
        System.out.println("Emp Name : " + emp.getEmpName());
        System.out.println("Emp Leave : " + emp.getLeave());
        System.out.println("Emp Basic Salary : " + emp.getBasicSalary());

        System.out.println("=======================");

        System.out.println("Earning of Employee...");
        System.out.println("HRA : " + emp.calculateHRA());
        System.out.println("TA  : " + emp.calculateTA());
        System.out.println("DA  : " + emp.calculateDA());
        System.out.println("MA  : " + emp.calculateMA());

        System.out.println("=======================");

        System.out.println("Gross Salary:       " + emp.calculateGrossSalary());
        System.out.println("PF:                 " + emp.calculatePF());
        System.out.println("Taxabale Amount:    " + emp.calculateTaxableAmount());
        System.out.println("TDS:                " + emp.calculateTDS());

        System.out.println("=======================");

        System.out.println("Net Salary : " + emp.calulateNetSalary());

    }
}
