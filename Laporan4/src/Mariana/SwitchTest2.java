package Mariana;

public class SwitchTest2 {


	public static void main (String[] args) {
		int bulan = 2;
		int tahun = 2000;
		int jumlahHari = 0;
		
		switch (bulan) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			jumlahHari = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			jumlahHari = 30;
			break;
		case 2:
			if (((tahun % 4 == 0) && !(tahun % 100 == 0))
					|| (tahun % 400 == 0))
					jumlahHari = 29;
			else 
					jumlahHari = 28;
				break;
			default:
				System.out.println("Bulan Salah");
				break;
		}
		System.out.println ("jumlah hari =  " + jumlahHari);

	}

}
