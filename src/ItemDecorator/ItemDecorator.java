package ItemDecorator;

import personaje.Personaje;
import personaje.PersonajeEquipado;

public abstract class ItemDecorator implements PersonajeEquipado{

	PersonajeEquipado personaje;
	
	protected float agregarSalud=0;
	protected float agregarEnergia=0;
	protected int agregarDistanciaMaxima=0;
	protected int agregarDistanciaMinima=0;
	protected float agregarDa�o=0;
	protected int agregarCantidadFlechas=0;
	protected float agregarDefensa=0;
	public float getPorcentajeDeDa�oRecibido() {
		return porcentajeDeDa�oRecibido;
	}

	protected float porcentajeDeDa�oRecibido=1;
	protected boolean vivo=true;
	
	protected int codigoDeItem =0;  ///Tuve que a�adir un codigo de Item por que si no no lo encontraba en la lista de Items
	public int getCodigoDeItem() {
		return this.codigoDeItem;
	}
	
	public abstract ItemDecorator evaluarMejora(PersonajeEquipado personaje);
	
	
	
	

	public PersonajeEquipado getPersonaje() {
		return personaje;
	}

	public float getAgregarSalud() {
		return agregarSalud;
	}

	public float getAgregarEnergia() {
		return agregarEnergia;
	}

	public int getAgregarDistanciaMaxima() {
		return agregarDistanciaMaxima;
	}

	public int getAgregarDistanciaMinima() {
		return agregarDistanciaMinima;
	}

	public float getAgregarDa�o() {
		return agregarDa�o;
	}

	public int getAgregarCantidadFlechas() {
		return agregarCantidadFlechas;
	}

	public float getAgregarDefensa() {
		return agregarDefensa;
	}

	public ItemDecorator(PersonajeEquipado personaje) {
		this.personaje=personaje;
		
	}
	
	public ItemDecorator(Personaje personaje) {
	}
	
	public ItemDecorator() {
	}
	
}
