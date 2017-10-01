package personaje;

public class Caballero extends Personaje{
	

	private final float SALUD=150;
	private final int CANTFLECHAS=0;
	private final float DA�O=50;
	private final int DISTANCIAMINIMA=1;
	private final int DISTANCIAMAXIMA=2;
	private final float ENERGIA=0;
	private EstadoCaballero estado;
	private int cantDeAtaques;
	
	public Caballero() {
		this.salud=SALUD;
		this.canFlechas=CANTFLECHAS;
		this.da�o=DA�O;
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
	

	public void serAtacado(float da�o) {
		this.salud-=da�o;
		
	}



	@Override
	public void atacar(Personaje p) {
		estado.atacar(p,this.da�o);
		this.cantDeAtaques++;
		if(this.cantDeAtaques==3) {
			this.estado=new Rebelde();
		}
	}



	
	
	

}
