///Weijie's
public class Staff {
private int staff_id;
private String staff_name;
private String staff_birthdate;
private int staff_outletID;

public Staff(int staff_id, String staff_name, String staff_birthdate, int staff_outletID) {
	this.staff_id = staff_id;
	this.staff_name = staff_name;
	this.staff_birthdate = staff_birthdate;
	this.staff_outletID = staff_outletID;
}

public int getStaff_id() {
	return staff_id;
}

public void setStaff_id(int staff_id) {
	this.staff_id = staff_id;
}

public String getStaff_name() {
	return staff_name;
}

public void setStaff_name(String staff_name) {
	this.staff_name = staff_name;
}

public String getStaff_birthdate() {
	return staff_birthdate;
}

public void setStaff_birthdate(String staff_birthdate) {
	this.staff_birthdate = staff_birthdate;
}
public int getStaff_outletID() {
	return staff_outletID;
}
public void setStaff_outletID(int staff_outletID) {
	this.staff_outletID=staff_outletID;
}

}



