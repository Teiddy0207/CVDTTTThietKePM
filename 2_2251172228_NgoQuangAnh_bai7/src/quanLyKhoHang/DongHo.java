package quanLyKhoHang;

public class DongHo implements Product {
    private double price;
    private int quantity;
    private String brand;
    private boolean isWaterResistant;
    
    
    public DongHo(double price, int quantity, String brand, boolean isWaterResistant) {
        this.price = price;
        this.quantity = quantity;
        this.brand = brand;
        this.isWaterResistant = isWaterResistant;
    }

    @Override
    public double getValue() {
        return price * quantity;
    }

    public String getDescription() {
        return "Đồng hồ hiệu " + brand + ", kháng nước: " + (isWaterResistant ? "Có" : "Không");
    }
}
