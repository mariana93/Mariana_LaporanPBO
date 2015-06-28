package Ana.Tujuh;

	import PraktikumTujuh.Bentuk;
	import PraktikumTujuh.BujurSangkar;
	import PraktikumTujuh.SegitigaSamaKaki;
	import PraktikumTujuh.SegitigaSamaSisi;
	
public class CobaBentuk {
	public static void cetakBangun (Bentuk b)  {
		System.out.println(b.hitungLuas());
		b.tulis();
		b.geser(5, 5);
		
	}
	public static void main (String args[]) {
		
		cetakBangun (new BujurSangkar());
		cetakBangun (new SegitigaSamaKaki());
		cetakBangun (new SegitigaSamaSisi());
		
	}

}
