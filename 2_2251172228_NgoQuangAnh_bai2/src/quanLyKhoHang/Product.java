package quanLyKhoHang;

public class Product {
		private String productId;
	    private int quantity;

	    public Product(String productId, int quantity) {
	        this.productId = productId;
	        this.quantity = quantity;
	    }

	    public String getProductId() {
	        return productId;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public void setQuantity(int quantity) {
	        this.quantity = quantity;
	    }
}
