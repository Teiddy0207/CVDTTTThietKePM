package BT7;

public class DongHoAdapter implements Product {
    private DongHo dongHo;

    public DongHoAdapter(DongHo dongHo) {
        this.dongHo = dongHo;
    }

    @Override
    public void displayInfo() {
        dongHo.hienThiChiTiet();
    }
}

