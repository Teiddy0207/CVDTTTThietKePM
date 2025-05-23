package btap;

public class Director {
    public void taoDongHo(DongHoBuilder dongHoBuilder) {
        dongHoBuilder.reset();
        dongHoBuilder.setLoai("Cơ");
    }

    public void taoVongTay(VongTayBuilder vongTayBuilder) {
        vongTayBuilder.reset();
        vongTayBuilder.setChatLieu("Vàng");
    }
}

