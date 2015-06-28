package Mariana;

public class Mobil {


	public static int JUMLAH_MOBIL = 0;
	public String merek;
	
	public static void tambahMobil()
	{
		JUMLAH_MOBIL++;
	}
	
	public static void main(String[] args)
	{
		Mobil objekMobil = new Mobil();
		objekMobil.JUMLAH_MOBIL=0;
		objekMobil.merek = "XENIA";
		Mobil.tambahMobil();
		System.out.println(Mobil.JUMLAH_MOBIL);
		
		Mobil objekMobil2 = new Mobil();
		objekMobil2.merek = "AVANSA";
		Mobil.tambahMobil();
		System.out.println(Mobil.JUMLAH_MOBIL);
		Mobil.tambahMobil();
		objekMobil.JUMLAH_MOBIL=0;
		System.out.println(Mobil.JUMLAH_MOBIL);
		objekMobil.JUMLAH_MOBIL=2;
		Mobil.tambahMobil();
		System.out.println(Mobil.JUMLAH_MOBIL);	
		//test();
		
	}
	

}
