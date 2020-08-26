
import java.util.ArrayList;

public class main {
  //main class
  //GRACE
  public static void main(String[] args) {
    ArrayList<Outlet> outletList = new ArrayList<Outlet>();
    
    outletList.add(new Outlet(898,"Singapore Outlet","Karen"));
    outletList.add(new Outlet(899,"JUrong Outlet","James"));
    
    int option = 0;
    main.menu();
    while (option != 7) {
      option = Helper.readInt("Enter an option > ");
    
      if (option ==1) {
        //view all outlet
       main.viewAllOutlet(outletList);    
      
      } else if (option ==2) {
        //add outlet
        main.addAllOutlet(outletList);   
      
      } else if (option ==3) {
        //delete outlet
        main.deleteAllOutlet(outletList);
        
      } else if (option ==4) {
        //update staff per outlet
        main.updatestaffper_outlet1(outletList);
        
      } else if (option ==5) {
        //search an outlet
        main.search_outlet(outletList);
    
    } else if (option ==6) {
      System.out.println("Bye");
    }
  
       
    else {
      
        System.out.println("Invalid option");
    }
    }
    
}
public static void menu() {
    main.setHeader("DISO outlet app");
        System.out.println("1. View outlet");
        System.out.println("2. Add outlet");
        System.out.println("3. Delete outlet");
        System.out.println("4. Update staff per outlet");
        System.out.println("5. Search an outlet");
        System.out.println("6. Quit");
        Helper.line(80, "-");

    }
// ==============================OUTLET (GRACE)==================================
// ===============================VIEW OUTLET====================================

  public static void viewAllOutlet(ArrayList<Outlet> outletList) {
    Helper.line(45, "=");
    System.out.println("view outlet List");
    Helper.line(45, "=");
    
    if (outletList.isEmpty()) {
            System.out.println("There is no outlet available.");
        } else {
            String out = String.format(" %-20s %-20s %-20s \n ", "OUTLET ID","OUTLET NAME ", "STAFF NAME");
            for (int i = 0; i < outletList.size(); i++) {
                Outlet sss = outletList.get(i);
                out += String.format("%-20s %-20s %-20s\n", sss.getOutlet_id(), sss.getOutlet_name(), 
                    sss.getStaff());                     
            }
            System.out.println(out);
        }
    }
   
  public static void addAllOutlet(ArrayList<Outlet> outletList) {
    Helper.line(45, "=");
    System.out.println("add outlet ");
    Helper.line(45, "=");
    
    int outletID = Helper.readInt("Enter Outlet ID: ");
    String outletName = Helper.readString("Enter Outlet Name: ");
    String staffName = Helper.readString("Enter staff name: ");
    Outlet ou = new Outlet(outletID, outletName, staffName);
    
    outletList.add(ou);
    System.out.println("Added");
    }
  
  public static void deleteAllOutlet(ArrayList<Outlet> outletList) {
    Helper.line(45, "=");
    System.out.println("delete outlet List");
    Helper.line(45, "=");
    
    int id = Helper.readInt("Enter outlet ID to be deleted: ");
    int pos = -1;
    for (int i = 0; i < outletList.size(); i++) {
      if (id == outletList.get(i).getOutlet_id()) {
        pos = i;
      }
    }
    outletList.remove(pos);
    System.out.println("Removed");
  }
    
    public static void updatestaffper_outlet1(ArrayList<Outlet> outletList) {
      Helper.line(45, "=");
        System.out.println("update staff per outlet");
        Helper.line(45, "=");
        
        int id = Helper.readInt("Enter outlet ID to update: ");
        
        for (int i = 0; i < outletList.size(); i++ ) {
          if (id == outletList.get(i).getOutlet_id()) {
            String outletName = Helper.readString("Enter new outlet name: ");
            String staffName = Helper.readString("Enter new staff name: ");
            outletList.get(i).setOutlet_name(outletName);
            outletList.get(i).setStaff_outlet(staffName);
          }
        }
    }


public static void search_outlet(ArrayList<Outlet> outletList) {
          Helper.line(45, "=");
            System.out.println("search an outlet");
            Helper.line(45, "=");
            String outletName = Helper.readString("Enter outlet name: ");
            String out = String.format(" %-20s %-20s %-20s \n ", "OUTLET ID","OUTLET NAME ", "STAFF NAME");
            
            for (int i = 0; i < outletList.size();i++ ) {
              if (outletName.equalsIgnoreCase(outletList.get(i).getOutlet_name())) {
                out += String.format("%-20d %-20s %-20s", outletList.get(i).getOutlet_id(), outletList.get(i).getOutlet_name(), outletList.get(i).getStaff());
                System.out.println(out);
                break;
              }
            }
            
    }

  
     public static void setHeader(String header) {
          Helper.line(80, "-");
          System.out.println(header);
          Helper.line(80, "-");
      }
     
     }
