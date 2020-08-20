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
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		ArrayList<Outlet> outletList = new ArrayList<Outlet>();
		ArrayList<Transaction> transactionList = new ArrayList<Transaction>();
		ArrayList<Transaction> archiveList = new ArrayList<Transaction>();

		staffList.add(new Staff(12, "Tom", "12122000"));
		staffList.add(new Staff(13, "Tim", "09112000"));
		customerList.add(new Customer(1, "Lisa", 88294751));
		customerList.add(new Customer(2, "Chad", 95667208));
		outletList.add(new Outlet(898, "Singapore Outlet", "Karen", "West Coast Outlet", "Jurong Outlet"));
		outletList.add(new Outlet(898, "Singapore Outlet", "Karen", "West Coast Outlet", "Jurong Outlet"));

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
				int suboption = Helper.readInt("Enter option :");
				if (suboption == 1) {
					C206_CaseStudy.addStaff(staffList);
				} else if (suboption == 2) {
					C206_CaseStudy.deleteStaff(staffList);
				} else if (suboption == 3) {
					C206_CaseStudy.viewAllStaff(staffList);
				} else {
					System.out.println("Invalid option");
				}
			} else if (option == 2) {
				 System.out.println("1. Add");
			        System.out.println("2. Delete");
			        System.out.println("3. View All");  
			        int suboption = Helper.readInt("Enter option: ");
			        if (suboption==1) {
			          Product p = inputProduct();
			          C206_CaseStudy.addProduct(productList, p);
			        }
			        else if (suboption==2) {
			          C206_CaseStudy.viewProductList(productList);
			        }
			        else if (suboption==3) {
			          C206_CaseStudy.deleteProduct(productList);
			        }
			        else {
			          System.out.println("Invalid Option");
			        }

			} else if (option == 3) {
				System.out.println("1. Add");
				System.out.println("2. Delete");
				System.out.println("3. View All");
				int suboption = Helper.readInt("Enter option :");
				if (suboption == 1) {
					C206_CaseStudy.addCustomer(customerList);
				} else if (suboption == 2) {
					C206_CaseStudy.deleteCustomer(customerList);
				} else if (suboption == 3) {
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
				System.out.println("1. Add");
				System.out.println("2. Archive");
				System.out.println("3. View All");
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

				}

			} else {
				System.out.println("Invalid option");
			}
		}

	}

	// ================STAFF (ALVIN) =======================

//================View staff=======================
	public static String retrieveAllStaff(ArrayList<Staff> staffList) {
		String output = "";
		for (int i = 0; i < staffList.size(); i++) {
			output += String.format("%-25d %-25s %-25s \n", staffList.get(i).getStaff_id(),
					staffList.get(i).getStaff_name(), staffList.get(i).getStaff_birthdate());
		}
		return output;
	}

	public static void viewAllStaff(ArrayList<Staff> staffList) {
		Helper.line(80, "-");
		System.out.println("STAFF LIST");
		Helper.line(80, "-");
		String output = String.format("%-25s %-25s %-25s \n", "STAFF ID", "STAFF NAME", "BIRTHDATE");
		output += retrieveAllStaff(staffList);
		System.out.println(output);
	}

