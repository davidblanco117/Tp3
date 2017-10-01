package ItemDecorator;

import personaje.PersonajeEquipado;

public class Escudo extends ItemDecorator{
	
	
	
	public Escudo() {
		this.codigoDeItem=333;
	}

	public Escudo(PersonajeEquipado personaje) {
		this.codigoDeItem=333;
		this.porcentajeDeDañoRecibido=(float)0.4;

	}
	
	
	
	public ItemDecorator evaluarMejora(PersonajeEquipado personaje) {
		
		Escudo escudo=new Escudo(personaje);
		return escudo;
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
