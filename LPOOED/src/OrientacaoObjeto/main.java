package OrientacaoObjeto;

public class main {

	public static void main(String[] args) {
		Aluno Aluno1 = new Aluno();
		Aluno1.setn1(10);
		Aluno1.setn2(9.8f);
		Aluno1.setnome("Leo");
		System.out.println(Aluno1.getn1());
		System.out.println(Aluno1.getn2());
		System.out.println(Aluno1.getnome());
		System.out.println(Aluno1.getmedia());
		

	}

}
