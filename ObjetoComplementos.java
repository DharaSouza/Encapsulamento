package Encapsulamento;

public class ObjetoComplementos {

	public static void main(String[] args) {
	
		Complementos casa1 = new Complementos (205,"Apartamento","Quarto");
		Complementos casa2 = new Complementos (2658,"Comdominio","Cozinha");
		
		System.out.println(casa1.getId());
		System.out.println(casa1.getNome());
		System.out.println(casa1.getDescricao());
		
		System.out.println(casa2.getId());
		System.out.println(casa2.getNome());
		System.out.println(casa2.getDescricao());
	}

}
