package personaje;

public class Normal extends EstadoCaballero{
	

	public EstadoCaballero beberAgua(){
		return this;
	}
	public void atacar(Personaje p,float da�o) {
		p.serAtacado(da�o);
	}
}
