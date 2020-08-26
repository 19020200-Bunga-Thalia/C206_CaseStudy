import java.util.ArrayList;
//
//

public class C206_CaseStudy {

	private static final int OPTION_UPDATEPRODUCTTRANSACTION = 4;
	private static final int Add_Product = 1;
	private static final int View_ProductList = 3;
	private static final int Delete_Product = 2;
	private static final int OPTION_UPDATETRANSACTION = 4;
	private static final int OPTION_ARCHIVETRANSACTION = 3;
	private static final int OPTION_ADDTRANSACTION = 2;
	private static final int OPTION_VIEWALLTRANSACTION = 1;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Staff> staffList = new ArrayList<Staff>();
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		ArrayList<Outlet> outletList = new ArrayList<Outlet>();
		 ArrayList<Transaction> transactionList = new ArrayList<Transaction>();
		ArrayList<Transaction> archiveList = new ArrayList<Transaction>();
		    
		    
		    
		staffList.add(new Staff(12, "Tom", "12122000", 1));
		staffList.add(new Staff(13, "Tim", "09112000", 2));
		customerList.add(new Customer(1, "Lisa", 88294751, 1));
		customerList.add(new Customer(2, "Chad", 95667208, 2));
		outletList.add(new Outlet(898, "Karla outlet", "Karen", "West Coast Outlet", "Jurong Outlet"," Susan" , "Tampines Outlet"));
		outletList.add(new Outlet(900, "Singapore Outlet", "Karen", "West Coast Outlet", "Jurong Outlet", "Susan" , "Tampines Outlet")); 
	


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
				System.out.println("4. Update");
				int suboption = Helper.readInt("Enter option :");
				if (suboption == 1) {
					C206_CaseStudy.addStaff(staffList);
				} else if (suboption == 2) {
					C206_CaseStudy.deleteStaff(staffList);
				} else if (suboption == 3) {
					C206_CaseStudy.viewAllStaff(staffList);
				} else if (suboption == 4) {
					C206_CaseStudy.updateStaff(staffList);
				}

				else {
					System.out.println("Invalid option");
				}
			} else if (option == 2) {
				System.out.println("1. Add");
				System.out.println("2. Delete");
				System.out.println("3. View All");
				System.out.println("4. Search Vendor");
				System.out.println("5. View highest return vendor");
				System.out.println("6. Return");
				int suboption = Helper.readInt("Enter option: ");
				if (suboption == Add_Product) {
					Product p = inputProduct();
					C206_CaseStudy.addProduct(productList, p);
				} else if (suboption == Delete_Product) {
					C206_CaseStudy.deleteProduct(productList);
				} else if (suboption == View_ProductList) {
					C206_CaseStudy.viewProductList(productList);
				} else if (suboption == 4) {
					C206_CaseStudy.findVendor(productList);
				} else if (suboption == 5) {
					C206_CaseStudy.viewHighestVendor(productList);
				} else if (suboption == 6) {
					C206_CaseStudy.addReturnVendor(productList);
				} else {
					System.out.println("Invalid Option");
				}

			} else if (option == 3) {
				System.out.println("1. Add New Customer");
				System.out.println("2. Delete Customer");
				System.out.println("3. Update Customer Return History");
				System.out.println("4. View All Customers");
				int suboption = Helper.readInt("Enter option :");
				if (suboption == 1) {
					C206_CaseStudy.addCustomer(customerList);
				} else if (suboption == 2) {
					C206_CaseStudy.deleteCustomer(customerList);
				} else if (suboption == 3) {
					C206_CaseStudy.updateCustomer(customerList);
				} else if (suboption == 4) {
					C206_CaseStudy.viewAllCustomer(customerList);
				} else {
					System.out.println("Invalid option");
				}
			}

			else if (option == 4) {
				System.out.println("1. Add");
				System.out.println("2. Delete");
				System.out.println("3. View All");
				int suboption = Helper.readInt("Enter option :");
				if (suboption == 1) {
					C206_CaseStudy.addAllOutlet(outletList);
				} else if (suboption == 2) {
					C206_CaseStudy.deleteAllOutlet(outletList);
				} else if (suboption == 3) {
					C206_CaseStudy.viewAllOutlet(outletList);
				}

			} else if (option == 5) {
				System.out.println("1. View");
				System.out.println("2. Add");
				System.out.println("3. Archive");
				System.out.println("4. Update");
				option = Helper.readInt("Enter an option > ");
				if (option == OPTION_VIEWALLTRANSACTION) {
					// View all transactions
					C206_CaseStudy.setHeader("VIEW");
					C206_CaseStudy.viewTransaction(transactionList);

				} else if (option == OPTION_ADDTRANSACTION) {
					// Add transaction
					C206_CaseStudy.setHeader("ADD");
					Transaction addTrans = inputTransaction();
					C206_CaseStudy.addTransaction(transactionList, addTrans);

				} else if (option == OPTION_ARCHIVETRANSACTION) {
					// Archive Transaction
					C206_CaseStudy.setHeader("Archive");
					C206_CaseStudy.archiveTransaction(transactionList, archiveList);

				} else if (option == OPTION_UPDATEPRODUCTTRANSACTION) {
					// Update Transaction
					C206_CaseStudy.setHeader("Update");
					C206_CaseStudy.updateTransaction(transactionList, productList);
				}

			} else if (option == 6) {
				System.out.println("Program Exit");
			} else {
				System.out.println("Invalid Option");
			}
		}

	}

	// ================STAFF (ALVIN) =======================

