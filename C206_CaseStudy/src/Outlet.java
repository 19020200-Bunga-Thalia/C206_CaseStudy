public class Outlet {
    private int outlet_id;
    private String outlet_name;
    private String staff_outlet;
    private String available_outlet;
    private String unavailable_outlet;
    private String updatestaffper_outlet;
    private String search_outlet;
   
    public Outlet(int outlet_id, String outlet_name, String staff_outlet, String available_outlet,
    String unavailable_outlet, String updatestaffper_outlet, String search_outlet) {
    
    this.outlet_id = outlet_id;
    this.outlet_name = outlet_name;
    this.staff_outlet = staff_outlet;
    this.available_outlet = available_outlet;
    this.unavailable_outlet = unavailable_outlet;
    this.updatestaffper_outlet = updatestaffper_outlet;
    this.search_outlet = search_outlet;
  }

  public int getOutlet_id() {
    return outlet_id;
  }

  public void setOutlet_id(int outlet_id) {
    this.outlet_id = outlet_id;
  }

  public String getOutlet_name() {
    return outlet_name;
  }

  public void setOutlet_name(String outlet_name) {
    this.outlet_name = outlet_name;
  }

  public String getStaff_outlet() {
    return staff_outlet;
  }

  public void setStaff_outlet(String staff_outlet) {
    this.staff_outlet = staff_outlet;
  }

   
  public String getAvailable_outlet() {
    return available_outlet;
  }


  public void setAvailable_outlet(String available_outlet) {
    this.available_outlet = available_outlet;
  }


  public String getUnavailable_outlet() {
    return unavailable_outlet;
  }


  public void setUnavailable_outlet(String unavailable_outlet) {
    this.unavailable_outlet = unavailable_outlet;
  }
  
  public String getupdatestaffper_outlet() {
    return updatestaffper_outlet;
  }
  
  public void setupdatestaffper_outlet(String updatestaffper_outlet) {
    this.updatestaffper_outlet = updatestaffper_outlet;
  }
  
  public String getsearch_outlet() {
    return search_outlet;
  }
  
  public void setsearch_outlet(String search_outlet) {
    this.search_outlet = search_outlet;
  }


  public String toString() {
    String output = "";
    output+= "Outlet ID : " + outlet_id + "\n";
    output+= "Outlet Name : " + outlet_name + "\n";
    output+= "Staff Outlet: " + staff_outlet + "\n";
    output+= "Available Outlet: " + available_outlet + "\n";
    output+= "Unavailable Outlet: " + unavailable_outlet + "\n";
    output+= "Update staff per Outlet: " + updatestaffper_outlet + "\n";
    output+= "Search an outlet: " + search_outlet + "\n";
    
    
    
    return output;
  }
  }