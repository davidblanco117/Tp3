package ItemDecorator;

import personaje.PersonajeEquipado;

public class Pu�al extends ItemDecorator{
	
	
	
	public Pu�al() {
		this.codigoDeItem=222;
	}

	public Pu�al(PersonajeEquipado personaje) {
		this.codigoDeItem=222;
		this.agregarDa�o=3;
		this.agregarDefensa=-3;
	}
	
	
	
	public ItemDecorator evaluarMejora(PersonajeEquipado personaje) {
		
		Pu�al pu�al=new Pu�al(personaje);
		return pu�al;
	}

	@Override
	public float getDa�o() {
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
