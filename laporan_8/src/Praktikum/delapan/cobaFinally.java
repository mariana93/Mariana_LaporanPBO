package Praktikum.delapan;

public class cobaFinally {
	public static void cobaMetode(){
		int a[] = new int [2];
		try {
			System.out.println("akses elemen ke dua:" + a[1]);
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("arrayIndexOutOfBoundsExceptio terjadi");
		} finally {
			a[0] = 6;
			System.out.println("Nilai elemn pertama:" + a[0]);
		}
		
	}
	public static void main (String args[]){
		cobaMetode();
	}

	

}
