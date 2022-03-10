package poointro;

public class Ex6CtaBanc {

	public String banco;
	public String nCta;
	public String agencia;
	public double saldo;
	
	
	public void transf() {
		if (saldo > 2) {
			System.out.println("Dinheiro a sacar, digite seus dados");
			
		} else {
			System.out.println("Você não pode sacar pois não tem dinheiro suficiente em conta");
		}
		
		
	}


	public String getBanco() {
		return banco;
	}


	public void setBanco(String banco) {
		this.banco = banco;
	}


	public String getnCta() {
		return nCta;
	}


	public void setnCta(String nCta) {
		this.nCta = nCta;
	}


	public String getAgencia() {
		return agencia;
	}


	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	
	
	
	
}
