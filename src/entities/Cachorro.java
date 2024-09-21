package entities;

public class Cachorro extends Animal{
	
	private String cor;
	private String raca;
	private String porte;
	
	public Cachorro() {
	}

	public Cachorro(String nome, int idade, double peso, String habito, String tipoAlimentacao, String cor, String raca,
			String porte) {
		super(nome, idade, peso, habito, tipoAlimentacao);
		this.cor = cor;
		this.raca = raca;
		this.porte = porte;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}
	
	@Override
	public void emitirSom(String som) {
		System.out.println("Au au!");
	}

	@Override
	public String toString() {
		return super.toString()
		+ "\n Cor: " + cor
		+ "\n Raça: " + raca
		+ "\n Porte: " + porte;
	}
	
}
