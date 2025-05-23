package btap;

public class VongTayBuilder implements DonHangBuilder {
    private VongTay vongTay;

    public VongTayBuilder() {
        this.vongTay = new VongTay();
    }

    @Override
    public void reset() {
        this.vongTay = new VongTay();
    }

    @Override
    public void setLoai(String loai) {
    }

    @Override
    public void setChatLieu(String chatLieu) {
        this.vongTay.setChatLieu(chatLieu);
    }

    public VongTay getResult() {
        return this.vongTay;
    }

  
}
