package com.provaVettore;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] mesi = {"gennaio", "febbraio", "marzo", "aprile", "marzo", "aprile"};
		 int[] giorniMese = {1, 2, 3, 4, 5, 6};
		 
		 System.out.println("inserisci i giorni del mese");
		 int indice = in.nextInt();
		 
		 System.out.println("Mese -->"+mesi[indice-1]+"\t");
	        if((indice == 1)||(indice == 3)||(indice == 6) System.out.println("Giorni--> 31");
	        else if((indice == 4)||(indice == 5) System.out.println("Giorni--> 30");
	        else if(indice == 2)System.out.println("Giorni -->28/29");
	        else System.out.println("Non valido");
			
		}
		 
		 

}
