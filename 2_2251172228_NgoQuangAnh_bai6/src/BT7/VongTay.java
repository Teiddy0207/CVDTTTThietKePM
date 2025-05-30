package BT7;

public class VongTay {
    private String mauSac;
    private String chatLieu;

    public VongTay(String mauSac, String chatLieu) {
        this.mauSac = mauSac;
        this.chatLieu = chatLieu;
    }

    public void showDetails() {
        System.out.println("Vòng tay - Màu: " + mauSac + ", Chất liệu: " + chatLieu);
    }
}
