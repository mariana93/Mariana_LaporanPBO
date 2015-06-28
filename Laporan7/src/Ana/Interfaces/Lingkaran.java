package Ana.Interfaces;

public class Lingkaran implements BentukLuas, BentukKeliling {
	private double Jarijari;

	public Lingkaran(Double Jarijari) {
		this.Jarijari = Jarijari;
		
	}
	public double hitungKeliling(){
		return 2*BentukKeliling.PHI*Jarijari;
		
	}
	public double hitungLuas(){
		return BentukLuas.PHI*Math.pow(Jarijari, 2);
		
	}

}
