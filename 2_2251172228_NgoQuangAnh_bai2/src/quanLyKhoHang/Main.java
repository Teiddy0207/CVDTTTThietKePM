package quanLyKhoHang;

public class Main {

	public static void main(String[] args) {
		  Product product = new Product("Đồng hồ casio", 10);

	      InventoryManager manager = new InventoryManager();
	      InventoryLogger logger = new InventoryLogger();
	      manager.updateInventory(product, 100);
	      logger.logInventoryChange(product);

	}

}
