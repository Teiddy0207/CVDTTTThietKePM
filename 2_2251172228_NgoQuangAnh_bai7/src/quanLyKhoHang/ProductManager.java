package quanLyKhoHang;

public class ProductManager {
    private Product product;

    public ProductManager(Product product) {
        this.product = product;
    }

    public double getInventoryValue() {
        return product.getValue();
    }

    public void printInfo() {
        System.out.println(product.getDescription());
        System.out.println("Tổng giá trị tồn kho: " + getInventoryValue());
    }
}
