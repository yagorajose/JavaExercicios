package laçosdecisão;

import java.util.Scanner;
import java.util.Arrays;


public class ex2 {

	public static void main(String[] args) {

		
		
		Scanner ler = new Scanner(System.in);
		
		
		int a, b, c;
		
		
		
			System.out.println("Digite o primeiro número ");
			a=ler.nextInt();
			
			System.out.println("Digite o segundo número ");
			b=ler.nextInt();
		
			System.out.println("Digite o terceiro número ");
			c=ler.nextInt();
		

		if (a < b && b < c) {
			System.out.println(a + "\n" + b + "\n" + c + "\n");
		}
		
		else if (a < c && c < b) {
			System.out.println(a + "\n" + c + "\n" + b + "\n");	
		}
		
		else if (b < a && a < c) {
			System.out.println(b + "\n" + a + "\n" + c + "\n");	
		}	
		
		else if (b < c && c < a) {
			System.out.println(b + "\n" + c + "\n" + a + "\n");		
		}
		
		else if (c < a && a < b) {
			System.out.println(c + "\n" + a + "\n" + b + "\n");	
		}
		
		else { 
			System.out.println(c + "\n" + b + "\n" + a + "\n");		
		}
		

	
	
	}
				
	
		
	}
