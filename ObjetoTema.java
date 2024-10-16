package Encapsulamento;

public class ObjetoTema {

	public static void main(String[] args) {
		
		Tema tema1 = new Tema(2024,"Apartamento",1000.00,"Azul");
		Tema tema2 = new Tema(2025,"Condominio",1000.00,"Amarelo");

		System.out.println(tema1.getId());
		System.out.println(tema1.getNome());
		System.out.println(tema1.getValorAluguel());
		System.out.println(tema1.getCor());
		
		System.out.println(tema2.getId());
		System.out.println(tema2.getNome());
		System.out.println(tema2.getValorAluguel());
		System.out.println(tema2.getCor());

	}

}
