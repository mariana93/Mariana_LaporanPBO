package tujuh.interfaces.extend;

public class Lingkaran implements HitungKeliling, HitungLuas {
	private double Jarijari;
	
		public Lingkaran(double Jarijari) {
			this.Jarijari = Jarijari;
	}
		public void tulis(){
			System.out.println("Lingkaran");
		}
		public double hitungKeliling(){
			return 2*PHI*Jarijari;
		}
		public double hitungLuas (){
			return PHI*Math.pow(Jarijari, 2);
			
		}

}
