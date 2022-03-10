package poointro;

public class Ex1ClienteObj {

	public static void main(String[] args) {

		
		Ex1Cliente c1 = new Ex1Cliente();
		
		c1.setNome("Rodrigo");
		c1.setSexo("M");
		c1.setIdade("22");
		c1.setEndereco("Rua das babosas");
		
			System.out.println("Cliente: " + c1.nome + "\nSexo: " + c1.sexo + "\nIdade: " + c1.idade + "\nEndereco " + c1.endereco);
			c1.comprar();
		
	}

}
