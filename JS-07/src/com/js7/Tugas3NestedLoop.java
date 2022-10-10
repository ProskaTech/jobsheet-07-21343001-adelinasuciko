/*
 * Created by: 21343001_ADELINA SUCIKO
 */

package com.js7;

import java.util.Scanner;

public class Tugas3NestedLoop {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        
		System.out.println("Program Menampilkan Looping bersarang");
		System.out.println("***************************************");
        System.out.print("Baris maks: ");
        int max = in.nextInt();
                
        int i, j;
        
        for (i = 1; i <= max; i++){
            for (j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
		}
	}
}

