package projetoPolimorfismo;

public abstract class Carro extends Automovel{
	public abstract void seAutoDescrever();

	@Override
	public void ligar() {
		System.out.println("Carro Ligado");
		
	}

	@Override
	public void desligar() {
		System.out.println("Carro Desligado");
		
		
	}

	@Override
	public void acelerar() {
		System.out.println("Carro Acelerado");
	
		
	}

	@Override
	public void frear() {
		System.out.println("Carro freado");
	
		
	}
	
	
	

}
