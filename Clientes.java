package Encapsulamento;

public class Clientes {

		private long id;
		private String nome;
		private String telefone;
		private String cpf;
		private String rg;
		
		public Clientes() {
		}
			public Clientes(long id, String nome,String telefone,String cpf, String rg) {
				this.id = id;
				this.nome = nome;
				this.telefone = telefone;
				this.cpf = cpf;
				this.rg = rg;
			}
			public long getId() {
				return id;
			}
			public void setId(long id) {
				this.id = id;
			}
			public String getNome() {
				return nome;
			}
			public void setNome(String nome) {
				this.nome = nome;
			}
			public String getTelefone() {
				return telefone;
			}
			public void setTelefone(String telefone) {
				this.telefone = telefone;
			}
			public String getCpf() {
				return cpf;
			}
			public void setCpf(String cpf) {
				this.cpf = cpf;
			}
			public String getRg() {
				return rg;
			}
			public void setRg(String rg) {
				this.rg = rg;
			}
			
		
		

	}

}
