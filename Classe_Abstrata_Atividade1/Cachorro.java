package Classe_Abstrata_Atividade1;

public class Cachorro extends Animal{

	public Cachorro(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dormir() {
		System.out.println("O Cachorro está dormindo");
		
	}

	@Override
	public void caminhar() {
		System.out.println("O Cachorro está caminhando");
		
	}

	@Override
	public void correr() {
		System.out.println("O Cachorro está correndo");
		
	}

	@Override
	public void emitirsom() {
		System.out.println("O Cachorro está emitindo uma som");
		
	}

}
