package Praktikum.delapan;

import java.io.IOException;

public class Trow {

	public static void cobaMetode() throws IOException {
		
		throw new IOException();
	}
	public static void cobaMetodeDua() throws IOException {
		try {
			cobaMetode();
		} catch (IOException e) {
			throw e;
			
		}
		
	}
	
	public static void cobaMetodeTiga(){
		throw new IndexOutOfBoundsException();
		
	}
	public static void main(String args[]){
		try {
			cobaMetodeDua();
		} catch (IOException e) {
			System.out.println("IOException terjadi");
		}
	}

}
