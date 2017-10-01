package personaje;

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

	

	
	
	public void atacar(){
		
		
		//Cuando realice el ataque debe verificar la cantidad de flechas y la distancia
		
		
		
		
	}




	@Override
	public void serAtacado() {
		// TODO Auto-generated method stub
		
	}
	
	
}
