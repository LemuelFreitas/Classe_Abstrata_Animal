package Classe_Abstrata_Atividade1;
public class Leao extends Animal{

	public Leao(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dormir() {
		System.out.println("O Leao está dormindo");
		
	}

	@Override
	public void caminhar() {
		System.out.println("O Leao está caminhando");
		
	}

	@Override
	public void correr() {
		System.out.println("O Leao está correndo");
		
	}

	@Override
	public void emitirsom() {
		System.out.println("O Leao está emitindo uma som");
		
	}

}
