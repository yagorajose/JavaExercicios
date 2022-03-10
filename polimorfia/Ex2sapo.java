package polimorfia;

public class Ex2sapo extends Ex2animal {

	private String pula;
	
	
	public String getPula() {
		return pula;
	}

	public void setPula(String pula) {
		this.pula = pula;
	}
	
	@Override
	public void som() {
		System.out.println("O sapo coaxa.");
		
	}
	

}
