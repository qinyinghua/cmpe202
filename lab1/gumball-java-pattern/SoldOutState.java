public class SoldOutState implements State {
   GumballMachine gumballMachine;
 
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    /**
     * @see State#insert(int)
     */
    public void insert(int coin) {
        System.out.println("You can't insert a coin, the machine is sold out");
    }


    /**
     * @see State#eject(int)
     */
    public void eject() {
        if(gumballMachine.getCount()>0)
            System.out.println("All coin(s) returned");
        else 
            System.out.println("All coin(s) used. No coin(s) returned!");
    }


    /**
     * @see State#turnCrank()
     */
    public void turnCrank() {
        System.out.println("You turned, but there are no gumballs");
    }


    /**
     * @see State#dispense()
     */
    public void dispense() {

    }
    public String toString() {
        return "sold out";
    }

}
