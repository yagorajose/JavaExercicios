package repetição2;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
	
		/*Faça um programa que mostre uma contagem na tela de 233 a 456, só que
		contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.*/
		
		Scanner ler = new Scanner(System.in);
		
		int num = 0;
		
		do {
			
			if (num >= 300 && num <= 400) {
				
				num = num + 5;
			
			} else {
				
				num = num + 3;
			}
			
			
		} while (num >= 233 && num <= 456);
		
	}

}
