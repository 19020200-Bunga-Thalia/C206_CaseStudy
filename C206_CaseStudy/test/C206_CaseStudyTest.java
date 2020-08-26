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
	ArrayList<Product> productList;

	private Customer c1;
	private Customer c2;
	private Customer c3;
	ArrayList<Customer> customerList;

	private Outlet o1;
	private Outlet o2;
	ArrayList<Outlet> outletList;

	private Transaction t;
	private ArrayList<Transaction> transactionList;

	public C206_CaseStudyTest() {
		super();
	}
//===============ALVIN ==============

	@Before
	public void setUp1() throws Exception {
		worker1 = new Staff(45, "Jerry", "15062002");
		worker2 = new Staff(46, "Mary", "15062001");

		staffList = new ArrayList<Staff>();

	}

	@Test
	// Test that staff in the list is the same
	public void view_stafftest() {
		// fail("Not yet implemented");
		// Test if staff list is not null but empty - boundary
		assertNotNull("Test if there is valid Staff arraylist to retrieve item from", staffList);

		// Given an empty list, after adding 2 items, test if the size of the list is 2
		// - normal
		staffList.add(worker1);
		staffList.add(worker2);
		assertEquals("Test that staff arraylist size is 2", 2, staffList.size());
		// Error message occurs when list of staff is 1 when there is 2 - Error
		staffList.add(worker1);
		assertNotSame("Test if the list is the same", 2, staffList.size());
	}

	@Test
	public void add_stafftest() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Test if there is valid staff arraylist to add to", staffList);

		// Given an empty list, after adding 1 item, the size of the list is 1 - normal
		staffList.add(worker1);
		assertEquals("Test if that staff arraylist size is 1?", 1, staffList.size());
		// Error when having two of the same workers in the list - Error
		staffList.add(worker1);
		staffList.add(worker1);
		assertSame("Test if there is the same worker in the list", staffList.get(0), staffList.get(1));

	}

	@Test
	public void delete_stafftest() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Test if there is valid staff arraylist to add to", staffList);
		// Given a list of name, deleting the list will make it empty - normal
		staffList.add(worker1);
		assertEquals("Test if that staff arraylist size is 1?", 1, staffList.size());
		staffList.clear();
		assertEquals("Test if that staff arraylist size is 0?", 0, staffList.size());
		// Error removing an empty list - error
		staffList.clear();
		assertNotNull("Position is empty hence nothing to remove", staffList);

	}

	private String retrieveAllStaff(ArrayList<Staff> staffList2) {
		// TODO Auto-generated method stub
		return null;
	}

	@After
	public void tearDown1() throws Exception {
		worker1 = null;
		worker2 = null;

	}
//

