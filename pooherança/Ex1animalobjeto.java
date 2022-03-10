package pooherança;

public class Ex1animalobjeto {

	public static void main(String[] args) {
		
		Ex1animal boi1 = new Ex1animal();
		Ex1animal cobra1 = new Ex1animal();
		Ex1animal sapo1 = new Ex1animal();
		
		
		  boi1.setNomeString("Ronaldo");
		  boi1.setCorre(true);
		  boi1.setIdade(8);
		  boi1.setSom("Muge");
		
		
		  	cobra1.setNomeString("Joana");
		  	cobra1.setCorre(false);
		  	cobra1.setIdade(4);
		  	cobra1.setSom("Sibila");
		  	
		  	  	
		  	   sapo1.setNomeString("Rodrigo");
		  	   sapo1.setCorre(false);
		  	   sapo1.setIdade(2);
		  	   sapo1.setSom("Coaxa");
		  	   
		  	   
		  	   
		System.out.println("BOI:    ->        " + boi1.getNomeString() + "\nIdade:    ->        " + boi1.getIdade() + "\nSom:       ->         " + boi1.isSom()  );
		System.out.println("\nCOBRA:    ->        " + cobra1.getNomeString() + "\nIdade:    ->        " + cobra1.getIdade() + "\nSom    - >    " + cobra1.isSom()           );
		System.out.println("\nSAPO:    ->        " + sapo1.getNomeString() + "\nIdade:    ->        " + sapo1.getIdade() + "\nSom    ->    " + sapo1.isSom()  );

	}

}
