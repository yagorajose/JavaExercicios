package repetição2;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {

		
		Scanner ler = new Scanner(System.in);
		
		
		double mediasalario = 0, mediafilho = 0, pessoasalario100 = 0, pessoafilho = 0, percentual = 0;
		int maiorsalario = 0, salario = 0, qtdfilho = 0;
		int x;
		int pessoasalario = 0;
		
		for (x=0; x<=19; x++) {
				
			System.out.println("digite seu salário: ");
			salario=ler.nextInt();
				pessoasalario++;
				mediasalario = salario/pessoasalario;

			System.out.println("Digite o número de filhos: ");	
			qtdfilho=ler.nextInt()	;
				pessoafilho++;
				mediafilho = qtdfilho/pessoafilho;

			if (salario > maiorsalario) {
				
				maiorsalario = salario;
			}	
				
			
			if (salario <= 100) {
				pessoasalario100++;
				percentual = (pessoasalario100*100) / 20;	
				
			}
			
			
			
		}
		
			
			
		System.out.println("Média do salário é: " + mediasalario);
		System.out.println("Média número de filhos é: " + mediafilho);
		System.out.println("Maior salário:" + maiorsalario);
		System.out.println("Percentual de pessoas com salário menor que 100: " + percentual);
		
		
		
		
		
		
		
		
		
	}

}
