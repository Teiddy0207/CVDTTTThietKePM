package BT7;

public class VongTayAdapter implements Product {
    private VongTay vongTay;

    public VongTayAdapter(VongTay vongTay) {
        this.vongTay = vongTay;
    }

    @Override
    public void displayInfo() {
        vongTay.showDetails();
    }
}

