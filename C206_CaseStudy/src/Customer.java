
import java.util.Comparator;

public class Customer implements Comparable<Customer> {
	// BUNGA
	private int customer_id;
	private String customer_name;
	private int customer_contact;
	private int customer_returns;

	public Customer(int customer_id, String customer_name, int customer_contact, int customer_returns) {
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.customer_contact = customer_contact;
		this.customer_returns = customer_returns;
	}

	public void setCust_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public int getCust_id() {
		return customer_id;
	}

	public void setCust_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getCust_name() {
		return customer_name;
	}

	public void setCust_phone(int customer_contact) {
		this.customer_contact = customer_contact;
	}

	public int getCust_phone() {
		return customer_contact;
	}

	public void setCust_returns(int customer_returns) {
		this.customer_returns = customer_returns;
	}

	public int getCust_returns() {
		return customer_returns;
	}

	@Override
	public int compareTo(Customer comparestu) {
		int comparereturn = ((Customer) comparestu).getCust_returns();
		return comparereturn - this.customer_returns;
	}

}
