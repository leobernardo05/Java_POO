package OrientacaoObjeto;

public class Aluno {
	
	private String nome;
	
	private float n1;
	private float n2;
	float media;
	
	//nome
	public String getnome() {
		return nome;
	}
	
	public void setnome (String novoNome) {
		nome = novoNome;
	}
	
	//nota 1
	public float getn1 () {
		return n1;
	}

	public void setn1 (float novaNota1) {
		if (n1 >= 0 && n1 <= 10) {
			n1 = novaNota1;
		}
	}
     
	//nota 2
	public float getn2 () {
		return n2;
	}
	
	public void setn2 (float novaNota2) {
		if (n2 <= 10 && n2 >= 0) {
			n2 = novaNota2;
		}
	}
	public float getmedia () {
		media = (n1+n2)/2;
		return media;
	}
	
	//construtor
	public Aluno () {
		n1 = 0;
		n2 = 0;
		nome = "?";
	}
	
	
	

}
