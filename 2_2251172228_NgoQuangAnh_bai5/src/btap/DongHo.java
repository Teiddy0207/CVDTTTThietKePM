package btap;

public class DongHo {
    protected String loai;

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public void hienThi() {
        System.out.println("Đồng hồ loại: " + loai);
    }
}

