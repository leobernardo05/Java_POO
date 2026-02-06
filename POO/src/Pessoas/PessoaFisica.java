package Pessoas;

public class PessoaFisica extends Pessoa {
	
	private String cpf;

	   

	   public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public PessoaFisica(String nome, String email, String cpf) {
		  super(nome,email);
		  this.setCpf(cpf);

	   }

	   

	   public void imprimir() {

		   System.out.println("Nome: "+ this.setCpf(cpf));
		   System.out.println("Email:"+ this.setEmail(cpf));
	       System.out.println("CPF: "+cpf);

	       
	     }
	   }


