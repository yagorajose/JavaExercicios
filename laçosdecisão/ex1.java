package la�osdecis�o;

import java.util.Scanner;


public class ex1 {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		int maior;
		
		System.out.println("Digite o primeiro n�mero");
		a=ler.nextInt();
		
		System.out.println("Digite o segundo n�mero");
		b=ler.nextInt();
		
		System.out.println("Digite o terceiro n�mero");
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
	
		
		System.out.println("o maior �: "+ maior);	
		
		
		
	}

}
