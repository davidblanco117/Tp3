package personaje;



public class Soldado extends Personaje{


	private final float SALUD=200;
	private final int CANTFLECHAS=0;
	private final float DA�O=10;
	private final int DISTANCIAMINIMA=0;
	private final int DISTANCIAMAXIMA=0;
	private final float ENERGIA=10;
	
	public Soldado() {
		this.salud=SALUD;
		this.canFlechas=CANTFLECHAS;
		this.da�o=DA�O;
		this.distanciaMinima=DISTANCIAMINIMA;
		this.distanciaMaxima=DISTANCIAMAXIMA;
		this.energia=ENERGIA;
		
	}
	
	@Override
	public void serAtacado(float da�o) {
		this.salud-=da�o;
		
	}
	@Override
	public void atacar(Personaje p) {
		if(this.energia<10)
			return;
		//Falta verificar la distancia y tener en cuenta la defensa
		this.energia-=10;
		p.serAtacado(this.da�o);
	}

	
	
}
