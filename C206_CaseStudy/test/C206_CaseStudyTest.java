import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private Order od1;
	private Order od2;
	ArrayList<Order> orderList;

	@Before
	public void setUp() throws Exception {
		od1 = new Order(1, "Rice", 4, LocalDate.parse("2018-12-05"));
		od2 = new Order(2, "Vegetables", 6, LocalDate.parse("2018-02-15"));
		orderList = new ArrayList<Order>();
	}

	

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}
	
	@Test
	public void testAddOrder() {
		assertNotNull("Test if there is valid Order arraylist to add to", orderList);
		
		C206_CaseStudy.addOrder(orderList, od1);		
		assertEquals("Test if that Order arraylist size is 1?", 1, orderList.size());
		
		assertSame("Test that Order is added same as 1st item of the list?", od1, orderList.get(0));
	
		
		C206_CaseStudy.addOrder(orderList, od2);
		assertEquals("Test that Order arraylist size is 2?", 2, orderList.size());
		
	}
	
	@Test
	public void testRetrieveAllOrders() {
		// Test if Item list is not null but empty, so that can add a new item
		assertNotNull("Test if there is valid Order arraylist to add to", orderList);
		
		//test if the list of Orders retrieved from the orders is empty
				String allOrders= C206_CaseStudy.retrieveAllOrders(orderList);
				String testOutput = "";
				assertEquals("Check that ViewAllOrderlist", testOutput, allOrders);
				
		//Given an empty list, after adding 2 items, test if the size of the list is 2
				C206_CaseStudy.addOrder(orderList, od1);
				C206_CaseStudy.addOrder(orderList, od2);
		assertEquals("Test if that Order arraylist size is 2?", 2, orderList.size());
		
		//test if the expected output string same as the list of Orders retrieved from the file
		allOrders= C206_CaseStudy.retrieveAllOrders(orderList);

		testOutput = String.format("%-10d %-20s %-10d %-10s\n",1, "Rice", 4, LocalDate.parse("2018-12-05"));
		testOutput += String.format("%-10d %-20s %-10d %-10s\n",2, "Vegetables", 6, LocalDate.parse("2018-02-15"));
	
		assertEquals("Check that ViewAllOrderlist", testOutput, allOrders);
		
	}
	
	@Test 
	public void testDeleteOrders(){
		assertNotNull("Test if there is valid Order arraylist to delete from", orderList);
		assertEquals("Test that Order arraylist size is 2?", 2, orderList.size());
		C206_CaseStudy.doDeleteOrder(orderList, 1);
		assertEquals("Test if that Order arraylist size is 1 and the file is deleted", 1, orderList.size());
	}
	
	@After
	public void tearDown() throws Exception {
		od1 = null;
		od2 = null;
		orderList = null;
		
	}
	
	
}
