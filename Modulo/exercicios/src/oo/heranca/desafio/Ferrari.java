package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{

	private boolean ligarTurbo = false;
	private boolean ligarAr = false;
	
	public Ferrari(){
		this(315);
	}
	
	public Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		setAumentoVelocidade(15);;
	}
	@Override
	public void ligarTurbo() {
		setAumentoVelocidade(35);
	}
	
	@Override
	public void desligarTurbo() {
		setAumentoVelocidade(35);		
	}

	@Override
	public void ligarAr() {
		ligarAr = true;		
	}

	@Override
	public void desligarAr() {
		ligarAr = false;		
	}
	
	public int getAumentarVelocidade() {
		if(ligarTurbo && !ligarAr) {
			return 35;
		}else if(ligarTurbo && ligarAr) {
			return 30;
		}else if(!ligarTurbo && !ligarAr) {
			return 20;
		}else {
			return 15;
		}
	}
	
}
//	@Override
//	void acelerar() {
//		velocidadeAtual += 15;
//	}
	