//================View staff=======================
	public static String retrieveAllStaff(ArrayList<Staff> staffList) {
		String output = "";
		for (int i = 0; i < staffList.size(); i++) {
			output += String.format("%-25d %-25s %-25s %-25s \n", staffList.get(i).getStaff_id(),
					staffList.get(i).getStaff_name(), staffList.get(i).getStaff_birthdate(),
					staffList.get(i).getStaff_outletID());
		}
		return output;
	}

	public static void viewAllStaff(ArrayList<Staff> staffList) {
		Helper.line(80, "-");
		System.out.println("STAFF LIST");
		Helper.line(80, "-");
		String output = String.format("%-25s %-25s %-25s %-25s \n", "STAFF ID", "STAFF NAME", "BIRTHDATE", "OUTLET ID");
		output += retrieveAllStaff(staffList);
		System.out.println(output);
	}

//================Add staff=======================

	public static void addStaff(ArrayList<Staff> staffList) {
		int staff_id = Helper.readInt("Enter Staff ID : ");
		String staff_name = Helper.readString("Enter Staff name : ");
		String staff_birthdate = Helper.readString("Enter birthdate (DDMMYYYY) : ");
		int staff_outletID = Helper.readInt("Enter staff outlet ID: ");
		Staff st = new Staff(staff_id, staff_name, staff_birthdate, staff_outletID);
		staffList.add(st);
		System.out.println("Staff added");
	}

//================Delete staff=======================  
	public static void deleteStaff(ArrayList<Staff> staffList) {
		if (staffList.size() == 0) {
			System.out.println("There is nothing to be deleted in the list.");
		} else {
			C206_CaseStudy.viewAllStaff(staffList);
			int staff_id = Helper.readInt("Enter Staff ID that you want to remove :");
			int staffpos = -1;
			for (int i = 0; i < staffList.size(); i++) {
				if (staff_id == staffList.get(i).getStaff_id()) {
					staffpos = i;
				}
			}

			String yesNno = Helper.readString("You confirm want to delete ? (Yes/No):");
			if (yesNno.equalsIgnoreCase("Yes")) {

				String yes_no = Helper.readString("You confirm want to delete ? (Yes/No):");
				Object option;
				if (yes_no.equalsIgnoreCase("Yes")) {

					staffList.remove(staffpos);
					System.out.println("Staff has been deleted");

				}
			}
		}
	}

	// ================Update staff=======================
	public static void updateStaff(ArrayList<Staff> staffList) {
		int updatestaff1 = Helper.readInt("Enter ID of Staff to update: ");
		for (int i = 0; i < staffList.size(); i++) {
			if (updatestaff1 == staffList.get(i).getStaff_id()) {
				int update_staffid = Helper.readInt("Enter new staff ID: ");
				String update_staffname = Helper.readString("Enter new name: ");
				String update_staffbirthdate = Helper.readString("Enter new birthdate: ");
				int update_staffoutlet = Helper.readInt("Enter new outlet ID: ");
				staffList.get(i).setStaff_id(update_staffid);
				staffList.get(i).setStaff_name(update_staffname);
				staffList.get(i).setStaff_birthdate(update_staffbirthdate);
				staffList.get(i).setStaff_outletID(update_staffoutlet);

			}
		}
	}

	// =====================PRODUCT (KARLA)===========================

	// ====================== view product =========================
	public static String retrieveProductList(ArrayList<Product> productList) {
		String output = " ";
		for (int i = 0; i < productList.size(); i++) {
			output += String.format("%-20s %-20s %-20s $%-20.2f %-20s \n", productList.get(i).getProductName(),
					productList.get(i).getDescription(), productList.get(i).getCategory(),
					productList.get(i).getprice(), productList.get(i).getVendor());

		}
		return output;
	}

	public static void viewProductList(ArrayList<Product> productList) {
		String output = String.format("%-20s %-20s %-20s %-20s %-20s\n", "Product Name", "Description", "Category",
				"Price", "Vendor");
		output += C206_CaseStudy.retrieveProductList(productList);
		System.out.println(output);
	}

