package Praktikum_Delapan_Custom;

public class cobaEksepsi {

	public static void cobaMetode(int i) {
		if (i>=0){
			throw new CobaRuntimeException();
		}
		System.out.println("Nilai i =" + i);
		
	}
	public static void cobaMetodeDua(int i) throws CobaCheckkedException{
		if (i>=0){
			throw new CobaCheckkedException();
			
		}
		System.out.println("Nilai i =" + i);
	}
	public static void main(String args[]) {
		try {
			cobaMetode(-2);
			cobaMetodeDua(3);
		} catch (CobaRuntimeException e) {
			System.out.println(e.getMessage());
		} catch (CobaCheckkedException e) {
			System.out.println(e.getMessage());
		}
	}

}
