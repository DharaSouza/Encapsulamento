package Encapsulamento;

public class ObjetoEndereco {

	public static void main(String[] args) {
		
	Endereco endereco01 = new Endereco(2025,"Jardim Casa Grande","215","Casa","Frederico Gehring", "Itapetininga", 18000000,"SP");

	System.out.println(endereco01.getId());
	System.out.println(endereco01.getLogradouro());
	System.out.println(endereco01.getNumero());
	System.out.println(endereco01.getComplemento());
	System.out.println(endereco01.getBairro());
	System.out.println(endereco01.getCidade());
	System.out.println(endereco01.getComplemento());
	System.out.println(endereco01.getCep());
	System.out.println(endereco01.getUf());
	

	}

}
