package personaje;

public class Caballero {
	
	private int salud=200;
	private int daño=50;
	private int distanciaMinima=1;
	private int distanciaMaxima=2;
	private int cantDeAtaques=0;
	private EstadoCaballero estado;
	
	public Caballero(){
		this.estado=new Normal();
	}
	
	
	
	public void recibirDaño(int d){
		this.salud-=d;
	}

	public void atacar(){
		
		
		
		
		
		
	}
	
	

}
