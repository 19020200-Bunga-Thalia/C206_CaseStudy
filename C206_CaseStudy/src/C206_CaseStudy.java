import java.util.ArrayList;
//
//

public class C206_CaseStudy {

	private static final int Add_Product = 0;
	private static final int View_ProductList = 0;
	private static final int Delete_Product = 0;
	private static final int OPTION_ARCHIVETRANSACTION = 2;
	  private static final int OPTION_ADDTRANSACTION = 1;
	  private static final int OPTION_VIEWALLTRANSACTION = 3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Staff> staffList = new ArrayList<Staff>();
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		ArrayList<Outlet> outletList = new ArrayList<Outlet>();
		ArrayList<Transaction> transactionList = new ArrayList<Transaction>();
		ArrayList<Transaction> archiveList = new ArrayList<Transaction>();
		
		staffList.add(new Staff(12, "Tom", "12122000"));
		staffList.add(new Staff(13, "Tim", "09112000"));
		customerList.add(new Customer(1, "Lisa", "88294751"));
		customerList.add(new Customer(2, "Chad", "95667208"));
		outletList.add(new Outlet(898,"Singapore Outlet","Karen","West Coast Outlet","Jurong Outlet"));
		outletList.add(new Outlet(898,"Singapore Outlet","Karen","West Coast Outlet","Jurong Outlet"));
		

		int option = -1;
		
		while (option != 6) {

			System.out.println("1. Staff");
			System.out.println("2. Product");
			System.out.println("3. Customer");
			System.out.println("4. Outlet");
			System.out.println("5. Transaction");
			System.out.println("6. Quit");
			Helper.line(80, "-");
			option = Helper.readInt("Enter an option : ");

			if (option == 1) {
			System.out.println("1. Add");
			System.out.println("2. Delete");
			System.out.println("3. View All");	
			int suboption=Helper.readInt("Enter option :");
			if(suboption==1) {
				C206_CaseStudy.addStaff(staffList);
			}else if(suboption==2) {
				C206_CaseStudy.deleteStaff(staffList);
			}else if(suboption==3) {
				C206_CaseStudy.viewAllStaff(staffList);
			}else {
				System.out.println("Invalid option");
			}
			} else if (option == 2) {
			
						
			} else if (option == 3) {
				System.out.println("1. Add");
				System.out.println("2. Delete");
				System.out.println("3. View All");	
				int suboption=Helper.readInt("Enter option :");
				if(suboption==1) {
					C206_CaseStudy.addCustomer(customerList);
				}else if(suboption==2) {
					C206_CaseStudy.deleteCustomer(customerList);
				}else if(suboption==3) {
					C206_CaseStudy.viewAllCustomer(customerList);
				}else {
					System.out.println("Invalid option");
				}
				}
				
			} else if (option == 4) {
				System.out.println("1. Add");
				System.out.println("2. Delete");
				System.out.println("3. View All");	
				int suboption=Helper.readInt("Enter option :");
				if(suboption==1) {
					C206_CaseStudy.addOutlet(staffList);
				}else if(suboption==2) {
					C206_CaseStudy.deleteOutlet(staffList);
				}else if(suboption==3) {
					C206_CaseStudy.viewAllOutlet(staffList);
				}
						
			}else if (option == 5) {
				System.out.println("1. Add");
				System.out.println("2. Archive");
				System.out.println("3. View All");	
				int suboption=Helper.readInt("Enter option :");
				if(suboption==1) {
					C206_CaseStudy.addTransaction(staffList);
				}else if(suboption==2) {
					C206_CaseStudy.archiveTransaction(staffList);
				}else if(suboption==3) {
					C206_CaseStudy.viewTransaction(staffList);
				}else {
					System.out.println("Invalid option");
				}
				}else {
				System.out.println("Invalid option");
			}

		}
	

		
	}
	
	//================STAFF (ALVIN) =======================
	
//================View staff=======================
	public static String retrieveAllStaff(ArrayList<Staff> staffList) {
		String output="";
		for (int i = 0; i < staffList.size(); i++) {
			output += String.format("%-25d %-25s %-25s \n", staffList.get(i).getStaff_id(),
					staffList.get(i).getStaff_name(),staffList.get(i).getStaff_birthdate());
		}
		return output;
	}
	public static void viewAllStaff(ArrayList<Staff> staffList) {
		Helper.line(80, "-");
		System.out.println("STAFF LIST");
		Helper.line(80, "-");
		String output = String.format("%-25s %-25s %-25s \n", "STAFF ID", "STAFF NAME",
				"BIRTHDATE");
		 output += retrieveAllStaff(staffList);	
		System.out.println(output);
	}
	
