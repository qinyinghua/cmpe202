public class HasEnoughBalanceState implements State {
    GumballMachine gumballMachine;
    HasEnoughBalanceState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
    }
    /**
     * @see State#insert(int)
     */
    public void insert(int coin) {
        System.out.println("Error!You can't insert another coin as you have enough balance.Turn crank now.");
    }


    /**
     * @see State#eject(int)
     */
    public void eject() {
		System.out.println("Coin returned");
		gumballMachine.setState(gumballMachine.getNotEnoughBalanceState());
    }


    /**
     * @see State#turnCrank()
     */
    public void turnCrank() {
	System.out.println("You turned...");
	gumballMachine.setState(gumballMachine.getSoldState());
    }


    /**
     * @see State#dispense()
     */
    public void dispense() {

    }
	public String toString() {
		return "waiting for turn of crank";
	}
}
