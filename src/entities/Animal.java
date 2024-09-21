package entities;

public class Animal {

	private String nome;
	private int idade;
	private double peso;
	private String habito;
	private String tipoAlimentacao;

	public Animal() {
	}

	public Animal(String nome, int idade, double peso, String habito, String tipoAlimentacao) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.habito = habito;
		this.tipoAlimentacao = tipoAlimentacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getHabito() {
		return habito;
	}

	public void setHabito(String habito) {
		this.habito = habito;
	}

	public String getTipoAlimentacao() {
		return tipoAlimentacao;
	}

	public void setTipoAlimentacao(String tipoAlimentacao) {
		this.tipoAlimentacao = tipoAlimentacao;
	}

	public void emitirSom(String som) {
		System.out.println("Animal emite som.");
	}
	
	public void emitirSom(int n) {
		System.out.println("Animal sabe contar inteiros:");
		for (int i = 0; i <= n; i++) {
			System.out.println(i);
		}	
	}
	
	public void emitirSom(double n) {
		System.out.println("Animal sabe contar decimais:");
		for (double i = 0; i <= n; i = i + 0.1) {
			System.out.println(i);
		}
	}

	@Override
	public String toString() {
		return 	"\n Nome: " + nome
				+ "\n Idade: " + idade + " anos"
				+ "\n Peso: " + peso + " kg"
				+ "\n Habito: " + habito
				+ "\n Tipo da alimentacao: " + tipoAlimentacao;
	}
	
}
