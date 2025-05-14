package BT3;

public class DongHoFactory extends ProductFactory {
	  @Override
	    public Product createProduct(String id, int qty) {
	        return new DongHo(id, qty);
	    }
}
