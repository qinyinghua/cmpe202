import java.util.Arrays;
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
    }

    public void insertQuarter(int coin)
    {
        if ( coin == 25 )
            this.has_quarter = true ;
        else 
            this.has_quarter = false ;
    }
    
    public void turnCrank()
    {
    	if ( this.has_quarter )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.has_quarter = false ;
    			System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "Please insert a quarter" ) ;
    	}        
    }
    @Override 
    public String toString() {
        return String.format("GumballMachine Size:%s; Cost:%s; CoinsAccept:%s",
                              num_gumballs,cost,Arrays.toString(coinsType));
    }       
}
