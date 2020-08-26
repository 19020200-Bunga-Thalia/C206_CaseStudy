
import static org.junit.Assert.*;
// Junit
  import org.junit.After;
  import org.junit.Before;
  import org.junit.Test;
public class JUnit {
    private Outlet out1;
    private Outlet out2;
    
    @Before
    public void setUp() throws Exception {
      out1 = new Outlet(898,"Singapore Outlet","Karen");
      out2 = new Outlet(899,"Jurong Outlet","James");
    }
// 
    @After
    public void tearDown() throws Exception {
      out1 = null;
      out2 = null;
      OutletDB.outletList.clear();
    }

    @Test
    public void outletAdd_test() {
      //Test that the outlet arraylist is not null.
      assertNotNull("Test that the outlet arraylist is not null: ", OutletDB.outletList);
      
      //Test that the size of the outlet is 0 before adding any outlet information.
      assertEquals("Test that the size of the outlet arraylist is 0 before adding any outlet information", 0,
          OutletDB.outletList.size());
      
      //Test that the size of the outlet arraylist is 1 after adding 1 outlet information.
      OutletDB.addOutlet(out1);
      assertEquals("Test that the size of the outlet arraylist is 1 after adding 1 outlet information.", 1, 
          OutletDB.outletList.size());
      
      //Test that the first item in outlet arraylist is the same as the outlet that was added.
      assertSame("Test that the first item in outlet arraylist is the same as the outlet that was added.",out1, 
          OutletDB.outletList.get(0));
      
    }
    @Test
    public void OutletView_test() {
      
      //Test that the outlet arraylist is not null so that can add a new outlet.
      assertNotNull("Test that the outlet arraylist is not null: ", OutletDB.outletList);
      
      //Test that the list of outlet retrieved from the outlet arraylist is empty.
        String alloutlet = OutletDB.viewAllOutlet();
      String testoutput = "";
      assertEquals("Check that ViewAllOutlet list is empty", testoutput, alloutlet);
      
      //Test that the size of the outlet arraylist is 2 after adding 2 outlet.
      OutletDB.addOutlet(out1);
      OutletDB.addOutlet(out2);
      assertEquals("Test that the size of the outlet arraylist is 2 after adding 2 outlet information.", 2, 
          OutletDB.outletList.size());
      
      //Test that the expected output string same as the list of outlet retrieved from the outlet.
      alloutlet = OutletDB.viewAllOutlet();
      String testoutput1 = "";
      for(int i =0; i < OutletDB.outletList.size();i++) {
        testoutput1 +="Outlet Name: " + OutletDB.outletList.get(i).getOutlet_name() + "\n";
        testoutput1 +="Outlet ID: " + OutletDB.outletList.get(i).getOutlet_id() +"\n";
        testoutput1 +="Staff Outlet: " + OutletDB.outletList.get(i).getStaff() +"\n";
      }
      assertEquals("Test that the expected output string same as the list of outlet retrieved from the outlet.",
          testoutput1, alloutlet);
    
    }
    @Test
    public void outletDelete_test() {
      //Test that the outlet arraylist is not null.
      assertNotNull("Test that the outlet arraylist is not null: ", OutletDB.outletList);
      
      //Test that the size of the outlet arraylist is 1 after adding 1 outlet information.
      OutletDB.addOutlet(out1);
      assertEquals("Test that the size of the outlet arraylist is 1 after adding 1 outlet information", 1,  
          OutletDB.outletList.size());
      
      //Test that if name does not exist, return to "fail to delete"
      String output = OutletDB.delOutlet("fail to delete");
      assertEquals("Test that if name does not exist, return to \"fail to delete\"", "Fail to delete", output);
      
      //Test that the size of the outlet arraylist is 0 after deleting 1 outlet
      OutletDB.delOutlet(OutletDB.outletList.get(0).getOutlet_name());
      assertEquals("Test that the size of the outlet arraylist is 0 after deleting 1 outlet.",0,
          OutletDB.outletList.size());
      
    }
    @Test
    public void outletupdateStaffOutlet_test() {


    	//Test that the name of staff exist
      assertNotNull("Test that the name of staff exist: ", OutletDB.outletList);
      
      //Test that staff list is not null
      assertNotNull("Test that staff list is not null: ", OutletDB.outletList);
      
      //Test that if name does not exist, return to "fail to update"
      String output = OutletDB.updatestaffper_outlet("fail to update");
      assertEquals("Test that if name does not exist, return to \"fail to update\"", "Fail to update", output);
    }
    
    @Test
    public void outletsearch_test() {
      //Test that the outlet exist
      assertNotNull("Test that the outlet exist: ", OutletDB.outletList);
      
      //Test that outlet record book is not null
      assertNotNull("Test that outlet record book is not null: ", OutletDB.outletList);
      
      //Test that if outlet name does not exist, return to "outlet does not exist"
      String output = OutletDB.search_outlet("outlet does not exist");
      assertEquals("Test that if outlet name does not exist, return to \"Outlet does not exist\"",
          "Outlet does not exist", output);
    }
    }
