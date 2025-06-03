package lab08;

public class DongHo extends Product {
	  private String brand;
	    private double price;

	    public DongHo(String brand, double price) {
	        this.brand = brand;
	        this.price = price;
	    }

	    public void doiGia(double giaMoi) {
	        this.price = giaMoi;
	        System.out.println("Đồng hồ cập nhật giá mới: " + giaMoi);
	        if (mediator != null) {
	            mediator.notify(this);
	        }
	    }

	    public String getBrand() {
	        return brand;
	    }

	    public double getPrice() {
	        return price;
	    }
}
