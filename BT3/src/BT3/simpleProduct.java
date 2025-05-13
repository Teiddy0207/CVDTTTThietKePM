package BT3;

public class simpleProduct implements Product {
	private String productId;
	private int quantity;
	
	public simpleProduct(String productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }
	
	@Override
	public String getProductId() {
		return productId;
	}

	@Override
	public int getQuantity() {
		return quantity;
	}

	@Override
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
}
