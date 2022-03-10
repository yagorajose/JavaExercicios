package poointro;

public class Ex3EletronicoObjeto {

	public static void main(String[] args) {

		Ex3Eletronico c1 = new Ex3Eletronico();
		
		c1.setHd("1TB");
		c1.setProcessador ("Intel Core i7 10700k");
		c1.setRam("16GB (2x8GB)");
		c1.setVga("RX 5700 XT");
		
		
		System.out.println("HD: " + c1.hd + "\nProcessador: " + c1.processador + "\nRAM: " + c1.ram + "\nPlaca de vídeo: " + c1.vga  );
		
		
		
	}

}
