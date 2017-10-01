package ItemDecorator;

import personaje.PersonajeEquipado;

public class Puñal extends ItemDecorator{
	
	
	
	public Puñal() {
		this.codigoDeItem=222;
	}

	public Puñal(PersonajeEquipado personaje) {
		this.codigoDeItem=222;
		this.agregarDaño=3;
		this.agregarDefensa=-3;
	}
	
	
	
	public ItemDecorator evaluarMejora(PersonajeEquipado personaje) {
		
		Puñal puñal=new Puñal(personaje);
		return puñal;
	}

	@Override
	public float getDaño() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public float getSalud() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public float getEnergia() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public int getCanFlechas() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public int getDistanciaMinima() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public int getDistanciaMaxima() {
		// TODO Auto-generated method stub
		return 0;
	}

}
