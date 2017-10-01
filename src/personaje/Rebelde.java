package personaje;

public class Rebelde extends EstadoCaballero {
	
	public EstadoCaballero beberAgua(){
		return new Normal();
	}

	@Override
	public void atacar(Personaje p, float daño) {
		return;
		
	}

}
