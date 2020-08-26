public class Outlet {
	// class
    private int outlet_id;
    private String outlet_name;
    private String staff_name;
   
    public Outlet(int outlet_id, String outlet_name, String staff_name) {
  
    
    this.outlet_id = outlet_id;
    this.outlet_name = outlet_name;
    this.staff_name = staff_name;
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

  public String getStaff() {
    return staff_name;
  }

  public void setStaff_outlet(String staff_name) {
    this.staff_name = staff_name;
  }

 
  }