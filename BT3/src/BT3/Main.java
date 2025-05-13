package BT3;

public class Main {

	public static void main(String[] args) {
        ProductFactory factory = new SimpleProductFactory();
        Product product = factory.createProduct("DongHoCasioMTP", 56);

        InventoryManager manager = new InventoryManager();
        InventoryLogger logger = new InventoryLogger();

        manager.updateInventory(product, 2); 
        logger.logInventoryChange(product); 

        manager.updateInventory(product, -7); 
        logger.logInventoryChange(product);   
    }

}
