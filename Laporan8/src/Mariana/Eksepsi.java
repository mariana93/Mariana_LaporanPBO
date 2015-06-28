package Mariana;

public class Eksepsi {
	
	public static void cobaMetode(int i) {
		if (i>=0) {
			throw new CobaRuntimeException();
		}
		System.out.println("Nilai i = " +i);
	}
	
	public static void cobaMetodeDua(int i) throws CobaCheckedException {
		if (i>=0) {
			throw new CobaCheckedException();
		}
		System.out.println("Nilai i =" + i);
	}
	
	public static void main(String args[]) {
		try {
			cobaMetode(-2);
			cobaMetodeDua(3);
		}
		catch (CobaRuntimeException e) {
			System.out.println(e.getMessage());
		}
		catch (CobaCheckedException e) {
			System.out.println(e.getMessage());
		}
	}
}
