package personaje;

public class Lancero extends Personaje{
	

	private final float SALUD=150;
	private final int CANTFLECHAS=0;
	private final float DAÑO=25;
	private final int DISTANCIAMINIMA=1;
	private final int DISTANCIAMAXIMA=2;
	private final float ENERGIA=0;
	private final float DEFENSA=0;
	private final float POCENTAJEDEDAÑORECIBIDO=1;
	private final boolean VIVO=true;
	public Lancero() {
		this.salud=SALUD;
		this.canFlechas=CANTFLECHAS;
		this.daño=DAÑO;
		this.distanciaMinima=DISTANCIAMINIMA;
		this.distanciaMaxima=DISTANCIAMAXIMA;
		this.energia=ENERGIA;
		this.defensa=DEFENSA;
		this.porcentajeDeDañoRecibido=POCENTAJEDEDAÑORECIBIDO;
		this.vivo=VIVO;
	}

	@Override
	public void atacar(Personaje p) {
		//Falta verificar la distancia
		if(!vivo)
			return;
		p.serAtacado(this.daño);
		
	}

	
	
	
	

}
