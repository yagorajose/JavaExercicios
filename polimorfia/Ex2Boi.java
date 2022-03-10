package polimorfia;

public class Ex2Boi extends Ex2animal{



	private String pastar;

	@Override
	public void som() {
		
		System.out.println("O boi muge.");
		
	}
	
	
	
	public String getPastar() {
		return pastar;
	}

	public void setPastar(String pastar) {
		this.pastar = pastar;
	}
	
	
	
	
}
