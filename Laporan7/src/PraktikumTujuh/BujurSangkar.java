package PraktikumTujuh;

public class BujurSangkar  extends Bentuk  {
	private float sisi;
	

	public BujurSangkar() {
		sisi = 5;	
	}
 public  float hitungLuas(){
	 return sisi * sisi ;
			
		}
 public void tulis(){
	 System.out.println("Bujur Sangkar");
 }
	

}
