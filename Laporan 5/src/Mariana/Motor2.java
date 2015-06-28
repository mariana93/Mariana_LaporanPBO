package Mariana;

public class Motor2 {

	private String namaMotor;
	private int hargaMotor;
	
	private Motor2()
	{
		namaMotor = "Soul";
		hargaMotor=16000000;
	}

	private Motor2(String nama, int harga){
		namaMotor = nama;
		hargaMotor = harga;
	}
	
	public void cetakMotorDua() {
		System.out.println(namaMotor + " " + hargaMotor);
	}
	
	public static void main(String args[]) {
		Motor2 mDua = new Motor2();
		mDua.cetakMotorDua();
		mDua = new Motor2("Sanex", 2000000);
		mDua.cetakMotorDua();
	}

}
