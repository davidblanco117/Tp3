package personaje;

public class Caballero extends Personaje{
	

	private final float SALUD=200;
	private final int CANTFLECHAS=0;
	private final float DAŅO=50;
	private final int DISTANCIAMINIMA=1;
	private final int DISTANCIAMAXIMA=2;
	private final float ENERGIA=0;
	private final float DEFENSA=0;
	private final float PORCENTAJEDEDAŅORECIBIDO=1;
	private final boolean VIVO=true;
	private EstadoCaballero estado;
	private int cantDeAtaques;
	
	
	public Caballero() {
		this.salud=SALUD;
		this.canFlechas=CANTFLECHAS;
		this.daņo=DAŅO;
		this.distanciaMinima=DISTANCIAMINIMA;
		this.distanciaMaxima=DISTANCIAMAXIMA;
		this.energia=ENERGIA;
		this.estado=new Normal();
		this.cantDeAtaques=0;
		this.defensa=DEFENSA;
		this.vivo=VIVO;
		this.porcentajeDeDaņoRecibido=PORCENTAJEDEDAŅORECIBIDO;
	}
	
	public void beberAgua() {
		if(!vivo)
			return;
		estado=estado.beberAgua();
		this.cantDeAtaques=0;
	}
	




	@Override
	public void atacar(Personaje p) {
		if(!vivo)
			return;
		estado.atacar(p,this.daņo);
		this.cantDeAtaques++;
		if(this.cantDeAtaques==3) {
			this.estado=new Rebelde();
		}
	}



	
	
	

}
