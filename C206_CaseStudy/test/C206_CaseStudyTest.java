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
public class C206_CaseStudyTest {
	private Product p1;
	private Product p2;
	private ArrayList<Product> staffList = new ArrayList<Product>();
	
	public C206_CaseStudyTest() {
		super();}
		  public void setUp() throws Exception {
				p1 = new Product("Banana","fruits", 4);
				p2 = new Product("Apple", "fruits", 2);
				
				productList= new ArrayList<product>();}
		
  public void tearDown() throws Exception {
		worker1 = null;
		worker2 = null;
		option = 0;
        while (option != 5) {
          C206_CaseStudy.productMenu();
          option = Helper.readInt("Enter an option > ");
          if (option == Add_Product) {
            String ProductName= Helper.readInt("Enter new product name > ");
            String category = Helper.readString("Enter category> ");
           int price = Helper.readInt("Enter price > ");
            productList.add(new product(ProductName, category, price));
          }
          else if (option == View_ProductList) {
            C206_CaseStudy.viewProductList(productList);
            
          }
          else if (option == Delete_Product) {
            int ID = Helper.readInt("Enter product ID > ");
            for (int i = 0; i < productList.size(); i++) {
              if (ID == productList.get(i).getProductID()) {
                productList.remove(i);
              }
            }
          }
          else if (option == Exit_Product) {
            System.out.println("Bye!");
          }
          else {
            System.out.println("Invalid Option.");
          }
        }
        public static void productMenu() {
            C206_CaseStudy.setHeader("Product List");
            System.out.println("1. Add Product");
            System.out.println("2. View Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Quit");
            Helper.line(80, "-");
          }
        public static String retrieveProductList (ArrayList<product> productList) {
            String output = " ";
            for (int i = 0; i < productList.size(); i++) {
              output += String.format("%d %-20s %-20s %-20d", (i+1), productList.get(i).getProductName(), productList.get(i).getCategory(), productList.get(i).getPrice());
            }
            return output;
          }
          public static void viewProductList(ArrayList<product> productList) {
            C206_CaseStudy.setHeader("PRODUCT LisT");
            String output = String.format("%s %-20s", "PRODUCT", "$");
            output += retrieveProductList(productList);
            System.out.println(output);
          }

  }
//

}