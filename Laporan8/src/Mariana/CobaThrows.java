package Mariana;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CobaThrows {
	
	public static void cobaMetode() throws FileNotFoundException, ParseException {
		FileInputStream file = new FileInputStream("c:/coba.txt");
		SimpleDateFormat.getInstance().parse("1234");
	}
	
	public static void cobaMetodeDua () {
		try {
			cobaMetode();
		}
		catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException terjadi");
		}
		catch (ParseException e) {
			System.out.println("ParseException terjadi");
		}
	}
	
	public static void main(String[] args) {
		cobaMetodeDua();
	}

}
