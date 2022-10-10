//Created by: 21343001_ADELINA SUCIKO
//Nested Loop (Perulangan bersarang)

package com.js7;

public class Latihan9 {

	public static void main(String[] args) {
		
		int baris, kolom, hasil_kali;
		int MAKS = 8;
		
		for (baris=1; baris<=MAKS; baris++) //for luar
		{
				for(kolom=1; kolom<=MAKS; kolom++) { //for dalam
				hasil_kali = baris * kolom;
				System.out.print("\t" + hasil_kali);
			}
		System.out.println("");
		}
	}
}