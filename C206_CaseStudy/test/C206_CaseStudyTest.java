import static org.junit.Assert.*;

import java.util.AbstractCollection;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

	public class C206_CaseStudyTest {
		private Staff worker1;
		private Staff worker2;
	 ArrayList<Staff> staffList;
		
		private Product p1;
	    private Product p2;
	    ArrayList <Product> productList;
	    
	    private Customer c1;
	    private Customer c2;
	    ArrayList <Customer>
		
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


    
    

    @Before
    public void setUp11() throws Exception {
    	 //insert test data
    	p1 = new Product("Banana","fruits", 4);
    	  p2 = new Product("Apple", "fruits", 2);
    	  productList = new ArrayList<Product>();
      
      
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add_producttest() {
      
     
      
      //ADD NORMAL
      C206_CaseStudy.addProduct(productList, p1);
      assertEquals("Test if product arraylist is 1?", 1, productList.size());
      //ADD  (BOUNDARY)
      assertNotNull("Check if there is any item inside the product arraylist ", productList);
      
     //ADD (ERROR)
     assertSame("Test that the product is added same as 1st item of the list?", p1, productList.get(0));
    }
      
     //VIEW ( ERROR)
      public void view_producttest() {
      assertNotNull("Check if the product list is null", productList);
      
      //VIEW - boundary


      String allProduct = C206_CaseStudy.retrieveProductList(productList);
      String testoutput = "";
      assertEquals("Check that ViewAllproductList", testoutput, allProduct);
 
      // VIEW NORMAL
      assertEquals("Test that product arraylist size is 2", 2, productList.size());
      }
    
    public void delete_producttest() {
        //DELETE BOUNDARY
            assertNotNull("Test if there is valid product to delete", productList);
        //DELETE NORMAL
             productList.add(p1);  
            assertEquals("Test if that product arraylist size is 1?", 1, ( productList).size());
            productList.clear();
            assertEquals("Test if that product arraylist size is 0?", 0, productList.size());
          //DELETE ERROR 
            assertNotNull("Test if a product has been deleted despite product list being null", productList);
            }
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

      public class C206_CaseStudyTest {
    	  
    	  private Transaction t;
    	  private ArrayList <Transaction> transactionList;
    	  public C206_CaseStudyTest() {
    	    super();
    	  }

    	  @Before
    	  public void setUp() throws Exception {
    	    t = new Transaction(19010017, "Valerie");
    	    
    	    transactionList = new ArrayList<Transaction>();
    	  }

    	  @After
    	  public void tearDown() throws Exception {
    	    t = null;
    	    transactionList = null;
    	  }

    	  @Test
    	  public void c206_test() {
    	    //fail("Not yet implemented"); 
    	    assertTrue("C206_CaseStudy_SampleTest ",true);
    	    
    	  }
    	  
    	  @Test
    	  public void addTransactionInfoTest() {
    	    //==========Add Transaction==========
    	    //normal (After adding transaction information, the transaction information list will increase);
    	    C206_CaseStudy.addTransaction(transactionList, t);
    	    assertEquals("Test if Transaction arraylist is 1?", 1, transactionList.size());
    	  
    	    //error (if a duplicated transaction is added, display an error);
    	    C206_CaseStudy.addTransaction(transactionList, t);
    	    assertEquals("Test if a duplicated transaction is added?", 0, transactionList);
    	  
    	    //boundary (After adding a transaction information into the transaction list, transaction information list cannot be null and must be filled up);
    	    assertNotNull("Test if there is valid Transaction information arraylist to add to", transactionList);
    	    
    	  }
    	  
    	  @Test
    	  public void viewTransactionInfoTest() {
    	    //==========View Transaction==========
    	    //normal (View a transaction from the transaction list);
    	    C206_CaseStudy.viewTransaction(transactionList);
    	    assertNotEquals("Test if it a transaction from the transaction list is viewable", 0, transactionList);
    	    
    	    //error (View a transaction that is null. System will display an error message);
    	    C206_CaseStudy.viewTransaction(transactionList);
    	    assertNotNull("Test if the transaction list is null", transactionList);
    	    
    	    //boundary (View two transactions at once. System crashes as it can only be viewed one at a time);
    	    C206_CaseStudy.viewTransaction(transactionList);
    	    assertEquals("Test if two transactions can be viewed at once", 2, 1);
    	    
    	  }
    	  
    	  @Test
    	  public void deleteTransactionInfoTest() {
    	    ArrayList<Transaction> archiveList = null;
    	    //==========Archive Transaction==========
    	    //normal (After archiving an old transaction, transaction list size will reduce);
    	    C206_CaseStudy.archiveTransaction(transactionList, archiveList);
    	    assertEquals("Test if transaction arraylist is 0", 0, transactionList.size());
    	  
    	    //error (After archiving an old transaction, transaction list should not consist the old transaction again);
    	    C206_CaseStudy.archiveTransaction(transactionList, archiveList);
    	    assertEquals("Test if transaction arraylist still consists the old transaction", 0, transactionList);
    	  
    	    //boundary (Transaction list cannot be null before archiving an old transaction);
    	    assertNotNull("Test if an old transaction can be archived despite transaction list being null", transactionList);
    	    
    	  }
    	  


    	} //end of C206_CaseStudyTest    
    }

  }
//

}