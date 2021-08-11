import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	//Stall
	private Stall stall1;
	private Stall stall2;
	private Stall [] stallArray;
	
	//
	
	@Before
	public void setUp() throws Exception {
		//Stall
		stallArray = new Stall [10];
		stall1 = new Stall(1, "Chicken Rice Stall", LocalDate.parse("2018-12-12"));
		stall2 = new Stall(2, "Western Food Stall", LocalDate.parse("2018-10-05"));
		
		//
	}

	@After
	public void tearDown() throws Exception {
		//Stall
		stall1 = null;
		stall2 = null;
		stallArray = null;
		
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}
	
	
	//Stall
	@Test
	public void addStall() {
		
		// Stall list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid Stall array to add to", stallArray);
		
		//Given an empty list, after adding 1 Stall, the size of the list is 1 - normal
		//The Stall just added is as same as the first stall of the list
		C206_CaseStudy.addStall(stallArray, stall1);
		assertEquals("Check that Stall ID 1 is added in Stall array", false, C206_CaseStudy.checkStall(stallArray, stall1));
		assertSame("Check that Stall is added", stall1, stallArray[0]);
		
		//Add another item. test The size of the list is 2? -normal
		//The item just added is as same as the second item of the list
		C206_CaseStudy.addStall(stallArray, stall2);
		assertEquals("Check that Stall ID 2 is added in Stall array", false, C206_CaseStudy.checkStall(stallArray, stall2));
		assertSame("Check that Stall is added", stall2, stallArray[1]);
	
		
	}

}
