package repeti��o;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		
		int x=10;
		int i;
		int par = 0, impar = 0;
		
		
		for (x=0; x<=10; x++) {		
	
			System.out.println("Digite um n�mero ");
			 	x=ler.nextInt();
			
				if (x%2==0) {
				  par++;	
			
				}	
				  
				  else { 
				    impar++; 
				  } 
				  
				  
				
		}
	
			System.out.println("\nN�mero de pares " + par); 		
			System.out.println("\nN�mero de �mpares " + impar);
			
		
			
			
			
			
	}

}
