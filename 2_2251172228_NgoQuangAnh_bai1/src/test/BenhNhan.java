package test;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class BenhNhan {

	private String ten;
	private ArrayList<BacSi> danhSachBacSi;
	
	public BenhNhan(String ten) {
        this.ten = ten;
        this.danhSachBacSi = new ArrayList<>();
    }
	
	public String getTen() {
        return ten;
    }
	
	public void themBS(BacSi bs)
	{
		if(!danhSachBacSi.contains(bs))
		{
			danhSachBacSi.add(bs);
			bs.themBN(this);
		}
	}

	public void HienThiDSBacSi()
	{
        System.out.println("Bệnh nhân " + ten + " được phụ trách bởi các bác sĩ:");
        for(BacSi bs : danhSachBacSi)
        {
            System.out.println("- " + bs.getTen());

        }

	}
	
}
