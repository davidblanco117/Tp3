package ItemDecorator;

import personaje.Personaje;
import personaje.PersonajeEquipado;

public abstract class ItemDecorator implements PersonajeEquipado{

	PersonajeEquipado personaje;
	
	protected float agregarSalud=0;
	protected float agregarEnergia=0;
	protected int agregarDistanciaMaxima=0;
	protected int agregarDistanciaMinima=0;
	protected float agregarDaño=0;
	protected int agregarCantidadFlechas=0;

	protected int codigoDeItem =0;
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

	public float getAgregarDaño() {
		return agregarDaño;
	}

	public int getAgregarCantidadFlechas() {
		return agregarCantidadFlechas;
	}

	

	public ItemDecorator(PersonajeEquipado personaje) {
		this.personaje=personaje;
		
	}
	
	public ItemDecorator(Personaje personaje) {
	}
	
	public ItemDecorator() {
	}
	
}
