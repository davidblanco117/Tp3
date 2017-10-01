package personaje;

import java.util.ArrayList;

import ItemDecorator.ItemDecorator;

public abstract class Personaje implements PersonajeEquipado {

	protected float salud;
	protected int distanciaMinima;
	protected int distanciaMaxima;
	protected float da�o;
	// protected float defensa;
	protected float energia;
	protected int canFlechas;
	protected ArrayList<ItemDecorator> items = new ArrayList<ItemDecorator>();

	public void desEquipar(ItemDecorator item) {
		for (ItemDecorator itemDecorator : items) {
			if (itemDecorator.getCodigoDeItem() == item.getCodigoDeItem()) {
				items.remove(itemDecorator);
				this.da�o -= itemDecorator.getAgregarDa�o();
				this.canFlechas -= itemDecorator.getAgregarCantidadFlechas();
				this.energia -= itemDecorator.getAgregarEnergia();
				this.distanciaMaxima -= itemDecorator.getAgregarDistanciaMaxima();
				this.distanciaMinima -= itemDecorator.getAgregarDistanciaMinima();
				this.salud -= itemDecorator.getAgregarSalud();
				return;
			}
		}
	}

	public void equipar(ItemDecorator item) {

		for (ItemDecorator itemDeco : items) {
			if (itemDeco.getCodigoDeItem() == item.getCodigoDeItem()) {
				return;
			}
		}

		item = item.evaluarMejora(this);
		items.add(item);

		this.da�o += item.getAgregarDa�o();
		this.canFlechas += item.getAgregarCantidadFlechas();
		this.energia += item.getAgregarEnergia();
		this.distanciaMaxima += item.getAgregarDistanciaMaxima();
		this.distanciaMinima += item.getAgregarDistanciaMinima();
		this.salud += item.getAgregarSalud();

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

	public float getDa�o() {
		return da�o;
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
