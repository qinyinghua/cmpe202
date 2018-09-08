

public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine25(5);
		System.out.println(gumballMachine);
		gumballMachine.insert(5);
		gumballMachine.insert(25);
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
		
		gumballMachine = new GumballMachine25(1);
		System.out.println(gumballMachine);
		gumballMachine.insert(5);
		gumballMachine.insert(25);
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
		
		gumballMachine = new GumballMachine50A(5);
		System.out.println(gumballMachine);
		gumballMachine.insert(25);
		gumballMachine.turnCrank();
		gumballMachine.insert(25);
		gumballMachine.turnCrank();		
		System.out.println(gumballMachine);

		gumballMachine = new GumballMachine50B(5);
		System.out.println(gumballMachine);
		gumballMachine.insert(5);
		gumballMachine.turnCrank();
		gumballMachine.insert(25);
		gumballMachine.turnCrank();
		gumballMachine.insert(25);
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
		
		

	}
}
