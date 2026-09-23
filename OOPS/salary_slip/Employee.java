package OOPS.salary_slip;

// SRP - Single Responsibility Principle
public class Employee {
    // Scope of variables
    /* 
    public
    private
    protected
    default
    */
    // Why private?
    // Encapsulation: Keep the data private and control access through methods
    private int empId;
    private String empName;
    private int leave;
    private double basicSalary;

    // Salary constants
    private static final double HRA_RATE = 0.30;
    private static final double DA_RATE = 0.15;
    private static final double TA_RATE = 0.20;
    private static final double MA_RATE = 0.15;
    private static final double PF_RATE = 0.10;
    private static final double TDS_RATE = 0.10;

    // Why static final ?
    // static - belongs to class, not inidivual employees
    // final - value cannot be changed

    // Add a constructor - to initialize private variables of our class
    public Employee(int empId, String empName, int leave, double basicSalary) {
        // this - reserved keyword - always points/refers to the current object
        this.empId = empId;
        this.empName = empName;
        this.leave = leave;
        this.basicSalary = basicSalary;
    }

    // Getters
    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public int getLeave() {
        return leave;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    // Earnings
    public double calculateHRA() {
        return basicSalary * HRA_RATE;
    }

    public double calculateTA() {
        return basicSalary * TA_RATE;
    }

    public double calculateMA() {
        return basicSalary * MA_RATE;
    }

    public double calculateDA() {
        return basicSalary * DA_RATE;
    }


    public double calculateGrossSalary() {
        return basicSalary
        + calculateHRA()
        + calculateDA()
        + calculateTA()
        + calculateMA();
    }

    public double calculatePF() {
        return basicSalary * PF_RATE;
    }

    public double calculateTaxableAmount() {
        return calculateGrossSalary() - calculatePF();
    }

    public double calculateTDS() {
        return calculateTaxableAmount() * TDS_RATE;
    }

    public double calulateNetSalary() {
        return calculateGrossSalary()
        - calculatePF()
        - calculateTDS();
    }

}
