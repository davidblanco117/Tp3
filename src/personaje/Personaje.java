package personaje;

import java.util.ArrayList;

import ItemDecorator.ItemDecorator;

public abstract class Personaje implements PersonajeEquipado {

	protected float salud;
	protected int distanciaMinima;
	protected int distanciaMaxima;
	protected float daño;
	protected float defensa;
	protected float porcentajeDeDañoRecibido;
	protected float energia;
	protected int canFlechas;
	protected boolean vivo;
	

	protected ArrayList<ItemDecorator> items = new ArrayList<ItemDecorator>();

	public void desEquipar(ItemDecorator item) {
		if(!vivo)
			return;
		for (ItemDecorator itemDecorator : items) {
			if (itemDecorator.getCodigoDeItem() == item.getCodigoDeItem()) {
				items.remove(itemDecorator);
				this.daño -= itemDecorator.getAgregarDaño();
				this.canFlechas -= itemDecorator.getAgregarCantidadFlechas();
				this.energia -= itemDecorator.getAgregarEnergia();
				this.distanciaMaxima -= itemDecorator.getAgregarDistanciaMaxima();
				this.distanciaMinima -= itemDecorator.getAgregarDistanciaMinima();
				this.salud -= itemDecorator.getAgregarSalud();
				this.defensa-=itemDecorator.getAgregarDefensa();
				this.porcentajeDeDañoRecibido/=itemDecorator.getPorcentajeDeDañoRecibido();
				return;
			}
		}
	}

	public void equipar(ItemDecorator item) {

		if(!vivo)
			return;
		for (ItemDecorator itemDeco : items) 
			if (itemDeco.getCodigoDeItem() == item.getCodigoDeItem()) 
				return;
			
		item = item.evaluarMejora(this);
		items.add(item);

		this.daño += item.getAgregarDaño();
		this.canFlechas += item.getAgregarCantidadFlechas();
		this.energia += item.getAgregarEnergia();
		this.distanciaMaxima += item.getAgregarDistanciaMaxima();
		this.distanciaMinima += item.getAgregarDistanciaMinima();
		this.salud += item.getAgregarSalud();
		this.defensa+=item.getAgregarDefensa();
		this.porcentajeDeDañoRecibido*=item.getPorcentajeDeDañoRecibido();
	}
	
	
	
	

	public float getSalud() {
		return salud;
	}

	public int getDistanciaMinima() {
		return distanciaMinima;
	}

	public int getDistanciaMaxima() {
		return distanciaMaxima;
	}

	public float getDaño() {
		return daño;
	}

	public float getEnergia() {
		return energia;
	}

	public int getCanFlechas() {
		return canFlechas;
	}
	
	public boolean isVivo() {
		return vivo;
	}

	public abstract void atacar(Personaje p);
	
	//public abstract void serAtacado(float daño);
	public void serAtacado(float daño) {
		if(!vivo)
			return;
		if(this.salud-(daño*this.porcentajeDeDañoRecibido-this.defensa)<=0){
			this.salud=0;
			this.vivo=false;
			return;
		}
		this.salud-=(daño*this.porcentajeDeDañoRecibido-this.defensa);
	}
	// public abstract PersonajeEquipado equipar(ItemDecorator item);

}
