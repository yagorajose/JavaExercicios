package la�osdecis�o;

import java.util.Scanner;
import java.lang.Math;

public class ex4 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		double num1;
		double raiz, pot;
		
		
		System.out.println("Digite um valor");
		num1=ler.nextDouble();
		
		
		if (num1 % 2 == 0) {
			
			raiz = Math.sqrt(num1);
			System.out.println("Raiz do n�mero par: " + raiz);
		
		}
		
		else {
			
			pot = Math.pow(num1, 2);
			System.out.println("Pot�ncia do n�mero �mpar: " + pot);
			
		}		
		
	
				ler.close();
				
				
		

	}

}
