package exercicios;

import java.util.Scanner;



public class ex12502 {

	public static void main(String[] args) {

		int anos, meses, dias; 
		long tot;
		
	Scanner ler = new Scanner(System.in);
	
		System.out.println("Quantos anos voc� tem? ");
		anos=ler.nextInt();
		
		
		System.out.println("Quantos meses voc� tem? ");
		meses=ler.nextInt();
		
		System.out.println("Quantos dias voc� tem? ");
		dias=ler.nextInt();
		
		
			tot = anos*365 + meses*30 + dias;
				
		System.out.println("Sua data em dias � " + tot);		

			
		
		
	}

}
