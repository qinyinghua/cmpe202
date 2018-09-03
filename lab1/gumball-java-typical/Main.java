

public class Main {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5,25,new int[]{25});
        System.out.println(gumballMachine);
        
        gumballMachine = new GumballMachine(15,50,new int[]{25});
        System.out.println(gumballMachine);
        
        gumballMachine = new GumballMachine(25,50,new int[]{1,5,10,25});
        System.out.println(gumballMachine);
        // System.out.println(gumballMachine);

        // gumballMachine.insertQuarter( 25 );
        // gumballMachine.turnCrank();

        // System.out.println(gumballMachine);

        // gumballMachine.insertQuarter( 25 );
        // gumballMachine.turnCrank();
        // gumballMachine.insertQuarter( 25 );
        // gumballMachine.turnCrank();

        //System.out.println(gumballMachine);
    }
}
