package fiveguys;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class OrderTest {

	IOrder order;
	IFactory factory;
    @Before
    public void setUp()
    {
       factory=new Factory();
    }
    
	@Test
	public void testCreateOrder() {
		int seq=0;
		seq++;
		 order = new Order("test1",seq);
		 IComponent burger1=factory.getStaple("lcb");  //price 4.5
		 burger1.addChild(factory.getTopping("lettuce"));
		 burger1.addChild(factory.getTopping("grilled onions"));
		 burger1.addChild(factory.getTopping("pickles"));
		 order.addChild(burger1);
		 
		 assertTrue(burger1.count()==3); 
		 assertTrue(order.getTotal()==4.5); 
		 
		 IComponent burger2=factory.getStaple("lcb"); //price 4.5
		 burger2.addChild(factory.getTopping("lettuce"));
		 burger2.addChild(factory.getTopping("grilled onions"));
		 assertTrue(burger1.count()==3); 
		 assertTrue(burger2.count()==2);
		 
		 
		 order.addChild(burger2);
		 assertTrue(order.getTotal()==9); 
		 
		 assertTrue(order.count()==2); 
		 
	}

}
