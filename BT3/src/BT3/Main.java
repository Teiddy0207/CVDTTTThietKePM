package BT3;

public class Main {

	public static void main(String[] args) {
		ProductFactory dongHoFactory = new DongHoFactory();
        Product dongHo = dongHoFactory.createProduct("Casio100", 15);

        ProductFactory vongTayFactory = new VongTayFactory();
        Product vongTay = vongTayFactory.createProduct("DawlingWinton", 1000);

        System.out.println("Đồng hồ: " + dongHo.getProductId() + ", Số lượng: " + dongHo.getQuantity());
        System.out.println("Vòng tay: " + vongTay.getProductId() + ", Số lượng: " + vongTay.getQuantity());
    }

}
