package repeti��o2;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int cont = 0, num = 0, soma = 0, media = 0;
		
		
		
		while (true){
			
			System.out.println("Digite um n�mero: ");
			num=ler.nextInt();
			
			
				
			if (num >= 0) {
				
				soma = soma + num;
				cont++;
				
			}	
			  else {
		      break;
				
			}
		}
		
		
			System.out.println("Soma dos n�meros:" + soma);		
			System.out.println("Quantidade de n�meros digitados: " + cont);
			System.out.println("M�dia dos n�meros: " + soma/cont);
	}

}
