package test;

public class Main {

	public static void main(String[] args) {
		BacSi bs1 = new BacSi("Ngo Quang ANh");
		BacSi bs2 = new BacSi("Ngo Quang Trung");
		
	    BenhNhan bn1 = new BenhNhan("Nguyen Van An");
	    BenhNhan bn2 = new BenhNhan("Nguyen Van Quang");
	    BenhNhan bn3 = new BenhNhan("Tran Duc Lap");	

	    
	    
	    bs1.themBN(bn1);
	    bs1.themBN(bn3);
	    
	    
	    bs2.themBN(bn2);
	    
	    
	    bs1.HienThiDSBenhNhan();
	    System.out.println();
	    bs2.HienThiDSBenhNhan();
	    System.out.println();
	    
	    
        bn1.HienThiDSBacSi();

        bn2.HienThiDSBacSi();
        bn3.HienThiDSBacSi();


	}

}
