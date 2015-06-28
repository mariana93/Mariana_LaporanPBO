package Mariana;

public class Conditional2 {

	public static void main (String[] args) {
		int nilai1 = 1;
		int nilai2 = 2;
		int hasil;
		boolean kondisi = true;
		hasil = kondisi ? nilai1 : nilai2;
		if (kondisi == true)
			hasil = nilai1;
		else
			hasil = nilai2;
		
		System.out.println (hasil);
	}

}
