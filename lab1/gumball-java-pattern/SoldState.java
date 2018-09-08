public class SoldState implements State {

    GumballMachine gumballMachine;
 
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    /**
     * @see State#insert(int)
     */
    public void insert(int coin) {
        System.out.println("Please wait, we're already giving you a gumball");
    }


    /**
     * @see State#eject(int)
     */
    public void eject() {
        System.out.println("Sorry, you already turned the crank");
    }


    /**
     * @see State#turnCrank()
     */
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }


    /**
     * @see State#dispense()
     */
    public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNotEnoughBalanceState());
		} else {
			System.out.println("Oops, out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
			gumballMachine.eject();
		}
    }
	public String toString() {
		return "dispensing a gumball";
	}
}
