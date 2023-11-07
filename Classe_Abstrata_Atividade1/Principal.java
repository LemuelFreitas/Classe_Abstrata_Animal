package Classe_Abstrata_Atividade1;

public class Principal {

	public static void main(String[] args) {
		Lobo lobinho = new Lobo("luisinho", "M", "canis lupus");
		lobinho.caminhar();
		lobinho.correr();
		lobinho.dormir();
		lobinho.emitirsom();
		lobinho.getNome();
		lobinho.getSexo();
		lobinho.getRaca();
		System.out.println("-------------------------");
		Leao leaozinho = new Leao("luisinho1", "M", "leao");
		leaozinho.caminhar();
		leaozinho.correr();
		leaozinho.dormir();
		leaozinho.emitirsom();
		leaozinho.getNome();
		leaozinho.getSexo();
		leaozinho.getRaca();
		System.out.println("-------------------------");
		Tigre Tigrezinho = new Tigre("luisinho2", "M", "Tigre");
		Tigrezinho.caminhar();
		Tigrezinho.correr();
		Tigrezinho.dormir();
		Tigrezinho.emitirsom();
		Tigrezinho.getNome();
		Tigrezinho.getSexo();
		Tigrezinho.getRaca();
		System.out.println("-------------------------");
		Cachorro Cachorrozinho = new Cachorro("luisinho3", "M", "Cachorro");
		Cachorrozinho.caminhar();
		Cachorrozinho.correr();
		Cachorrozinho.dormir();
		Cachorrozinho.emitirsom();
		Cachorrozinho.getNome();
		Cachorrozinho.getSexo();
		Cachorrozinho.getRaca();
		System.out.println("-------------------------");
		Gato Gatozinho = new Gato("luisinho4", "M", "Gato");
		Gatozinho.caminhar();
		Gatozinho.correr();
		Gatozinho.dormir();
		Gatozinho.emitirsom();
		Gatozinho.getNome();
		Gatozinho.getSexo();
		Gatozinho.getRaca();
}
}
