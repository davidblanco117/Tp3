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
	public void atacar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void serAtacado() {
		// TODO Auto-generated method stub
		
	}
	
	

}
