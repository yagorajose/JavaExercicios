package poointro;

import java.util.Scanner;

public class Ex5PatineteObj {

	public static void main(String[] args) {

			Scanner ler = new Scanner(System.in);
		
		
		Ex5Patinete p1 = new Ex5Patinete();
		
		p1.setMaterial("Aço");
		p1.setRoda("Silicone");
		p1.setRodaEncaixe(true);
		p1.roda();
			
		System.out.println("Material: " + p1.material + "\nRoda: " + p1.roda);
				
	}

}
