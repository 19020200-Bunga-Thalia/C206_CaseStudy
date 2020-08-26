
public class Transaction {
	// ====== VALERIE========
  private int transactionID;
  private String transactionName;
  
  public Transaction(int transactionID, String transactionName) {
    this.transactionID = transactionID;
    this.transactionName = transactionName;
  }
  
  public int getTransactionID() {
    return transactionID;
  }
  
  public void setTransactionID(int trannsactionID) {
    this.transactionID = transactionID;
  }
  
  public String getTransactionName() {
    return transactionName;
  }
  
  public void setTransactionName(String transactionName) {
    this.transactionName = transactionName;
  }
  

} //end of main clasS
