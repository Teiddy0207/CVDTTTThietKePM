package quanLyKhoHang;

public class InventoryLogger {
	 public void logInventoryChange(Product product) {
	        System.out.println("Sản phẩm " + product.getProductId() +
	                           " có: " + product.getQuantity());
	    }
}
