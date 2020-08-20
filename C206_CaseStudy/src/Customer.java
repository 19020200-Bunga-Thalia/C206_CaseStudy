
public class Customer  {
	//BUNGA
	private int customer_id;
	private String customer_name;
	private String customer_contact;
	
	public Customer(int customer_id, String customer_name, String customer_contact) {
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.customer_contact=customer_contact;
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
		return customer_contact;
	}
	
	public void deleteCust() {
	}

}
