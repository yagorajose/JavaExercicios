package pooherança;




public class Ex1animal {

	//Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
	//comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
	//características de forma que tudo o que for comum a todos os animais fique na classe Animal:
	//ANIMAL: 1 Cachorro (nome, idade, som, corre) 2 Cavalo (nome, idade, som, corre) 3 Preguiça (nome, idade, som, sobe arvore)

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
	
	
	
	
	
	
	
}
