package personaje;

import ItemDecorator.ItemDecorator;

public class Arquero extends Personaje {

	
	private final float SALUD=50;
	private final int CANTFLECHAS=20;
	private final float DAÑO=5;
	private final int DISTANCIAMINIMA=2;
	private final int DISTANCIAMAXIMA=5;
	private final float ENERGIA=0;
	
	
	
	
	
	
	
	
	
	
	public Arquero() {
		this.salud=SALUD;
		this.canFlechas=CANTFLECHAS;
		this.daño=DAÑO;
		this.distanciaMinima=DISTANCIAMINIMA;
		this.distanciaMaxima=DISTANCIAMAXIMA;
		this.energia=ENERGIA;
		

		
	}
	public Arquero(int salud, int daño, int canFlechas, int distanciaMinima, int distanciaMaxima, int energia) {
		this.salud=salud;
		this.canFlechas=canFlechas;
		this.daño=daño;
		this.distanciaMinima=distanciaMinima;
		this.distanciaMaxima=distanciaMaxima;
		this.energia=energia;
		
	}
	
	
	
	
	
	
	public void atacar(){
		
		
		//Cuando realice el ataque debe verificar la cantidad de flechas y la distancia
		
		
		
		
	}




	@Override
	public void serAtacado() {
		// TODO Auto-generated method stub
		
	}
	
	
}
