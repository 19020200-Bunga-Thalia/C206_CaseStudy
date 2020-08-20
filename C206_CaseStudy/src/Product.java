
public class Product {

		  private String productName;
		  private String category;
		  private double price;
		  
		  public Product(String productName ,String category, double price) {
		    this.productName = productName;
		    this.category = ""; 
		    this.price = price ;
		    
		  }
		  
		  public String toString() {
		    return String.format("%-10s %-30s %-10d", productName,category, price );
		  }
		  
		  
		  public String getCategory() {
		    return category;
		  }

		  public void setCategory(String category) {
		    this.category = category;
		  }
		  public String getProductName() {
		    return productName;
		  }

		  public void setProductName(String productName) {
		    this.productName = productName;
		  }
		  public double getprice() {
		    return price;
		  }
		  public void setPrice(double price) {
			  this.price = price;
		  }
		 
		  }

