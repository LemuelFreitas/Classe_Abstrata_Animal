package Classe_Abstrata_Atividade1;

public class Gato extends Animal{

	public Gato(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dormir() {
		System.out.println("O Gato está dormindo");
		
	}

	@Override
	public void caminhar() {
		System.out.println("O Gato está caminhando");
		
	}

	@Override
	public void correr() {
		System.out.println("O Gato está correndo");
		
	}

	@Override
	public void emitirsom() {
		System.out.println("O Gato está emitindo uma som");
		
	}

}

