package personaje;



public class Soldado extends Personaje{


	private final float SALUD=200;
	private final int CANTFLECHAS=0;
	private final float DAŅO=10;
	private final int DISTANCIAMINIMA=0;
	private final int DISTANCIAMAXIMA=0;
	private final float ENERGIA=100;
	private final float DEFENSA=0;
	private final float PORCENTAJEDEDAŅORECIBIDO=1;
	private final boolean VIVO=true;
	public Soldado() {
		this.salud=SALUD;
		this.canFlechas=CANTFLECHAS;
		this.daņo=DAŅO;
		this.distanciaMinima=DISTANCIAMINIMA;
		this.distanciaMaxima=DISTANCIAMAXIMA;
		this.energia=ENERGIA;
		this.defensa=DEFENSA;
		this.porcentajeDeDaņoRecibido=PORCENTAJEDEDAŅORECIBIDO;
		this.vivo=VIVO;
	}
	

	@Override
	public void atacar(Personaje p) {
		if(this.energia<10|| !vivo)
			return;
		//Falta verificar la distancia
		this.energia-=10;
		p.serAtacado(this.daņo);
	}

	public void beberAgua() {
		this.energia=100;
	}
	
}
