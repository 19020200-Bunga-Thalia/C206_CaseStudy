
public class Product {

		  private String productName;
		  private String category;
		  private double price;
		  private String vendor;
		  private int points;
		  
		  public Product(String productName ,String category, double price, String vendor) {
		    this.productName = productName;
		    this.category = category; 
		    this.price = price ;
		    this.vendor = vendor;
		    
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

		public String getVendor() {
			return vendor;
		}

		public void setVendor(String vendor) {
			this.vendor = vendor;
		}


		public int getPoints() {
			return points;
		}


		public void setPoints(int points) {
			this.points = points;
		}
		 
		  }

