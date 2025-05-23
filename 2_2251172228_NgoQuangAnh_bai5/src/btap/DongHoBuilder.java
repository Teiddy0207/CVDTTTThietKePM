package btap;

public class DongHoBuilder implements DonHangBuilder {
    private DongHo dongHo;

    public DongHoBuilder() {
        this.dongHo = new DongHo();
    }

    public void reset() {
        this.dongHo = new DongHo();
    }

    public void setLoai(String loai) {
        this.dongHo.setLoai(loai);
    }

    public void setChatLieu(String chatLieu) {
    }

    public DongHo getResult() {
        return this.dongHo;
    }
}
