import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

	public class C206_CaseStudyTest {
		private Staff worker1;
		private Staff worker2;
		private ArrayList<Staff> staffList = new ArrayList<Staff>();
		
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

@After
  public void tearDown() throws Exception {
		worker1 = null;
		worker2 = null;

  }
//

}