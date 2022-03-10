package laçosdecisão;

import java.util.Scanner;


public class ex1 {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		int maior;
		
		System.out.println("Digite o primeiro número");
		a=ler.nextInt();
		
		System.out.println("Digite o segundo número");
		b=ler.nextInt();
		
		System.out.println("Digite o terceiro número");
		c=ler.nextInt();
		
		
			if (a > b) {
			  if (a > c)
				
				 maior = a;
		
			  else 
				  
				  maior = c;
			  
			}
			
			else { 
				
			  if (b > c)
					
				maior = b;
					
			else	
					
				maior = c;	
			}		
	
		
		System.out.println("o maior é: "+ maior);	
		
		
		
	}

}