//================Add staff=======================

	public static void addStaff(ArrayList<Staff> staffList) {
		int staff_id = Helper.readInt("Enter Staff ID : ");
		String staff_name = Helper.readString("Enter Staff name : ");
		String staff_birthdate = Helper.readString("Enter birthdate (DDMMYYYY) : ");
		Staff st= new Staff(staff_id, staff_name, staff_birthdate);
		staffList.add(st);
		System.out.println("Staff added");
	}
	
//================Delete staff=======================  
	public static void deleteStaff(ArrayList<Staff> staffList) {
		if(staffList.size()==0) {
			System.out.println("There is nothing to be deleted in the list.");
		}else {
		C206_CaseStudy.viewAllStaff(staffList);
		int staff_id=Helper.readInt("Enter Staff ID that you want to remove :");
		int staffpos=-1;
		for (int i=0;i<staffList.size();i++) {
			if (staff_id==staffList.get(i).getStaff_id()) {
				staffpos=i;
			}
		}

		String yesNno=Helper.readString("You confirm want to delete ? (Yes/No):");
		if (yesNno.equalsIgnoreCase("Yes")) {

		String yes_no=Helper.readString("You confirm want to delete ? (Yes/No):");
		Object option;
		if (yes_no.equalsIgnoreCase("Yes")) {

			staffList.remove(staffpos);
			System.out.println("Staff has been deleted");
			
			
// =====================PRODUCT (KARLA)===========================

ArrayList<Product> productList;

			// ====================== view product =========================
			for (int i = 0; i < productList.size(); i++) {
				Product p = productList.get(i);
				System.out.println(String.format("%-10s %-30s %-10d", getProductName,getCategory, getPrice );
				
// ======================= ADD PRODUCT========================= 
				ArrayList<String> productList= new ArrayList<String>();
				String productName = Helper.readString("Enter a product to add > ");
				String category = Helper.readString("Enter category of produc > ");
				double price = Helper.readDouble("Enter price of product > ");
				String productA = Helper.readString(productName);
				productList.add(productA);
				    
				   }
				   
// ================== delete product ===============================
				    String productD= Helper.readString("Enter a product to delete > ");
				    for(int b = 0; b < productList.size(); b++) {
				     productList.remove(productD);
				     System.out.println("Item has been deleted!");
				    }
		}
		}
		}
	}
	
	// =====================CUSTOMER(BUNGA)===========================
	
	//================VIEW CUSTOMER=======================
	
		public static String retrieveAllCustomer(ArrayList<Customer> customerList) {
			String output="";
			for (int i = 0; i < customerList.size(); i++) {
				output += String.format("%-25d %-25s %-25s \n", customerList.get(i).getCust_id(), customerList.get(i).getCust_name(),staffList.get(i).getStaff_birthdate());
			}
			return output;
		}
		public static void viewAllCustomer(ArrayList<Customer> customerList) {
			Helper.line(80, "-");
			System.out.println("CUSTOMER LIST");
			Helper.line(80, "-");
			String output = String.format("%-25s %-25s %-25s \n", "CUSTOMER ID", "CUSTOMER NAME",
					"CONTACT NUMBER");
			 output += retrieveAllCustomer(customerList);	
			System.out.println(output);
		}
		
		// ======================= ADD CUSTOMER========================= 
		public static void addCustomer(ArrayList<Customer> customerList) {
			int customer_id = Helper.readInt("Enter Customer ID : ");
			String customer_name = Helper.readString("Enter Customer name : ");
			String customer_contact = Helper.readString("Enter customer contact number: ");
			Customer ct= new Customer(customer_id, customer_name, customer_contact);
			customerList.add(ct);
			System.out.println("Customer added");
		}
		
	// ======================= DELETE CUSTOMER========================= 
		public static void deleteCustomer(ArrayList<Customer> CustomerList) {
			if(CustomerList.size()==0) {
				System.out.println("There is nothing to be deleted in the list.");
			}else {
			C206_CaseStudy.viewAllCustomer(customerList);
			int staff_id=Helper.readInt("Enter Staff ID that you want to remove :");
			int staffpos=-1;
			for (int i=0;i<staffList.size();i++) {
				if (staff_id==staffList.get(i).getStaff_id()) {
					staffpos=i;
				}
			}

			String yesNno=Helper.readString("You confirm want to delete ? (Yes/No):");
			if (yesNno.equalsIgnoreCase("Yes")) {

			String yes_no=Helper.readString("You confirm want to delete ? (Yes/No):");
			Object option;
			if (yes_no.equalsIgnoreCase("Yes")) {

				staffList.remove(staffpos);
				System.out.println("Staff has been deleted");
		
	// =====================OUTLETS(GRACE)===========================
	// =====================TRANSACTION(VALERIE)===========================
}


	


