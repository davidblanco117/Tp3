package personaje;

import java.util.ArrayList;

import ItemDecorator.ItemDecorator;

public abstract class Personaje implements PersonajeEquipado {

	protected float salud;
	protected int distanciaMinima;
	protected int distanciaMaxima;
	protected float daño;

	protected float energia;
	protected int canFlechas;
	protected ArrayList<ItemDecorator> items = new ArrayList<ItemDecorator>();


	
	public void equipar(ItemDecorator item) {
		
		
		boolean existe=false;
		for (ItemDecorator itemDecorator : items) {
			if(itemDecorator.getCodigoDeItem()==item.getCodigoDeItem())
				existe=true;
		}
		
		if (!existe) {
			
			
			item = item.evaluarMejora(this);
			items.add(item);

			for (ItemDecorator itemDecorator : items) {
				this.daño += itemDecorator.getAgregarDaño();
				this.canFlechas += itemDecorator.getAgregarCantidadFlechas();
				this.energia += itemDecorator.getAgregarEnergia();
				this.distanciaMaxima += itemDecorator.getAgregarDistanciaMaxima();
				this.distanciaMinima += itemDecorator.getAgregarDistanciaMinima();
				this.salud += itemDecorator.getAgregarSalud();
			}
		}
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

	public abstract void atacar();

	public abstract void serAtacado();
	// public abstract PersonajeEquipado equipar(ItemDecorator item);

}
