package quanLyKhoHang;

public class VongTay implements Product {
    private double price;
    private int quantity;
    private String material; 
    private double length;
    
    
    public VongTay(double price, int quantity , String material, double length) {
        this.price = price;
        this.quantity = quantity;
        this.material = material;
        this.length = length;
    }

    @Override
    public double getValue() {
        return price * quantity;
    }

    public String getDescription() {
        return "Vòng tay chất liệu " + material + ", dài " + length + " cm";
    }
}
