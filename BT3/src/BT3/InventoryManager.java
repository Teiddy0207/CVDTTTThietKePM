package BT3;

public class InventoryManager {
	public void updateInventory(Product product, int amount) {
        int updatedQuantity = product.getQuantity() + amount;
        product.setQuantity(updatedQuantity);
    }

}
