package lab08;

public class ProductMediator implements Mediator {
    private DongHo dongHo;
    private VongTay vongTay;

    public ProductMediator(DongHo dongHo, VongTay vongTay) {
        this.dongHo = dongHo;
        this.vongTay = vongTay;

        this.dongHo.setMediator(this);
        this.vongTay.setMediator(this);
    }

    @Override
    public void notify(Product sender) {
        if (sender instanceof DongHo) {
            System.out.println("Cập nhật từ Đồng Hồ.");
            System.out.println("Đề xuất vòng tay phù hợp với thương hiệu: " + dongHo.getBrand());
        } else if (sender instanceof VongTay) {
            System.out.println("Cập nhật từ Vòng Tay.");
            System.out.println("Xem xét khuyến mãi cho vòng tay chất liệu: " + vongTay.getMaterial
            ());
        }
    }
}

