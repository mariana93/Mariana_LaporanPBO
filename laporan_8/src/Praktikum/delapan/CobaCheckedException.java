package Praktikum.delapan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CobaCheckedException {
	public static void main (String args[]){
		try {
			FileInputStream file = new FileInputStream("c:/coba,txt");
			
		}
		catch (FileNotFoundException e){
			System.out.println("FileNotFoundException terjadi");
		}
	}

	

}
