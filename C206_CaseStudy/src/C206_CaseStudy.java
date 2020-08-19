import java.util.ArrayList;
//

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Staff> staffList = new ArrayList<Staff>();
		staffList.add(new Staff(12, "Tom", "12122000"));
		staffList.add(new Staff(13, "Tim", "09112000"));
		
		

		int option = -1;
		
		while (option != 6) {

			System.out.println("1. Staff");
			System.out.println("2. -");
			System.out.println("3. -");
			System.out.println("4. -");
			System.out.println("5. Quit");
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
				
			} else if (option == 4) {
	
						
			}else if (option == 5) {
				System.out.println("Bye!");
			}else {
				System.out.println("Invalid option");
			}

		}

		
	}
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
			staffList.remove(staffpos);
			System.out.println("Staff has been deleted");
		}
		}
		}
	public static void addStaff(ArrayList<Staff> staffList, Staff worker1) {
		// TODO Auto-generated method stub
		
	}
}
