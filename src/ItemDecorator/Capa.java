package ItemDecorator;

import personaje.PersonajeEquipado;

public class Capa extends ItemDecorator {
	
	
	
	
	public Capa() {
		this.codigoDeItem=111;
	}

	public Capa(PersonajeEquipado personaje) {
		this.codigoDeItem=111;
		this.agregarDaño=personaje.getDaño()/10*-1;
		this.agregarEnergia=personaje.getEnergia();
	}
	
	
	
	public ItemDecorator evaluarMejora(PersonajeEquipado personaje) {
		
		Capa capa=new Capa(personaje);
		return capa;
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

	@Override
	public void equipar(ItemDecorator it) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
