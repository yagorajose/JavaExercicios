package repetição2;

import java.util.Scanner;


//Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por
//três (imprimindo o novo valor) até que ele seja maior do que 100. Ex.: se o usuário
//digita 5, deveremos observar na tela a seguinte sequência: 5 15 45 135.

public class Ex4 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int x = 0;
		
		while (x <= 100) {
			
			System.out.println("Digite um número: ");
			x=ler.nextInt();
			x = x*3;
			
			System.out.println(x);
			}		
		
		
		
		
		
		
	}

}
