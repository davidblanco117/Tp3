package personaje;

public class Lancero extends Personaje{
	

	private final float SALUD=150;
	private final int CANTFLECHAS=0;
	private final float DAÑO=50;
	private final int DISTANCIAMINIMA=1;
	private final int DISTANCIAMAXIMA=2;
	private final float ENERGIA=0;
	
	public Lancero() {
		this.salud=SALUD;
		this.canFlechas=CANTFLECHAS;
		this.daño=DAÑO;
		this.distanciaMinima=DISTANCIAMINIMA;
		this.distanciaMaxima=DISTANCIAMAXIMA;
		this.energia=ENERGIA;
		
	}

	@Override
	public void atacar(Personaje p) {
		//Falta verificar la distancia
		p.serAtacado(this.daño);
		
	}

	@Override
	public void serAtacado(float daño) {
		//Falta verificar la defensa y si la salud llega a 0
		this.salud-=daño;
		
	}
	
	
	
	
	

}
