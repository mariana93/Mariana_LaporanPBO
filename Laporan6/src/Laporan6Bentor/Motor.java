package Laporan6Bentor;

import Mariana.Permainan;
import Mariana.Becak;
import Laporan6Pertama.Bentor2;

public class Motor extends Bentor2 {
	
	public Motor() {
		
	}
	
	public void balap() {
		Permainan Odong2 = new Permainan();
		stater();
		nama = "Motor anha";
		System.out.println("Balappppp ");
	}

	public static void main(String args[]) {
		Motor motor = new Motor();
		motor.balap();
	}
	
	public void stater() {
		System.out.println("Tarik motor");
	}
}
