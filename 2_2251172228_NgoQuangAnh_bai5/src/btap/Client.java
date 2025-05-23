package btap;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        DongHoBuilder dongHoBuilder = new DongHoBuilder();
        director.taoDongHo(dongHoBuilder);
        DongHo dongHo = dongHoBuilder.getResult();
        dongHo.hienThi();

        VongTayBuilder vongTayBuilder = new VongTayBuilder();
        director.taoVongTay(vongTayBuilder);
        VongTay vongTay = vongTayBuilder.getResult();
        vongTay.hienThi();
    }
}

