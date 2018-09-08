import java.util.Arrays;
import java.util.ArrayList;
public class GumballMachine
{

    private int num_gumballs;
    private boolean has_quarter;
    private int cost;
    private int[] coinsType;
    private int balance;


    public GumballMachine( int size, int cost, int[] coinsType )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
        this.cost = cost;
        this.coinsType = coinsType;
        this.balance=0;
    }

    private boolean isAccepted(int coin) {
        for(int coinType: coinsType)
             if (coinType==coin) return true;
        return false;
    }
    public void insert(int coin)
    {
        if (isAccepted(coin)) {
            balance+=coin;
            System.out.println("Coin ["+ String.valueOf(coin) + "] inserted! Balance:"+balance);
        }
        else {
            System.out.println( "Error! Only Coins "+Arrays.toString(coinsType)+ 
                                " Support.  Coin ["+ String.valueOf(coin) + "] Ejected!" ) ;
        }
   
    }
    
    public void turnCrank()
    {
    	if ( balance>=cost )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.balance-= cost ;
    			System.out.println( "Thanks for your coin.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "Error. Not enough balance. Please insert more coins." ) ;
    	}        
    }
    @Override 
    public String toString() {
        return String.format("\nGumballMachine Size:%s; Cost:%s; CoinsAccept:%s",
                              num_gumballs,cost,Arrays.toString(coinsType));
    }       
}
