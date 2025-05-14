package BT3;

public class DongHo implements Product {
    private String productId;
    private int quantity;

    public DongHo(String productId, int quantity) {
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
