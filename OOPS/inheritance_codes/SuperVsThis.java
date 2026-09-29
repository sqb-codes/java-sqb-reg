package OOPS.inheritance_codes;

class ParentA {
    int x;
    int z;
    public ParentA() {
        System.out.println("ParentA const. initialized...");
        this.x = 10;
    }
}

class ChildA extends ParentA {
    int x;
    public ChildA() {
        super();    // it was there by default, that's why ParentA constructor got called first
        System.out.println("ChildA const. initialized...");
        this.x = 20;
    }
    public void show() {
        // super - refers to parent class variable
        int y = this.x + super.x + z;
        System.out.println("Sum of y is: " + y);
    }
}

public class SuperVsThis {
    public static void main(String[] args) {
        ChildA obj = new ChildA();
        obj.show();
    }
}
