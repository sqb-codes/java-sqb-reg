package OOPS.inheritance_codes;

class Loan {
    // TODO: Describe the behavior when we change the access specifier from public to something else
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
    public static void main(String[] args) {
        EduLoan eduLoan = new EduLoan();
        System.out.println("Applied for Edu Loan");
        eduLoan.docVerification(); // Loan class
        eduLoan.checkCreditScore(); // Overrided
        eduLoan.validateDegree(); // Self method

        System.out.println("=======================");

        VehicleLoan vehicleLoan = new VehicleLoan();
        System.out.println("Applied for Vehicle Loan");
        vehicleLoan.docVerification(); // Overrided
        vehicleLoan.checkCreditScore(); // Loan class
        vehicleLoan.validateDL(); // Self method

        System.out.println("=======================");
        PersonalLoan personalLoan = new PersonalLoan();
        personalLoan.checkCreditScore();
        personalLoan.docVerification();
        // TODO: How can we make checkCreditScore and docVerification reusable call
    }
}
