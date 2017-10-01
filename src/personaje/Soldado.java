package personaje;



public class Soldado extends Personaje{


	private final float SALUD=200;
	private final int CANTFLECHAS=0;
	private final float DAÑO=10;
	private final int DISTANCIAMINIMA=0;
	private final int DISTANCIAMAXIMA=0;
	private final float ENERGIA=10;
	
	public Soldado() {
		this.salud=SALUD;
		this.canFlechas=CANTFLECHAS;
		this.daño=DAÑO;
		this.distanciaMinima=DISTANCIAMINIMA;
		this.distanciaMaxima=DISTANCIAMAXIMA;
		this.energia=ENERGIA;
		
	}
	
	@Override
	public void serAtacado(float daño) {
		this.salud-=daño;
		
	}
	@Override
	public void atacar(Personaje p) {
		if(this.energia<10)
			return;
		//Falta verificar la distancia y tener en cuenta la defensa
		this.energia-=10;
		p.serAtacado(this.daño);
	}

	
	
}
