package Encapsulamento;

public class ObjetoContaBancaria {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria(100000.00);
		
		//Saldo inicial
		System.out.println(conta.getsaldo());
		
		//Depósitos
		conta.depositar(500);
		conta.depositar(1000);
		
		//Mostrar saldosapós 2 depósitos
		System.out.println(conta.getsaldo());
		
		//Saque
		conta.sacar(1500);
		
		//Mostrar após saque 
		System.out.println(conta.getsaldo());
	}

}
