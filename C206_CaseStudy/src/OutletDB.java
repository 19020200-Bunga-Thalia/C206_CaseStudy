import java.util.ArrayList;
  public class OutletDB {
    //sub class
    //GRACE

    public static ArrayList<Outlet> outletList = new ArrayList<>();


    public static void addOutlet(Outlet outlet) {

      outletList.add(outlet);
      
    }
    public static String viewAllOutlet() {
      String output = "";
      int check = 0;
      for(int i =0; i < outletList.size();i++) {
        output +="Outlet Name: " + outletList.get(i).getOutlet_name() + "\n";
        output +="Outlet ID: " + outletList.get(i).getOutlet_id() +"\n";
        output +="Staff Outlet: " + outletList.get(i).getStaff_outlet() +"\n";
        check = 1;
      }
      if(check == 0) {
        output ="No Outlet information existed ";
      }
      return output;
    }
    public static String delOutlet(String outlet_name){
      String output = "Fail to delete";
      for(int i =0; i < outletList.size();i++) {
        if(outletList.get(i).getOutlet_name().equalsIgnoreCase(outlet_name)) {
          outletList.remove(i);
          output = "Delete succesful";
          break;
        }  
      }
      return output;
      }
    
      
    public static void showOutletMenu() {
      System.out.println("1.Add outlet");
      System.out.println("2.View outlet");
      System.out.println("3.Delete outlet");
      System.out.println("4.Quit");
    
  }



}