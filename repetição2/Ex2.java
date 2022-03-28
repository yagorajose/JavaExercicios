package repetição2;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		
		int x, soma=0, y=0;
		
		
		
		for (x= 0; x <=4; x++) {
		
		System.out.println("Digite um numero: ");
		y=ler.nextInt();
			
		
			if (y%2 !=0) {
		
				if(y%3 == 0) {
				soma = soma + y;		
			}				
		}	
	}	
			
			
			
		System.out.println("Soma dos múltiplos por 3: " + soma);
		
		

	}

}
