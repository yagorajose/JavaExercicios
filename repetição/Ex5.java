package repetição;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		
		Scanner ler = new Scanner(System.in);

		int x, soma = 0;
		
		do {
		
		System.out.println("Digite um valor" );
		x=ler.nextInt();
		
		
		if (x !=0) {
			
			soma = soma + x;		
		}
		
		} while (x > 0);
			
		 
		System.out.println("Soma dos números " + soma);
		
		

		
	}

}
