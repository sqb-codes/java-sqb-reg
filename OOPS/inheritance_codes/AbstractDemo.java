package OOPS.inheritance_codes;

// OCP - Open Closed Principle
// Class is Open for Extension but Closed for Modification

// Abstract class can contain abstract methods
// Purpose of creating abstract classes is that we want inheritance
abstract class Product {
    // abstract methods:
    // These methods will be implemented in child classes only
    // Abstract methods can only be inside abstract class
    abstract public void features();
    abstract public void vendor();

    // Abstract class can contain abstract methods as well as normal methods
    // That's why abstract classes are not 100% abstract
    // Normal/Concrete methods
    public void discounts() {
        System.out.println("Discount on all products is up to 5%");
    }
}

class Electronics extends Product {

    @Override
    public void features() {
        // Perform my business logic related to Electronics
    }

    @Override
    public void vendor() {
        // Perform my business logic related to vendor of electronics
    }

}

class Clothes extends Product {
    @Override
    public void features() {
        
    }

    @Override
    public void vendor() {
        
    }
}


class Furniture extends Product {
    @Override
    public void features() {
        
    }

    @Override
    public void vendor() {
        
    }
}


public class AbstractDemo {
    public static void main(String[] args) {
        // Object creation for abstract class is not allowed
        // Product obj = new Product();
    }
}
