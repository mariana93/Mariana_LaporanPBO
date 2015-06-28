package Praktikum.delapan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;

public class CobaCheckedException2 {
	public static void main (String args[]){
		try{
			FileInputStream file = new FileInputStream("c:/coba.txt");
			file.close();
			
		} catch(FileSystemNotFoundException e){
			System.out.println("FileNotFoundException terjadi");
		} catch (IOException e){
			System.out.println("IOException terjadi");
		}
	}
	

	

}
