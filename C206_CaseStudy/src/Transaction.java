
public class Transaction {
	//VALERIE
	 private int transactionID;
	  private String transactionName;
	  private String productName;
	  
	  public Transaction(int transactionID, String transactionName, String productName) {
	    this.transactionID = transactionID;
	    this.transactionName = transactionName;
	    this.productName= productName;
	  }
	  
	  public int getTransactionID() {
	    return transactionID;
	  }
	  
	  public String getTransactionName() {
	    return transactionName;
	  }
	  
	  public void viewTransaction() {
	    String output = "";
	    output += String.format("%-20s -20d \n", getTransactionName(), getTransactionID());
	    System.out.println(output);
	  }

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	} //end of main class


