package polimorfia;




public abstract class Ex2animal {


	private String nomeString;
	private int idade;
	private String som;
	private boolean corre;
	
	
	
	public String getNomeString() {
		return nomeString;
	}
	public void setNomeString(String nomeString) {
		this.nomeString = nomeString;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String isSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public boolean isCorre() {
		return corre;
	}
	public void setCorre(boolean corre) {
		this.corre = corre;
	}
	
	
	
	public void som() {
		System.out.println("Sons de animais");
		
	}

		
}
	
	
	
	
	
	
	
	

