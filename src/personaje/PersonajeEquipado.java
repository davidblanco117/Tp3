package personaje;

import ItemDecorator.ItemDecorator;

public interface PersonajeEquipado {

	public abstract void equipar(ItemDecorator it);
	
	public abstract float getDaño();
	public abstract float getSalud();
	public abstract float getEnergia();
	public abstract int getCanFlechas();
	public abstract int getDistanciaMinima();
	public abstract int getDistanciaMaxima();
	
	
}
