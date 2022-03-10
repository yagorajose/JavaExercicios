package exercicios;

import java.util.Scanner;

public class ex32205 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int seg, min, hor, valor, resto;
		
		
	System.out.println("escreva o tempo em segundos: ");
		
		valor=ler.nextInt();
		
		
			hor = valor/3600;
			resto = valor%3600;
			min = resto/60;
			seg = resto%60;
					
			
			
			
			System.out.println("valor totale em horas "+ hor);
			System.out.println("valor totale em minutos "+ min);
			System.out.println("valor totale em segundos "+ seg);

		
			
		
		
		
		
	}

}
