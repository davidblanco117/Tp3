package personaje;

public class Caballero extends Personaje{
	

	private final float SALUD=150;
	private final int CANTFLECHAS=0;
	private final float DAÑO=50;
	private final int DISTANCIAMINIMA=1;
	private final int DISTANCIAMAXIMA=2;
	private final float ENERGIA=0;
	private EstadoCaballero estado;
	private int cantDeAtaques;
	
	public Caballero() {
		this.salud=SALUD;
		this.canFlechas=CANTFLECHAS;
		this.daño=DAÑO;
		this.distanciaMinima=DISTANCIAMINIMA;
		this.distanciaMaxima=DISTANCIAMAXIMA;
		this.energia=ENERGIA;
		this.estado=new Normal();
		this.cantDeAtaques=0;
	}
	
	public void beberAgua() {
		estado.beberAgua();
		this.cantDeAtaques=0;
	}
	

	public void serAtacado(float daño) {
		this.salud-=daño;
		
	}



	@Override
	public void atacar(Personaje p) {
		estado.atacar(p,this.daño);
		this.cantDeAtaques++;
		if(this.cantDeAtaques==3) {
			this.estado=new Rebelde();
		}
	}



	
	
	

}
