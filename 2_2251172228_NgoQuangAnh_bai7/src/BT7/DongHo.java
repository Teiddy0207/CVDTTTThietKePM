package BT7;

public class DongHo {
    private String tenDongHo;
    private String loai;

    public DongHo(String tenDongHo, String loai) {
        this.tenDongHo = tenDongHo;
        this.loai = loai;
    }

    public void hienThiChiTiet() {
        System.out.println("Đồng hồ: " + tenDongHo + ", Loại: " + loai);
    }
}

