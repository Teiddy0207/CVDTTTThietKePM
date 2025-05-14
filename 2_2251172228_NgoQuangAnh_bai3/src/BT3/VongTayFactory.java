package BT3;

public class VongTayFactory extends ProductFactory {
    @Override
    public Product createProduct(String id, int qty) {
        return new VongTay(id, qty);
    }
}
