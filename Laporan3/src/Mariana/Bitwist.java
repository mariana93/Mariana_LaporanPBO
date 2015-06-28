package Mariana;

public class Bitwist {

	public static void main(String[] args) {
		byte angka1 = 105;
		byte angka2 = -80;
		System.out.println (~angka1);
		System.out.println (~angka2);
		
		System.out.println (angka1 & 5);
		System.out.println (angka2 | 5);
		System.out.println (angka2 ^ 5);
		
		System.out.println (angka1>>2);
		System.out.println (angka2>>5);
		System.out.println (angka1<<3);
		System.out.println (angka1>>>3);
		System.out.println (angka2>>>5);
		
		
		
	}
}
