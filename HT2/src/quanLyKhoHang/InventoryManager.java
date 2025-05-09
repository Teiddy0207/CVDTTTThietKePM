package quanLyKhoHang;

public class InventoryManager {
	public void updateInventory(Product product, int amount) {
		int newQuantity = product.getQuantity() + amount;
        product.setQuantity(newQuantity);
    }
}
