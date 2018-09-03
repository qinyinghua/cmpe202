

public class Main {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5,25,new int[]{25});
        System.out.println(gumballMachine);
        gumballMachine.insertQuarter( 5 );
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter( 25 );
        gumballMachine.turnCrank();        
        
        gumballMachine = new GumballMachine(15,50,new int[]{25});
        System.out.println(gumballMachine);
        gumballMachine.insertQuarter( 10 );
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter( 25 );
        gumballMachine.turnCrank();    
        gumballMachine.insertQuarter( 25 );
        gumballMachine.turnCrank();        
        
        gumballMachine = new GumballMachine(25,50,new int[]{1,5,10,25});
        System.out.println(gumballMachine);
        gumballMachine.insertQuarter( 25 );
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter( 5 );
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter( 25 );
        gumballMachine.turnCrank();
        
    }
}