//======================= ADD PRODUCT========================= 
	public static Product inputProduct() {
		String productName = Helper.readString("Enter a product to add > ");
		String description = Helper.readString("Enter description of product");
		String category = Helper.readString("Enter category of product > ");
		double price = Helper.readDouble("Enter price of product > ");
		String vendor = Helper.readString("Enter vendor of product > ");
		Product p = new Product(productName, description, category, price, vendor);
		return p;
	}

	public static void addProduct(ArrayList<Product> productList, Product p) {
		productList.add(p);
		System.out.println("Product has been added");
	}

//================== delete product ===============================
	public static void deleteProduct(ArrayList<Product> productList) {
		int productpos = findProduct(productList);
		productList.remove(productpos);
		System.out.println("Successfully deleted");
	}

	public static int findProduct(ArrayList<Product> productList) {
		String productName = Helper.readString("Enter product name to be deleted: ");
		int productpos = -1;
		for (int i = 0; i < productList.size(); i++) {
			if (productName.equalsIgnoreCase(productList.get(i).getProductName())) {
				productpos = i;
			}
		}
		return productpos;
	}

//=======================Return product with top vendor return========================
	public static void addReturnVendor(ArrayList<Product> productList) {

		String returnProduct = Helper.readString("Enter product to return > ");
		String returnVendor = Helper.readString("Enter vendor to return > ");
		int pos = 0;
		for (int i = 0; i < productList.size(); i++) {
			if ((returnProduct.equalsIgnoreCase(productList.get(i).getProductName())
					&& (returnVendor.equalsIgnoreCase(productList.get(i).getVendor())))) {
				productList.get(i).setPoints(productList.get(i).getPoints() + 1);
				pos = 1;
				break;
			}
		}
		if (pos == 1) {
			System.out.println("Successful return");
		} else {
			System.out.println("Invalid Product/Vendor");
		}

	}

	public static void viewHighestVendor(ArrayList<Product> productList) {

		int highestpoints = 0;
		String vendorName = "";
		for (int i = 0; i < productList.size(); i++) {
			if (highestpoints < productList.get(i).getPoints()) {
				highestpoints = productList.get(i).getPoints();
				vendorName = productList.get(i).getVendor();
			}
		}
		System.out.println("Highest vendor is " + vendorName);
	}

