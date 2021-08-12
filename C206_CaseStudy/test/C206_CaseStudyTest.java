import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	//Stall
	private Stall stall1;
	private Stall stall2;
	private Stall [] stallArray;
	private PromotionOffer po1;
	private PromotionOffer po2;
	private PromotionOffer po3;
	private PromotionOffer po4;
	private PromotionOffer po5;

	private ArrayList<PromotionOffer> Promotionlist;
	
	//
	
	@Before
	public void setUp() throws Exception {
		//Stall
		stallArray = new Stall [10];
		stall1 = new Stall(1, "Chicken Rice Stall", LocalDate.parse("2018-12-12"));
		stall2 = new Stall(2, "Western Food Stall", LocalDate.parse("2018-10-05"));
		
		//PromotionOffer
		po1 = new PromotionOffer(1,"Promotion setA food item",0);
		po2 = new PromotionOffer(2,"Promotion setB food item",0);
		po3 = new PromotionOffer(3,"Promotion setC food item",0);
		po4 = new PromotionOffer(4,"Promotion setD food item",0);
		po5 = new PromotionOffer(5,"Promotion setE food item",0);
		Promotionlist=new ArrayList<PromotionOffer>();
		Promotionlist.add(po1);
		Promotionlist.add(po2);
		Promotionlist.add(po3);
		Promotionlist.add(po4);
		Promotionlist.add(po5);
     
		
	}

	@After
	public void tearDown() throws Exception {
		//Stall
		stall1 = null;
		stall2 = null;
		stallArray = null;
		po1=null;
		po2=null;
		po3=null;
		po4=null;
		po5=null;
		Promotionlist=null;
		
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
	@Test
	public void AddPromotion() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Test if there is valid Promotion arraylist to add to", Promotionlist);
		
		
		
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		C206_CaseStudy.addPromotionOffer(Promotionlist, po1,stallArray);		
		assertEquals("Test that Promotion arraylist size is 1?", 5, Promotionlist.size());
		//The item just added is as same as the first item of the list
		assertSame("Test that Promotioncode is added same as 1st item of the list?", po1, Promotionlist.get(0));
		
		//Add another item. test The size of the list is 2? - normal
		//The item just added is as same as the second item of the list
		C206_CaseStudy.addPromotionOffer(Promotionlist, po2,stallArray);
		assertSame("Test that Promotioncode is added same as 1st item of the list?", po2, Promotionlist.get(1));
		
		//Add another item. test The size of the list is 2? - normal
		//The item just added is as same as the second item of the list
		C206_CaseStudy.addPromotionOffer(Promotionlist, po3,stallArray);
		assertSame("Test that Promotioncode is added same as 1st item of the list?", po3, Promotionlist.get(2));
		
		//Add another item. test The size of the list is 2? - normal
		//The item just added is as same as the second item of the list
		C206_CaseStudy.addPromotionOffer(Promotionlist, po4,stallArray);
		assertSame("Test that Promotioncode is added same as 1st item of the list?", po4, Promotionlist.get(3));
				
		//Add another item. test The size of the list is 2? - normal
		//The item just added is as same as the second item of the list
		C206_CaseStudy.addPromotionOffer(Promotionlist, po5,stallArray);
		assertSame("Test that Promotioncode is added same as 1st item of the list?", po5, Promotionlist.get(4));
				
				
		
	}
	@Test
	public void ViewAllPromotion() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid Promotion arraylist to retrieve item", Promotionlist);
		
		//test if the list of Promotion retrieved from the SourceCentre is empty - boundary
		String allPromotion= C206_CaseStudy.viewAllPromotionOffer(Promotionlist);
		String testOutput = String.format("%-15s %-30s %-25s\n", "PromotionCode", "FoodItem", "Stall-ID");
		 testOutput += String.format("%-15s%-30s%-25s\n", "1","Promotion setA food item","0");
		 testOutput += String.format("%-15s%-30s%-25s\n", "2","Promotion setB food item","0");
		 testOutput += String.format("%-15s%-30s%-25s\n", "3","Promotion setC food item","0");
		 testOutput += String.format("%-15s%-30s%-25s\n", "4","Promotion setD food item","0");
		 testOutput += String.format("%-15s%-30s%-25s\n", "5","Promotion setE food item","0");
			assertEquals("Check that ViewAllCamcorderlist",allPromotion,testOutput);

		
		//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
		C206_CaseStudy.addPromotionOffer(Promotionlist, po1,stallArray);
		C206_CaseStudy.addPromotionOffer(Promotionlist, po2,stallArray);
		C206_CaseStudy.addPromotionOffer(Promotionlist, po3,stallArray);
		C206_CaseStudy.addPromotionOffer(Promotionlist, po4,stallArray);
		C206_CaseStudy.addPromotionOffer(Promotionlist, po5,stallArray);
		assertSame("Test that Promotioncode is added same as 1st item of the list?", po1, Promotionlist.get(0));
		assertSame("Test that Promotioncode is added same as 1st item of the list?", po2, Promotionlist.get(1));
		assertSame("Test that Promotioncode is added same as 1st item of the list?", po3, Promotionlist.get(2));
		assertSame("Test that Promotioncode is added same as 1st item of the list?", po4, Promotionlist.get(3));
		assertSame("Test that Promotioncode is added same as 1st item of the list?", po5, Promotionlist.get(4));
		
		
		
		
		
		
		

	
		
		
	}
	@Test
	public void deleteAllPromotion() {
		Promotionlist.add(po1); 
		Promotionlist.add(po2);
		Promotionlist.add(po3);
		Promotionlist.add(po4);
		Promotionlist.add(po5);
		
		assertFalse(C206_CaseStudy.deletePromotionOffer(Promotionlist,po1.getPromotionCode()));	
		assertEquals("Test that Promotion arraylist size is 5", 0, Promotionlist.get(0).getStallID());
		
		assertNotNull(Promotionlist);
		C206_CaseStudy.viewAllPromotionOffer(Promotionlist);
		Promotionlist.remove(po2);
		
		
		
	}
	
	
	
      
		
	

}
