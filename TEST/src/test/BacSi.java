package test;

import java.util.ArrayList;

public class BacSi {
	 private String ten;
	 private ArrayList<BenhNhan> danhSachBenhNhan;
	 
	 public BacSi(String ten)
	 {
		 this.ten = ten;
		 this.danhSachBenhNhan = new ArrayList<>();
	 }
	 public String getTen() {
	        return ten;
	    }
	 
	 
	  public void themBN(BenhNhan bn) {
	        if (!danhSachBenhNhan.contains(bn)) {
	            danhSachBenhNhan.add(bn);
	            bn.themBS(this);
	        }
	    }
	 public void HienThiDSBenhNhan()
	 {
	        System.out.println("Bác sĩ " + ten + " phụ trách các bệnh nhân:");
	        for (BenhNhan bn : danhSachBenhNhan) {
	            System.out.println("- " + bn.getTen());
	        }
	    }
}
