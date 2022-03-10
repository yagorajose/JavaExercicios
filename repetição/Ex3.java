package repetição;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade = 1;
		int idade21 = 0, idade50 = 0;
		
			
		
		
		
				while (idade <= 99) {
					
					System.out.println("Digite sua idade " );
					idade=ler.nextInt();
			
						if (idade < 21) {
						idade21 = idade21 + 1;
						}
		
							if (idade > 50) {
							idade50 = idade50 +1;
							}
		
			
			
									}

		
				System.out.println("Pessoas com menos de 21 anos " + idade21  );
				System.out.println("Pessoas com mais de 50 anos " + idade50  );
		
		
		
		
	}

}
