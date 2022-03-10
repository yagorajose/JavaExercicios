package poointro;

public class Ex2AviaoObj {

	public static void main(String[] args) {

		
	Ex2Aviao av1 = new Ex2Aviao();
	
			av1.setAsas("10 metros");
			av1.setAssentos("283");
			av1.setModelo("Boeing 737");
			av1.setMotor("165000");		
		
		
	
	System.out.println("Modelo:  " + av1.getModelo() + "\nAssentos:  " + av1.assentos + "\nMotor tem: " + av1.motor + " cavalos de potência" + "\nAsas: " + av1.asas + " de comprimento" );
			av1.voar();

			
			
			
			
	}

}
