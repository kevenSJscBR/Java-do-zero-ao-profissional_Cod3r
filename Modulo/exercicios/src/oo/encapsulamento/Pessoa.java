package oo.encapsulamento;

public class Pessoa {
	
	private int idade;
	private String nome;
	private String sobrenome;

	public Pessoa(String nome, String sobrenome, int idade){
		setIdade(idade);
		setSobrenome(sobrenome);
		setNome(nome);
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
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
	
	public String getNomeCompleto() {
		return getNome()+ " " + getSobrenome();
	}

	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >= 0 && novaIdade <= 130) {
			this.idade = novaIdade;			
		}
	}
	@Override
	public String toString() {
		return "Olá eu sou o " + getNomeCompleto() + " e tenho " + getIdade() + " anos.";
	}
}
