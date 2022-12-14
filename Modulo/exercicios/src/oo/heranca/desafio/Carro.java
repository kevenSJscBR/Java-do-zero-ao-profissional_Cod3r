package oo.heranca.desafio;

public class Carro {
	
	public int VELOCIDADE_MAXIMA;
	protected int velocidadeAtual;
	private int aumentoVelocidade = 5;
	
	public int getAumentoVelocidade() {
		return aumentoVelocidade;
	}
	public void setAumentoVelocidade(int aumentoVelocidade) {
		this.aumentoVelocidade = aumentoVelocidade;
	}
	protected Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	public void acelerar() {
		if(velocidadeAtual + getAumentoVelocidade() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += getAumentoVelocidade();			
		}
	}
	
	public void frear() {
		if(velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		} else {
			velocidadeAtual = 0;
		}
	}
	
	public String toString() {
		return "Velocidade atual é " + velocidadeAtual + "Km/h";
	}

}
