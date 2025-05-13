package BT3;

public class SimpleProductFactory implements ProductFactory {
    @Override
    public Product createProduct(String productId, int quantity) {
        return new simpleProduct(productId, quantity);
    }
}
