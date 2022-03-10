package exercicios;

import java.util.Scanner;

public class ex22505 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int anos, meses, dias, valor, resto; 
		
		System.out.println("Digite sua idade em dias ");
		
			valor=ler.nextInt();
			
				anos = valor/365;
		    	resto = valor%365;
		    	meses = resto/30;
		    	dias = resto%30;
		    	
		    	
		System.out.println("Idade em anos: " + anos);
		System.out.println("meses: " + meses);
		System.out.println("dias: " + dias);
		
		
		
	}

}
