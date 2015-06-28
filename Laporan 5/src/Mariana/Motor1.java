package Mariana;

public class Motor1 {

	public void motor() {
	System.out.println("Sanex");
}

public void motor(String nama) {
	System.out.println("Beet");
}

public void motor(int jumlah) {
	System.out.println("Ninja");
}

public void motor(long jumlah) {
	System.out.println("Smash");
}

public String motor(String nama, int jumlah) {
	return "shogun";
}

public static void main (String args[]) {
	Motor1 motoran = new Motor1();
	motoran.motor();
	motoran.motor("Next");
	motoran.motor("2");
	motoran.motor("40");
	System.out.println(motoran.motor("Motor", 6));		
}

}


