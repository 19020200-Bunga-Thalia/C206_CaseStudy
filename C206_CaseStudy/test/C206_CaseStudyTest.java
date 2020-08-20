import static org.junit.Assert.*;

import java.util.AbstractCollection;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

	public class C206_CaseStudyTest {
		private Staff worker1;
		private Staff worker2;
		private ArrayList<Staff> staffList = new ArrayList<Staff>();
		private Object productList;
		private Object transactionList;
		
		public C206_CaseStudyTest() {
			super();
		}

  @Before
  public void setUp() throws Exception {
		worker1 = new Staff(45, "Jerry", "15062002");
		worker2 = new Staff(46, "Mary", "15062001");
		
		staffList= new ArrayList<Staff>();
		
  }


  @Test
  //Test that staff in the list is the same
  public void add_stafftest() {
	  String allStaff= retrieveAllStaff(staffList);

	  allStaff= retrieveAllStaff(staffList);
	  String testOutput="";
		testOutput = String.format("%-10s %-30s %-10s %-10s %-20s\n",45,"Jerry", "15062002");
		testOutput += String.format("%-10s %-30s %-10s %-10s %-20s\n",46, "Mary", "15062001");	
		assertEquals("Test that retrieveAllStaff is same", testOutput, staffList);

    
  }
  private String retrieveAllStaff(ArrayList<Staff> staffList2) {
	// TODO Auto-generated method stub
	return null;
}

//===============KARLA ==============

  public class C206_CaseStudyTest {
    
    private Product p1;
    private Product p2;
    private ArrayList <Product> productList;
    public C206_CaseStudyTest() {
      super();
    }

    @Before
    public void setUp() throws Exception {
      t = new product("product name", "category "," price");}
      
      productList = new ArrayList<Product>();
    }

    @After
    public void tearDown() throws Exception {
      t = null;
      productList = null;
    }

    @Test
    public void c206_test() {
      //fail("Not yet implemented"); 
      assertTrue("C206_CaseStudy_SampleTest ",true);
      
      //normal (After adding product name, the transaction information list will increase)
      C206_CaseStudy.addTransaction(productList, p);
      assertEquals("Test if Transaction arraylist is 1?", 1, productList.size());
      
      //error (View a product that is null. System will display an error message);
      C206_CaseStudy.viewProduct(productList);
      assertNotNull("Check if the transaction list is null", productList);
      
      //boundary (After adding a productname into the product list, product information list cannot be null and must be filled up)
      assertNotNull("Check if there is valid Transaction information arraylist to add to", productList);
      
      @Before
      public void setUp1() throws Exception {
        t = new Transaction(19010017, "Valerie");
        
        transactionList = new ArrayList<Transaction>();
      }

      @After
      public void tearDown1() throws Exception {
        t = null;
        transactionList = null;
      }
      
      
      //============VALERIE=========

      @Test
      public void c206_test() {
        //fail("Not yet implemented"); 
        assertTrue("C206_CaseStudy_SampleTest ",true);
        
        //normal (After adding transaction information, the transaction information list will increase)
        C206_CaseStudy.addTransaction(transactionList, t);
        assertEquals("Test if Transaction arraylist is 1?", 1, ((ArrayList<Transaction>) transactionList).size());
        
        //error (View a transaction that is null. System will display an error message);
        C206_CaseStudy.viewTransaction(transactionList);
        assertNotNull("Check if the transaction list is null", transactionList);
        
        //boundary (After adding a transaction information into the transaction list, transaction information list cannot be null and must be filled up)
        assertNotNull("Check if there is valid Transaction information arraylist to add to", transactionList)      
    }

  }
//

}