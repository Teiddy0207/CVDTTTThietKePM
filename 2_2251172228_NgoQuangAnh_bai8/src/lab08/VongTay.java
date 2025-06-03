package lab08;

public class VongTay extends Product {
    private String material;
    private double price;

    public VongTay(String material, double price) {
        this.material = material;
        this.price = price;
    }

    public void doiChatLieu(String chatLieuMoi) {
        this.material = chatLieuMoi;
        System.out.println("Vòng tay thay đổi chất liệu thành: " + chatLieuMoi);
        if (mediator != null) {
            mediator.notify(this);
        }
    }

    public String getMaterial() {
        return material;
    }

    public double getPrice() {
        return price;
    }
}

