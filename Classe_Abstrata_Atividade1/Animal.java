package Classe_Abstrata_Atividade1;

public abstract class Animal {
	private String nome;
	private String sexo;
	private String raca;
	public Animal(String nome, String sexo, String raca) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.raca = raca;
	}
	public abstract void dormir();
	public abstract void caminhar();
	public abstract void correr();
	public abstract void emitirsom();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	
}
