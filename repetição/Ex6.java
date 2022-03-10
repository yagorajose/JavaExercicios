package repetição;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

	
		Scanner ler = new Scanner(System.in);
		
		int x, cont=0, soma=0;
		float media;
		
		
		  do {
		
			  System.out.println("Digite um valor" );
			  x=ler.nextInt();
		
			  if (x%3==0 && x!=0) {
				  
				  cont++;
				  soma = soma + x;				  
			  }
			  
		  } while (x !=0);

		  media = soma / cont;
		  
		  	System.out.println("Média dos múltiplos " + media);
		  
	}
	
}
