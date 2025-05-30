package quanLyKhoHang;

public class Main {
    public static void main(String[] args) {
        Product dongHo = new DongHo(1500000, 10, "Casio", true);
        Product vongTay = new VongTay(800000, 5, "Vàng", 18);

        ProductManager manager1 = new ProductManager(dongHo);
        ProductManager manager2 = new ProductManager(vongTay);


        manager1.printInfo();
        System.out.println("-------------------");
        manager2.printInfo();
    }
}
