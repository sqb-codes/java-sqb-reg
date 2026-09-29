package OOPS.inheritance_codes;

import java.util.ArrayList;
import java.util.List;

class Loan {
    public void docVerification() {
        System.out.println("Document verification required");
    }

    public void checkCreditScore() {
        System.out.println("Checking user's credit score");
        System.out.println("Minimum credit score should be 700");
    }
}

class EduLoan extends Loan {
    // Method Overriding
    @Override 
    public void checkCreditScore() {
        System.out.println("Checking user's credit score for Education Loan");
        System.out.println("Minimum credit score should be 650");
    }

    public void validateDegree() {
        System.out.println("Degree verification is required...");
    }
}

class VehicleLoan extends Loan {
    // Method Overriding
    @Override 
    public void docVerification() {
        System.out.println("Only DL - Document verification required");
    }
    public void validateDL() {
        System.out.println("DL verification is required...");
    }
}

class PersonalLoan extends Loan {

}


public class InheritanceDemo {

    public static void caller(Loan loan) {
        loan.docVerification();
        loan.checkCreditScore();
        if(loan instanceof EduLoan) {
            EduLoan eduLoan = (EduLoan)loan;
            eduLoan.validateDegree();
        } else if (loan instanceof VehicleLoan) {
            VehicleLoan vehicleLoan = (VehicleLoan) loan;
            vehicleLoan.validateDL();
        }
    }

    public static void main(String[] args) {
        // EduLoan eduLoan = new EduLoan();
        // List<Integer> list = new ArrayList<>();
        // Take parent class as type and create object of child class
        // LSP - Liskov Substitution Principle
        Loan loan = new EduLoan();
        System.out.println("Applied for Edu Loan");
        caller(loan);
        // loan.docVerification(); // Loan class
        // loan.checkCreditScore(); // Overrided
        // loan.validateDegree(); // Self method

        System.out.println("=======================");

        // VehicleLoan vehicleLoan = new VehicleLoan();
        loan = new VehicleLoan();
        System.out.println("Applied for Vehicle Loan");
        caller(loan);
        // loan.docVerification(); // Overrided
        // loan.checkCreditScore(); // Loan class
        // loan.validateDL(); // Self method

        System.out.println("=======================");
        // PersonalLoan personalLoan = new PersonalLoan();
        loan = new PersonalLoan();
        caller(loan);
        // loan.checkCreditScore();
        // loan.docVerification();
    }
}
