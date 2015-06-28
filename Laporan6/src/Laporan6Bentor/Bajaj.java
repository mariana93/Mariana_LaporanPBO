package Laporan6Bentor;

import Laporan6Pertama.Bentor2;

public class Bajaj extends Bentor2 {
	
	public String nama;
	
	public Bajaj() {
		super();
	}
	
	public Bajaj(String nama) {
		super(nama);
	}
	
	public void cetak (String nama) {
		super.nama = nama;
		this.nama = "Bajaj lokal";
		
		System.out.println(nama);
		System.out.println(this.nama);
	}
	
	public static void main(String args[]) {
			Bajaj bajaj = new Bajaj();
			bajaj.cetak("Bajaj kuuu");
	}
	
	public void stater() {
		System.out.println("Tarik Bajaj");
	}

}
