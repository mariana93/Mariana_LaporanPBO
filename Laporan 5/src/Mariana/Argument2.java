package Mariana;

public class Argument2 {
	public static void argumenArray(int[] args) {
		System.out.println(args[0] + "," + args[1] + "," + args[2]);
	}
	
	public static void argumenSembarang(int...args) {
		System.out.println(args[0] + "," + args[1] + "," + args[2]);
	}
	
	public static void main(String args[]) {
		int i[] = {7,8,9};
		argumenArray(i);
		argumenSembarang(i);
	}

}
