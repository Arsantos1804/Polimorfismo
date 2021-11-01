package projetoPolimorfismo;

public class Aplicacao {
	
	public static void main(String[]args) {
		
		System.out.println("SUV");
		Suv carroSuv = new Suv();
		carroSuv.frear();
		carroSuv.desligar();
		carroSuv.ligar();
		carroSuv.acelerar();
		carroSuv.seAutoDescrever();
	

		
		System.out.println("Sedan");
		Carro carroSedan = new Sedan();
		carroSedan.frear();
		carroSedan.desligar();
		carroSedan.ligar();
		carroSedan.acelerar();
		carroSedan.seAutoDescrever();
		
		
		System.out.println("Esportivo");
		Carro carroEsportivo = new Esportivo();
		carroEsportivo.frear();
		carroEsportivo.desligar();
		carroEsportivo.ligar();
		carroEsportivo.acelerar();
		carroEsportivo.seAutoDescrever();
		
		
		System.out.println("Pickup");
		Carro carroPickup = new Pickup();
		carroPickup.frear();
		carroPickup.desligar();
		carroPickup.ligar();
		carroPickup.acelerar();
		carroPickup.seAutoDescrever();
		
			
		
	}

}