//================Add staff=======================

	public static void addStaff(ArrayList<Staff> staffList) {
		int staff_id = Helper.readInt("Enter Staff ID : ");
		String staff_name = Helper.readString("Enter Staff name : ");
		String staff_birthdate = Helper.readString("Enter birthdate (DDMMYYYY) : ");
		Staff st = new Staff(staff_id, staff_name, staff_birthdate);
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
	// =====================PRODUCT (KARLA)===========================

	// ====================== view product =========================
	public static String retrieveProductList(ArrayList<Product> productList) {
		String output = " ";
		for (int i = 0; i < productList.size(); i++) {
			output += String.format("%-10s %-30s $%-10.2f \n", productList.get(i).getProductName(),
					productList.get(i).getCategory(), productList.get(i).getprice());

		}
		return output;
	}

	public static void viewProductList(ArrayList<Product> productList) {
		String output = String.format("%-20s %-20s %-20s\n", "Product Name", "Category", "Price");
		output += C206_CaseStudy.retrieveProductList(productList);
		System.out.println(output);
	}

//======================= ADD PRODUCT========================= 
	public static Product inputProduct() {
		String productName = Helper.readString("Enter a product to add > ");
		String category = Helper.readString("Enter category of produc > ");
		double price = Helper.readDouble("Enter price of product > ");
		Product p = new Product(productName, category, price);
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

	// =====================CUSTOMER(BUNGA)===========================

	// ================VIEW CUSTOMER=======================

	public static String retrieveAllCustomer(ArrayList<Customer> customerList) {
		String output = "";
		for (int i = 0; i < customerList.size(); i++) {
			output += String.format("%-25d %-25s %-25s \n", customerList.get(i).getCust_id(),
					customerList.get(i).getCust_name(), customerList.get(i).getCust_phone());
		}
		return output;
	}

	public static void viewAllCustomer(ArrayList<Customer> customerList) {
		Helper.line(80, "-");
		System.out.println("CUSTOMER LIST");
		Helper.line(80, "-");
		String output = String.format("%-25s %-25s %-25s \n", "CUSTOMER ID", "CUSTOMER NAME", "CONTACT NUMBER");
		output += retrieveAllCustomer(customerList);
		System.out.println(output);
	}

	// ======================= ADD CUSTOMER=========================
	public static void addCustomer(ArrayList<Customer> customerList) {
		int customer_id = Helper.readInt("Enter Customer ID : ");
		String customer_name = Helper.readString("Enter Customer name : ");
		int customer_contact = Helper.readInt("Enter customer contact number: ");
		String phone = Integer.toString(customer_contact);
		if (phone.length() < 8 || phone.length() > 8) {
			System.out.println("Invalid phone number");
		}
		Customer ct = new Customer(customer_id, customer_name, customer_contact);
		customerList.add(ct);
		System.out.println("Customer added");
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

	// =====================OUTLETS(GRACE)===========================

	// ===================== VIEW OUTLETS===========================

	public static void viewAllOutlet(ArrayList<Outlet> outletList) {
		Helper.line(45, "=");
		System.out.println("view outlet List");
		Helper.line(45, "=");

		if (outletList.isEmpty()) {
			System.out.println("There is no outlet available.");
		} else {
			String out = String.format(" %-10s %-5s %-15s %-20s %-5s\n ", "OUTLET ID", "OUTLET NAME ", "STAFF OUTLET ",
					"AVAILABLE OUTLET", "UNAVAILABLE OUTLET");
			for (int i = 0; i < outletList.size(); i++) {
				Outlet sss = outletList.get(i);//
				out += String.format("%-10d %-5s %-20s  %-15s %-5s\n", sss.getOutlet_id(), sss.getOutlet_name(),
						sss.getStaff_outlet(), sss.getAvailable_outlet(), sss.getUnavailable_outlet());

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
			String out = String.format(" %-10d %-5s %-15s %-20s %-5s\n ", "OUTLET ID", "OUTLET NAME ", "STAFF OUTLET ",
					"AVAILABLE OUTLET", "UNAVAILABLE OUTLET");
			for (int i = 0; i < outletList.size(); i++) {
				Outlet sss = outletList.get(i);//
				out += String.format("%-10s %-5s %-20d  %-15s %-5s\n", sss.getOutlet_id(), sss.getOutlet_name(),
						sss.getStaff_outlet(), sss.getAvailable_outlet(), sss.getUnavailable_outlet());

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
			String out = String.format(" %-10d %-5s %-15s %-20s %-5s\n ", "OUTLET ID", "OUTLET NAME ", "STAFF OUTLET ",
					"AVAILABLE OUTLET", "UNAVAILABLE OUTLET");
			for (int i = 0; i < outletList.size(); i++) {
				Outlet sss = outletList.get(i);//
				out += String.format("%-10s %-5s %-20d  %-15s %-5s\n", sss.getOutlet_id(), sss.getOutlet_name(),
						sss.getStaff_outlet(), sss.getAvailable_outlet(), sss.getUnavailable_outlet());

			}
			System.out.println(out);
		}
	}

	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}

	// =====================TRANSACTION(VALERIE)===========================

	// ================================= View
	// Transaction=================================
	public static String retrieveTransaction(ArrayList<Transaction> transactionList) {
		String output = "";

		for (int i = 0; i < transactionList.size(); i++) {
			output += String.format("%-84s \n", transactionList.get(i).toString());

		}
		return output;
	}

	public static void viewTransaction(ArrayList<Transaction> transactionList) {
		C206_CaseStudy.setHeader("TRANSACTION LIST");
		String output = String.format("%-10s %-30s \n", "ID", "NAME");
		output += retrieveTransaction(transactionList);
		System.out.println(output);
	}

	// ================================= ADD TRANSACTIONS
	// =================================
	public static Transaction inputTransaction() {
		int id = Helper.readInt("Enter ID > ");
		String name = Helper.readString("Enter Name > ");

		Transaction addTrans = new Transaction(id, name);
		return addTrans;

	}

	public static void addTransaction(ArrayList<Transaction> transactionList, Transaction addTrans) {

		transactionList.add(addTrans);
		System.out.println("Transaction added");
	}

	// ================================= ARCHIVE TRANSCTIONS
	// =================================
	public static void archiveTransaction(ArrayList<Transaction> transactionList, ArrayList<Transaction> archiveList) {
		C206_CaseStudy.viewTransaction(transactionList);
		int id = Helper.readInt("Enter ID > ");
		String name = Helper.readString("Enter Name > ");

		for (int i = 0; i < transactionList.size(); i++) {
			if (id == transactionList.get(i).getTransactionID()) {
				archiveList.add(new Transaction(id, name));
				transactionList.remove(i);
			} else {
				System.out.println("Transaction does not exist");
			}
		} // end of For Loop
	}

} // end of C206_CaseStudy
