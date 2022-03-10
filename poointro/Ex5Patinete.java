package poointro;

public class Ex5Patinete {

	public String roda;
	public String material;
	public boolean rodaEncaixe;
	
	
	public void roda () {		
	
		if (rodaEncaixe == true) {
		
		System.out.println("Construído. Está rodando!");
		
	  } else {
		  
		  System.out.println("Patinete travado. Não pode rodar.");
		  
	  }
		
		
	}


	public String getRoda() {
		return roda;
	}


	public void setRoda(String roda) {
		this.roda = roda;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	public boolean isRodaEncaixe() {
		return rodaEncaixe;
	}


	public void setRodaEncaixe(boolean rodaEncaixe) {
		this.rodaEncaixe = rodaEncaixe;
	}
	
	
	
	
	
}
