public class NotEnoughBalanceState implements State {

   GumballMachine gumballMachine;
 
    public NotEnoughBalanceState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    /**
     * @see State#insert(int)
     */
    public void insert(int coin) {
        System.out.println("You inserted a coin of "+String.valueOf(coin)+ " cent(s).");
        gumballMachine.addBalance(coin);
        if (gumballMachine.getBalance()>=gumballMachine.getCost())
            gumballMachine.setState(gumballMachine.getHasEnoughBalanceState());
    }


    /**
     * @see State#eject(int)
     */
    public void eject() {
        if(gumballMachine.getCount()>0)
            System.out.println("All coin(s) returned");
        else 
            System.out.println("No coins returned!");
    }


    /**
     * @see State#turnCrank()
     */
    public void turnCrank() {
        System.out.println("You turned, but there's not enough blance to get a ball.");
    }


    /**
     * @see State#dispense()
     */
    public void dispense() {
        System.out.println("Not enough blance. You need to pay more.");
    }
	public String toString() {
		return "waiting for enough blance";
	}
}
