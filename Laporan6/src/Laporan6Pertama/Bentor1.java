package Laporan6Pertama;

import Laporan6Bentor.Bajaj;
import Laporan6Bentor.Motor;

public class Bentor1 {
	
	public static void staterBentor(Bentor2 bentor) {
		bentor.stater();
	}
	
	public static void main(String args[])
	{
		Bentor2 bajai = new Bajaj();
		Motor motor = new Motor();
		
		staterBentor(new Bentor2());
		
		staterBentor(bajai);
		
		staterBentor(motor);
	}

}
