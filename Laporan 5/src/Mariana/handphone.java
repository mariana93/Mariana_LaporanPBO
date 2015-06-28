package Mariana;

public class handphone {

	public String merek;
	public String type;
	public int harga;
	public int diskon;
	
	public void cetakHandphone()
	{
		System.out.println(merek + "," + type + "," + harga + "," + diskon);
	}

	public static void main (String[] args){
		handphone objekHandphone = new handphone();
		objekHandphone.merek = "Samsung";
		objekHandphone.type = "Galaxy J1";
		objekHandphone.harga = 1600000;
		objekHandphone.diskon = 50000;
		objekHandphone.cetakHandphone();
		
		handphone objekHandphoneDua = new handphone();
		objekHandphoneDua.merek = "Samsung";
		objekHandphoneDua.type = "Ace 3";
		objekHandphoneDua.harga = 1500000;
		objekHandphoneDua.diskon = 65000;
		objekHandphoneDua.cetakHandphone();			
	}
}
