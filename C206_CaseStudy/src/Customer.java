
public class Customer  {
	private int customer_id;
	private String customer_name;
	private String phone_no;
	
	public Customer(int customer_id, String customer_name, String phone_no) {
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.phone_no = phone_no;
	}
	
public String display() {
		
		// Write your codes here
		return String.format("%-10s %-30s %-10s %-10s %-20d\n",
				getCust_id(), getCust_name(), getCust_phone());
	}
	
	public int getCust_id() {
		return customer_id;
	}
	
	public String getCust_name() {
		return customer_name;
	}
	
	public String getCust_phone() {
		return phone_no;
	}
	
	public void deleteCust() {
	}

}