//===============KARLA ==============

	@Before
	public void setUp2() throws Exception {
		// insert test data
		p1 = new Product("Banana", "fruits", 4, "f");
		p2 = new Product("Apple", "fruits", 2, "c");
		

	}

	@After
	public void tearDown2() throws Exception {
	}

	@Test
	public void add_producttest() {

		// ADD NORMAL
		C206_CaseStudy.addProduct(productList, p1);
		assertEquals("Test if product arraylist is 1?", 1, productList.size());
		// ADD (BOUNDARY)
		assertNotNull("Check if there is any item inside the product arraylist ", productList);

		// ADD (ERROR)
		assertSame("Test that the product is added same as 1st item of the list?", p1, productList.get(0));
	}

	// VIEW ( ERROR)
	public void view_producttest() {
		assertNotNull("Check if the product list is null", productList);

		// VIEW - boundary

		String allProduct = C206_CaseStudy.retrieveProductList(productList);
		String testoutput = "";
		assertEquals("Check that ViewAllproductList", testoutput, allProduct);

		// VIEW NORMAL
		assertEquals("Test that product arraylist size is 2", 2, productList.size());
	}

	public void delete_producttest() {
		// DELETE BOUNDARY
		assertNotNull("Test if there is valid product to delete", productList);
		// DELETE NORMAL
		productList.add(p1);
		assertEquals("Test if that product arraylist size is 1?", 1, (productList).size());
		productList.clear();
		assertEquals("Test if that product arraylist size is 0?", 0, productList.size());
		// DELETE ERROR
		assertNotNull("Test if a product has been deleted despite product list being null", productList);
	}
		
		// search for vendor normal 
		
		// search for vendor error
		// search for vendor boundary 
		
		public void TopVendorsreturnTest() {
		    // boundary
			assertEquals("Test if that product arraylist size is 0?", 0, productList.size());
		    
		  
		    // normal - Given an empty list, after returning 2 vendors, test if the size of the list is 0
		    C206_CaseStudy.addProduct(productList, p1);
		    C206_CaseStudy.addProduct(productList, p2);
		    C206_CaseStudy.addReturnVendor(productList);
		    assertEquals("Test that the vendor in product arraylist size is 0", 0, productList.size());
		      
		    // Test that the top vendor return in the productList can't be viewed if it's empty - error
		    assertEquals("Test that vendor in the productList is empty after return", 0, productList.size());
		      
		  
		
	}

	@Before
	public void setUp22() throws Exception {
		t = new Transaction(19010017, "Valerie");

		transactionList = new ArrayList<Transaction>();
	}

	@After
	public void tearDown22() throws Exception {
		t = null;
		transactionList = null;
	}

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
		  public void archiveTransactionInfoTest() {
		    ArrayList<Transaction> archiveList = new ArrayList<Transaction>();
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
		  
		  @Test
		  public void updateATransactionInfoTest() {
		  //==========Update a Transaction==========
		  //normal (Update a transaction from the transaction list);
		    C206_CaseStudy.updateTransaction(transactionList);
		    assertEquals("Test if transaction arraylist consists the transaction that one wants to update", 1, transactionList);
		  //error (Update a transaction that is null. System will display an error message);
		    C206_CaseStudy.updateTransaction(transactionList);
		    assertNotNull("Test if the transaction list is null when updating", transactionList);
		  //boundary (Transaction list cannot be null before updating);
		    C206_CaseStudy.updateTransaction(transactionList);
		    assertNotNull("Test if transaction list is null before updating", transactionList);
		    
		  }
		  

	// ============BUNGA=========

	@Before
	public void setUp3() throws Exception {
		c1 = new Customer(22, "Brenda", 12345678, 3);
		c2 = new Customer(33, "Max", 88237651, 2);
		c3 = new Customer (44, "May", 123456789, 1);
		customerList = new ArrayList<Customer>();

	}
	
	@After
	public void tearDown3() throws Exception {
		customerList.clear();
	}

	@Test
	public void add_customertest() {
		//NORMAL: New customer data added will increase the array list size
		customerList.add(c1);
		assertEquals("Test if customer arraylist size is 1?", 1, customerList.size());
		
		
		//BOUNDARY: When adding customer's contact number, it should contain 8 integers
		customerList.add(c3);
		String contact = Integer.toString(customerList.get(1).getCust_phone());
		assertEquals("Test if contact number field contain 8 integers?", 8, contact.length());
		
		//ERROR: Entering a duplicate customer data such as user id will display error message
	    customerList.add(c1);
	    customerList.add(c1);
	    assertNotSame("Test if a duplicated transaction is added?", customerList.get(0), customerList.get(1));
	}

	@Test
	public void view_customertest() {
		// NORMAL: Return 2 customers when given product arrayList size = 2
		customerList.add(c1);
		customerList.add(c2);
		assertEquals("Test if customer arraylist size is 2?", 2, customerList.size());
		
		// BOUNDARY: Customer list cannot be null before it is displayed
		assertNotNull("Test that there is data in Customer arraylist to retrieve", customerList);
		
		// ERROR: Only a portion of customer data is displayed
		customerList.add(c1);
		customerList.add(c2);
		assertEquals("Test if two customer data is displayed", 0, customerList.size());
		

	}

	@Test
	public void delete_customertest() {
		//NORMAL: Customer information is successfully deleted
		customerList.add(c1);
		customerList.add(c2);
		assertEquals("Test if customer array list is 2?", 2, customerList.size());
		customerList.clear();
		assertEquals("Test if customer array list is 0?", 0, customerList.size());
		
		//BOUNDARY: Customer list cannot be null before a customer information is deleted
		assertNotNull("Test if customer array list is not null", customerList);
		
		//ERROR: Deleted customer should not be in the array list
		customerList.add(c1);
		customerList.add(c2);
		customerList.remove(c1);
		customerList.remove(c2);
		assertEquals("Test if customer data is no longer in the array list",1, customerList);
		

	}

	// ============GRACE=========
	@Before
	public void setUp4() throws Exception {
		o1 = new Outlet(898, "Singapore Outlet", "Karen", "West Coast Outlet", "Jurong Outlet");
		o2 = new Outlet(900, "Singapore Outlet", "Karen", "West Coast Outlet", "Jurong Outlet");
	}

	@After
	public void tearDown4() throws Exception {
		o1 = null;
		o2 = null;
		OutletDB.outletList.clear();
	}

	@Test
	public void outletAdd_test() {
		// Test that the outlet arraylist is not null.
		assertNotNull("Test that the outlet arraylist is not null: ", OutletDB.outletList);

		// Test that the size of the outlet is 0 before adding any outlet information.
		assertEquals("Test that the size of the outlet arraylist is 0 before adding any outlet information", 0,
				OutletDB.outletList.size());

		// Test that the size of the outlet arraylist is 1 after adding 1 outlet
		// information.
		OutletDB.addOutlet(o1);
		assertEquals("Test that the size of the outlet arraylist is 1 after adding 1 outlet information.", 1,
				OutletDB.outletList.size());

		// Test that the first item in outlet arraylist is the same as the outlet that
		// was added.
		assertSame("Test that the first item in outlet arraylist is the same as the outlet that was added.", o1,
				OutletDB.outletList.get(0));

	}

	@Test
	public void OutletView_test() {

		// Test that the outlet arraylist is not null so that can add a new outlet.
		assertNotNull("Test that the outlet arraylist is not null: ", OutletDB.outletList);

		// Test that the list of outlet retrieved from the outlet arraylist is empty.
		String alloutlet = OutletDB.viewAllOutlet();
		String testoutput = "";
		assertEquals("Check that ViewAllOutlet list is empty", testoutput, alloutlet);

		// Test that the size of the outlet arraylist is 2 after adding 2 outlet.
		OutletDB.addOutlet(o1);
		OutletDB.addOutlet(o2);
		assertEquals("Test that the size of the outlet arraylist is 2 after adding 2 outlet information.", 2,
				OutletDB.outletList.size());

		// Test that the expected output string same as the list of outlet retrieved
		// from the outlet.
		alloutlet = OutletDB.viewAllOutlet();
		String testoutput1 = "";
		for (int i = 0; i < OutletDB.outletList.size(); i++) {
			testoutput1 += "Outlet Name: " + OutletDB.outletList.get(i).getOutlet_name() + "\n";
			testoutput1 += "Outlet ID: " + OutletDB.outletList.get(i).getOutlet_id() + "\n";
			testoutput1 += "Staff Outlet: " + OutletDB.outletList.get(i).getStaff_outlet() + "\n";
		}
		assertEquals("Test that the expected output string same as the list of outlet retrieved from the outlet.",
				testoutput1, alloutlet);

	}

	@Test
	public void outletDelete_test() {
		// Test that the outlet arraylist is not null.
		assertNotNull("Test that the outlet arraylist is not null: ", OutletDB.outletList);

		// Test that the size of the outlet arraylist is 1 after adding 1 outlet
		// information.
		OutletDB.addOutlet(o1);
		assertEquals("Test that the size of the outlet arraylist is 1 after adding 1 outlet information", 1,
				OutletDB.outletList.size());

		// Test that if name does not exist, return to "fail to delete"
		String output = OutletDB.delOutlet("fail to delete");
		assertEquals("Test that if name does not exist, return to \"fail to delete\"", "Fail to delete", output);

		// Test that the size of the outlet arraylist is 0 after deleting 1 outlet
		OutletDB.delOutlet(OutletDB.outletList.get(0).getOutlet_name());
		assertEquals("Test that the size of the outlet arraylist is 0 after deleting 1 outlet.", 0,
				OutletDB.outletList.size());

	}

	

	// ============VALERIE=========

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
	  public void archiveTransactionInfoTest() {
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