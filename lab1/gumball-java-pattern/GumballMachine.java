import java.util.Arrays;
public class GumballMachine {

    private int cost;
    private int[] coinsType;
    private int balance;
    private int count;
    
    private State state;
    private State soldOutState;
    private State soldState;
    private State notEnoughBalanceState;
    private State hasEnoughBalanceState;
        

    GumballMachine(int size,int cost, int[]coinsType) {
        this.count=size;
        this.cost=cost;
        this.coinsType=coinsType;
        this.balance=0;
        soldOutState=new SoldOutState(this);
        soldState=new SoldState(this);
        notEnoughBalanceState=new NotEnoughBalanceState(this);
        hasEnoughBalanceState=new HasEnoughBalanceState(this);
        
         if (count == 0) state = soldOutState;
         else state=notEnoughBalanceState;
	 

        
    }

    public void insert(int coin) {
         if (isAccepted(coin)) {
            //balance+=coin;
            //System.out.println("Coin ["+ String.valueOf(coin) + "] inserted! Balance:"+balance);
            state.insert(coin);
        }
        else {
            System.out.println( "Error! Only Coins "+Arrays.toString(coinsType)+ 
                                " Support.") ;
            eject();
        }
        
    }
    public void eject() {
        //System.out.println( "Coin ["+ String.valueOf(coin) + "] Ejected!" ) ;
        state.eject();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void dispense() {

    }

    public boolean isAccepted(int coin) {
        for(int coinType:coinsType)
        if (coinType==coin) return true;
        
        return false;
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
    }

    int getCount() {
        return count;
    }
    int getBalance(){
        return balance;
    }
    void addBalance(int coin){
        balance+=coin;
    }    
    int getCost(){
        return cost;
    }
    void refill(int count) {
        if (count>0) {
	this.count = count;
	state = notEnoughBalanceState;
        } else {
           System.out.println("Error! must more than 0 when refill.");
        }
        
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNotEnoughBalanceState() {
        return notEnoughBalanceState;
    }

    public State getHasEnoughBalanceState() {
        return hasEnoughBalanceState;
    }

    public State getSoldState() {
        return soldState;
    }
    
    	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2018");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\nPrice: " + cost + " cents");
		result.append("\nAccept coin type(s): " + Arrays.toString(coinsType));
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}

}
