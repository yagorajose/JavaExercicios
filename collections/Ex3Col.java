package collections;

import java.util.ArrayList;
import java.util.Collections;

/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.       */


public class Ex3Col {

	public static void main(String[] args) {
		
		String es1 = "Shampoo";
		String es2 = "Sabonete";
		String es3 = "Pasta de dentes";
		String es4 = "Escova de dentes";
		ArrayList<String>estoque = new ArrayList<>();
		
		estoque.add(es1);
		estoque.add(es2);
		estoque.add(es3);
		
		
			System.out.println(estoque);
			
			estoque.remove(es2);
			
				System.out.println(estoque);
			
				
			estoque.add(es4);	
				
			
				System.out.println(estoque);
			
			
	}

}