//=======================Search for vendor================================
	public static void findVendor(ArrayList<Product> productList) {
		String v = Helper.readString("Enter the vendor you want to find > ");
		String output = String.format("%-20s %-20s %-20s %-20s\n", "Product Name", "Category", "Price", "Vendor");
		for (int i = 0; i < productList.size(); i++) {
			if (v.equalsIgnoreCase(productList.get(i).getVendor())) {
				output += String.format("%-20s %-20s $%-20.2f %-20s \n", productList.get(i).getProductName(),
						productList.get(i).getCategory(), productList.get(i).getprice(),
						productList.get(i).getVendor());
			} else {
				System.out.println("There are no such vendor");
			}
			System.out.println(output);
		}
	}

	// =====================CUSTOMER(BUNGA)===========================

	// ================VIEW CUSTOMER / BY HISTORY=======================

	public static String retrieveAllCustomer(ArrayList<Customer> customerList) {
		String output = "";
		for (int i = 0; i < customerList.size(); i++) {
			output += String.format("%-25d %-25s %-25d %-25d \n", customerList.get(i).getCust_id(),
					customerList.get(i).getCust_name(), customerList.get(i).getCust_phone(),
					customerList.get(i).getCust_returns());
		}
		return output;
	}

	public static void viewAllCustomer(ArrayList<Customer> customerList) {
		Helper.line(80, "-");
		System.out.println("CUSTOMER LIST");
		Helper.line(80, "-");
		String output = String.format("%-25s %-25s %-25s %-25s \n", "CUSTOMER ID", "CUSTOMER NAME", "CONTACT NUMBER",
				"NO. OF RETURNS");
		output += retrieveAllCustomer(customerList);
		System.out.println(output);
	}

	// ======================= ADD CUSTOMER=========================
	public static void addCustomer(ArrayList<Customer> customerList) {
		int customer_id = 0;
		for (int i = 0; i < customerList.size(); i++) {
			if (customer_id <= customerList.get(i).getCust_id()) {
				customer_id = customerList.get(i).getCust_id();
				customer_id++;
			}
		}
		String customer_name = Helper.readString("Enter Customer name : ");
		int customer_contact = Helper.readInt("Enter customer contact number: ");
		String phone = Integer.toString(customer_contact);
		while (phone.length() < 8 || phone.length() > 8) {
			System.out.println("Please enter a valid phone number");
			customer_contact = Helper.readInt("Enter customer contact number: ");
			phone = Integer.toString(customer_contact);
			if (phone.length() == 8) {
				int customer_returns = Helper.readInt("Enter number of returns made: ");
				Customer ct = new Customer(customer_id, customer_name, customer_contact, customer_returns);
				customerList.add(ct);
				System.out.println("Customer added");
			}
		}

	}

	// ======================= DELETE CUSTOMER=========================
	public static void deleteCustomer(ArrayList<Customer> customerList) {
		if (customerList.size() == 0) {
			System.out.println("There is nothing to be deleted in the list.");
		} else {
			C206_CaseStudy.viewAllCustomer(customerList);
			int customer_id = Helper.readInt("Enter Customer ID that you want to remove :");
			for (int i = 0; i < customerList.size(); i++) {
				if (customer_id == customerList.get(i).getCust_id()) {
					String yesNno = Helper.readString("Are you sure you want to delete this ? (Yes/No):");
					if (yesNno.equalsIgnoreCase("Yes")) {
						customerList.remove(i);
					}
					System.out.println(" Customer has been deleted");
				}
			}
		}
	}

	// ================ UPDATE CUSTOMER RETURN HISTORY =======================
	public static void updateCustomer(ArrayList<Customer> customerList) {
		int customer_id = Helper.readInt("Enter Customer ID: ");
		for (int i = 0; i < customerList.size(); i++) {
			if (customer_id == customerList.get(i).getCust_id()) {
				int updated_returns = Helper.readInt("Enter updated number of returns: ");
				customerList.get(i).getCust_returns();

			}
		}
	}

	// =====================OUTLETS(GRACE)===========================

	// ===================== VIEW OUTLETS===========================

	public static void viewAllOutlet(ArrayList<Outlet> outletList) {
		Helper.line(45, "=");
		System.out.println("view outlet List");
		Helper.line(45, "=");

		if (outletList.isEmpty()) {
			System.out.println("There is no outlet available.");
		} else {
			String out = String.format(" %-10s %-5s %-15s %-20s %-5s %-20s %-15s\n ", "OUTLET ID", "OUTLET NAME ",
					"STAFF OUTLET ", "AVAILABLE OUTLET", "UNAVAILABLE OUTLET", "UPDATE STAFF PER OUTLET",
					"SEARCH AN OUTLET");
			for (int i = 0; i < outletList.size(); i++) {
				Outlet sss = outletList.get(i);
				out += String.format("%-10d %-5s %-15s %-20s %-5s %-20s %-15s\n", sss.getOutlet_id(),
						sss.getOutlet_name(), sss.getStaff_outlet(), sss.getAvailable_outlet(),
						sss.getUnavailable_outlet(), sss.getupdatestaffper_outlet(), sss.getsearch_outlet());
			}
			System.out.println(out);
		}
	}

	// =====================ADD OUTLETS===========================
	public static void addAllOutlet(ArrayList<Outlet> outletList) {
		Helper.line(45, "=");
		System.out.println("add outlet List");
		Helper.line(45, "=");

		if (outletList.isEmpty()) {
			System.out.println("There is no outlet available.");
		} else {
			String out = String.format(" %-10s %-5s %-15s %-20s %-5s %-20s %-15s\n ", "OUTLET ID", "OUTLET NAME ",
					"STAFF OUTLET ", "AVAILABLE OUTLET", "UNAVAILABLE OUTLET", "UPDATE STAFF PER OUTLET",
					"SEARCH AN OUTLET");
			for (int i = 0; i < outletList.size(); i++) {
				Outlet sss = outletList.get(i);
				out += String.format("%-10d %-5s %-15s %-20s %-5s %-20s %-15s\n", sss.getOutlet_id(),
						sss.getOutlet_name(), sss.getStaff_outlet(), sss.getAvailable_outlet(),
						sss.getUnavailable_outlet(), sss.getupdatestaffper_outlet(), sss.getsearch_outlet());

			}
			System.out.println(out);
		}

	}

	// =====================DELETE OUTLETS===========================

	public static void deleteAllOutlet(ArrayList<Outlet> outletList) {
		Helper.line(45, "=");
		System.out.println("delete outlet List");
		Helper.line(45, "=");

		if (outletList.isEmpty()) {

			System.out.println("There is no outlet available.");
		} else {
			String out = String.format(" %-10s %-5s %-15s %-20s %-5s %-20s %-15s\n ", "OUTLET ID", "OUTLET NAME ",
					"STAFF OUTLET ", "AVAILABLE OUTLET", "UNAVAILABLE OUTLET", "UPDATE STAFF PER OUTLET",
					"SEARCH AN OUTLET");
			for (int i = 0; i < outletList.size(); i++) {
				Outlet sss = outletList.get(i);//
				out += String.format("%-10d %-5s %-15s %-20s %-5s %-20s %-15s\n", sss.getOutlet_id(),
						sss.getOutlet_name(), sss.getStaff_outlet(), sss.getAvailable_outlet(),
						sss.getUnavailable_outlet(), sss.getupdatestaffper_outlet(), sss.getsearch_outlet());

			}
			System.out.println(out);
		}
	}

	public static void updatestaffper_outlet1(ArrayList<Outlet> outletList) {
		Helper.line(45, "=");
		System.out.println("update staff per outlet");
		Helper.line(45, "=");

		boolean isUpdate = false;

		while (isUpdate == false) {
			int outletid = Helper.readInt("Enter the outlet ID   : ");

			// if wrong keep asking
			for (int i = 0; i < outletList.size(); i++) {

				if (outletid == outletList.get(i).getOutlet_id()) {
					String staffname = Helper.readString("Enter new staff name  : ");

					outletList.get(i).setStaff_outlet(staffname);

					System.out.println("You have successfully updated new staff!");

					isUpdate = true;
				}
			}
			// break;

			if (isUpdate == false) {
				System.out.println("There is no such outlet ID.");

			}
		}
	}

	public static void search_outlet1(ArrayList<Outlet> outletList) {
		Helper.line(45, "=");
		System.out.println("search an outlet");
		Helper.line(45, "=");

		String searchoutletName = Helper.readString("Enter outlet ID to search :");
		String output = String.format("%-10s %-25s %-40s %-55s %-55s %-40s %-15s\n ", "outlet ID ", "outlet name",
				"staff outlet ", "Available outlet", "Unavailable outlet", "Update staff per outlet",
				"Search an outlet");
		for (int i = 0; i < outletList.size(); i++) {
			if (outletList.get(i).getOutlet_name().equalsIgnoreCase(searchoutletName)) {
				Outlet sss = outletList.get(i);
				output += String.format("%-10d %-25s %-40s %-55s %-55s %-40s %-15s\n", sss.getOutlet_id(),
						sss.getOutlet_name(), sss.getStaff_outlet(), sss.getAvailable_outlet(),
						sss.getUnavailable_outlet(), sss.getupdatestaffper_outlet(), sss.getsearch_outlet());
			}

		}
		System.out.println(output);

		if (outletList.isEmpty()) {
			System.out.println("There is no outlet available.");
		} else {
			String out = String.format(" %-10s %-5s %-15s %-20s %-5s %-20s %-15s\n ", "OUTLET ID", "OUTLET NAME ",
					"STAFF OUTLET ", "AVAILABLE OUTLET", "UNAVAILABLE OUTLET", "UPDATE STAFF PER OUTLET",
					"SEARCH AN OUTLET");
			for (int i = 0; i < outletList.size(); i++) {
				Outlet sss = outletList.get(i);//
				out += String.format("%-10d %-5s %-15s %-20s %-5s %-20s %-15s\n", sss.getOutlet_id(),
						sss.getOutlet_name(), sss.getStaff_outlet(), sss.getAvailable_outlet(),
						sss.getUnavailable_outlet(), sss.getupdatestaffper_outlet(), sss.getsearch_outlet());

			}
			System.out.println(out);
		}
	}
	// =====================TRANSACTION(VALERIE)===========================

	// ================================= Option 1 View
	// =================================
	public static String retrieveTransaction(ArrayList<Transaction> transactionList) {
		String output = "";

		for (int i = 0; i < transactionList.size(); i++) {
			output += String.format("%-20d %-20s %-20s \n", transactionList.get(i).getTransactionID(),
					transactionList.get(i).getTransactionName(), transactionList.get(i).getProductName());

		}
		return output;
	}

	public static void viewTransaction(ArrayList<Transaction> transactionList) {
		C206_CaseStudy.setHeader("TRANSACTION LIST");
		String output = String.format("%-20s %-20s %-20s \n", "ID", "NAME", "PRODUCT NAME");
		output += retrieveTransaction(transactionList);
		System.out.println(output);
	}

	// ================================= Option 2 Add
	// =================================
	public static Transaction inputTransaction() {
		int id = Helper.readInt("Enter ID > ");
		String name = Helper.readString("Enter Name > ");
		String productName = Helper.readString("Enter product > ");

		Transaction addTrans = new Transaction(id, name, productName);
		return addTrans;

	}

	public static void addTransaction(ArrayList<Transaction> transactionList, Transaction addTrans) {

		transactionList.add(addTrans);
		System.out.println("Transaction added");
	}

	// ================================= Option 3 Archive
	// =================================
	public static void archiveTransaction(ArrayList<Transaction> transactionList, ArrayList<Transaction> archiveList) {
		C206_CaseStudy.viewTransaction(transactionList);
		int id = Helper.readInt("Enter ID > ");
		int pos = -1;

		for (int i = 0; i < transactionList.size(); i++) {
			if (id == transactionList.get(i).getTransactionID()) {
				pos = i;
			}

		} // end of For Loop
		String confirm = Helper.readString("Archive Transaction? (Y/N) > ");
		if (confirm.equalsIgnoreCase("Y")) {
			archiveList.add(new Transaction(transactionList.get(pos).getTransactionID(),
					transactionList.get(pos).getTransactionName(), transactionList.get(pos).getProductName()));
			transactionList.remove(pos);
			System.out.println("Archive already");
		}
	}

	// ================================= Option 4
	// Update======================================
	public static void updateTransaction(ArrayList<Transaction> transactionList, ArrayList<Product> productList) {
		int id = Helper.readInt("Enter transaction ID > ");
		String productDescription = Helper.readString("Enter product description to change > ");

		int p = -1;
		int prod = 0;
		for (int i = 0; i < transactionList.size(); i++) {
			if (id == transactionList.get(i).getTransactionID()) {
				if (transactionList.get(i).getProductName().equalsIgnoreCase(productList.get(prod).getProductName())) {
					productList.get(prod).setDescription(productDescription);
				} else {
					prod += 1;
				}
				p = 1;
				break;

			}

		}
		if (p == 1) {
			System.out.println(productList.get(prod).getProductName() + " description has been changed to "
					+ productList.get(prod).getDescription());
		} else {
			System.out.println("Invalid Transaction ID");
		}

	}// end method
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}

} // end of C206_CaseStudy
