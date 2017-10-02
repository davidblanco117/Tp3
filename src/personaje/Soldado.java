package personaje;



public class Soldado extends Personaje{


	private final float SALUD=200;
	private final int CANTFLECHAS=0;
	private final float DAÑO=10;
	private final int DISTANCIAMINIMA=0;
	private final int DISTANCIAMAXIMA=0;
	private final float ENERGIA=100;
	private final float DEFENSA=0;
	private final float PORCENTAJEDEDAÑORECIBIDO=1;
	private final boolean VIVO=true;
	public Soldado() {
		this.salud=SALUD;
		this.canFlechas=CANTFLECHAS;
		this.daño=DAÑO;
		this.distanciaMinima=DISTANCIAMINIMA;
		this.distanciaMaxima=DISTANCIAMAXIMA;
		this.energia=ENERGIA;
		this.defensa=DEFENSA;
		this.porcentajeDeDañoRecibido=PORCENTAJEDEDAÑORECIBIDO;
		this.vivo=VIVO;
	}
	

	@Override
	public void atacar(Personaje p) {
		if(this.energia<10|| !vivo)
			return;
		//Falta verificar la distancia
		this.energia-=10;
		p.serAtacado(this.daño);
	}

	public void beberAgua() {
		this.energia=100;
	}
	
}
