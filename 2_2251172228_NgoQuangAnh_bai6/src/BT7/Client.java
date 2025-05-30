package BT7;

public class Client {
    public static void main(String[] args) {
        Product dongHo = new DongHoAdapter(new DongHo("Casio G-Shock", "Điện tử"));
        Product vongTay = new VongTayAdapter(new VongTay("Đỏ", "Da"));

        dongHo.displayInfo();
        vongTay.displayInfo();
    }
}

