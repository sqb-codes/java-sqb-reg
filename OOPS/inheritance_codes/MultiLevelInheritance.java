package OOPS.inheritance_codes;

class GrandParentB {
    int x = 12;
    int y = 10;
    public GrandParentB() {
        System.out.println("GrandParentB is called...");
    }
}

class ParentB extends GrandParentB {
    int x = 20;
    public ParentB() {
        super();
        System.out.println("ParentB is called...");
    }
}

class ChildB extends ParentB {
    int x = 30;
    public ChildB() {
        super();
        System.out.println("ChildB is called...");
    }
    public void show() {
        int result = this.x + super.x + y + ((GrandParentB)this).x;
        System.out.println("Value is: " + result);
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        ChildB obj = new ChildB();
        obj.show();
    }
}
