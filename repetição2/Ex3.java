package repetição2;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int cont = 0, num = 0, soma = 0, media = 0;
		
		
		
		while (true){
			
			System.out.println("Digite um número: ");
			num=ler.nextInt();
			
			
				
			if (num >= 0) {
				
				soma = soma + num;
				cont++;
				
			}	
			  else {
		      break;
				
			}
		}
		
		
			System.out.println("Soma dos números:" + soma);		
			System.out.println("Quantidade de números digitados: " + cont);
			System.out.println("Média dos números: " + soma/cont);
	}

}
