package repeti��o2;

import java.util.Scanner;


//Obtenha um n�mero digitado pelo usu�rio e repita a opera��o de multiplicar ele por
//tr�s (imprimindo o novo valor) at� que ele seja maior do que 100. Ex.: se o usu�rio
//digita 5, deveremos observar na tela a seguinte sequ�ncia: 5 15 45 135.

public class Ex4 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int x = 0;
		
		while (x <= 100) {
			
			System.out.println("Digite um n�mero: ");
			x=ler.nextInt();
			x = x*3;
			
			System.out.println(x);
			}		
		
		
		
		
		
		
	}

}
