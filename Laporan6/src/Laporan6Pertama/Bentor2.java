package Laporan6Pertama;

import Mariana.Becak;
import Mariana.Permainan;

public class Bentor2 {
	
	public Becak becak1;
	public Permainan odong1;
	private int nomor;
	protected String nama;
	
	public Bentor2() {
		becak1=new Becak();
		odong1=new Permainan();
		System.out.println("Konstruktor Bentor");
	}
	
	public void stater() {
		System.out.println("Tarik Bentor");
	}
	
	public Bentor2(String nama) {
		this.nama = nama;
	}
}
