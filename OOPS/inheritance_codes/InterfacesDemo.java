package OOPS.inheritance_codes;


interface Player {
    // Define characterstics of player in interface
    // Those characterstics are common for every player
    // By default all the methods inside interface are abstract
    public void walk();     // abstract public void walk()
    public void run();
    public void jump();
    public void kick();
    public void puch();
    // we cannot defined body of a method inside interface...
    default public void superKick() {
        System.out.println("Method Body inside interface");
    }

}

// Now every class that implements the interface will implement all 5 methods
// What if 3 methods (walk, run and jump) contains same logic for all the player classes
// How we can make it reusable for player class

class King implements Player {

    @Override
    public void walk() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'walk'");
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

    @Override
    public void jump() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'jump'");
    }

    @Override
    public void kick() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'kick'");
    }

    @Override
    public void puch() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'puch'");
    }

}

class Eddy implements Player {

    @Override
    public void walk() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'walk'");
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

    @Override
    public void jump() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'jump'");
    }

    @Override
    public void kick() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'kick'");
    }

    @Override
    public void puch() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'puch'");
    }

}

public class InterfacesDemo {
    public static void main(String[] args) {
        
    }    
}
