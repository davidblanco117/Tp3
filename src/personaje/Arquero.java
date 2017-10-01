package personaje;

public class Arquero extends Personaje {

	
	private final float SALUD=50;
	private final int CANTFLECHAS=20;
	private final float DAÑO=5;
	private final int DISTANCIAMINIMA=2;
	private final int DISTANCIAMAXIMA=5;
	private final float ENERGIA=0;
	private final float DEFENSA=0;
	protected float POCENTAJEDEDAÑORECIBIDO=1;
	private final boolean VIVO=true;
	
	
	
	
	
	
	
	
	public Arquero() {
		this.salud=SALUD;
		this.canFlechas=CANTFLECHAS;
		this.daño=DAÑO;
		this.distanciaMinima=DISTANCIAMINIMA;
		this.distanciaMaxima=DISTANCIAMAXIMA;
		this.energia=ENERGIA;
		this.defensa=DEFENSA;
		this.vivo=VIVO;
		this.porcentajeDeDañoRecibido=POCENTAJEDEDAÑORECIBIDO;
		
	}

	

	
	
	public void atacar(Personaje p){
		
		if(!vivo||this.canFlechas==0)
			return;
		
		this.canFlechas--;
		
		//Falta verificar la distancia y tener en cuenta la defensa
		
		p.serAtacado(this.daño);
		
		
		
	}




	
	
}
