package lab08;

public class Main {
    public static void main(String[] args) {
        DongHo dongHo = new DongHo("Casio cơ", 150.0);
        VongTay vongTay = new VongTay("Vàng", 200.0);

        ProductMediator mediator = new ProductMediator(dongHo, vongTay);

        dongHo.doiGia(189.99);
        vongTay.doiChatLieu("Siêu chất liệu he");
    }
}

