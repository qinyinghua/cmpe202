package fiveguys;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FactoryTest {

	IFactory factory;
    @Before
    public void setUp()
    {
       factory=new Factory();
    }
    
	@Test
	public void testFactoryTopping() {
		IComponent p1=factory.getTopping("pickles");
		IComponent p2=factory.getTopping("pickles");
		assertFalse(p1==p2);
		assertTrue(p1.getPrice()==0);
	}
	
	@Test
	public void testFactoryDrinks() {
		IComponent p1=factory.getDrink("regular");
		IComponent p2=factory.getDrink("large");
		IComponent p3=factory.getDrink("bottled water");
		assertFalse(p1==p2);
		assertFalse(p1==p3);
		assertTrue(p1.getPrice()==1);
	}
	
	
	@Test
	public void testFactoryFries() {
		IComponent p1=factory.getFry("little FGS");
		IComponent p2=factory.getFry("large FGS");
		IComponent p3=factory.getFry("little FGS");
		assertFalse(p1==p2);
		assertFalse(p1==p3);
	}
	
	
	@Test
	public void testFactoryDogs() {
		IComponent p1=factory.getStaple("kd");
		IComponent p2=factory.getStaple("cd");
		assertTrue(p1.getPrice()==2.5);
		assertFalse(p1==p2);
		assertTrue(p2.getPrice()==2.5);
		
	}

}
