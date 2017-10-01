package testPersonajes;

import org.junit.Assert;
import org.junit.Test;

import ItemDecorator.Capa;
import personaje.Caballero;
import personaje.Lancero;
import personaje.Personaje;

public class TestCaballero {
	
	@Test
	public void TestLanceroVsCaballero() {
		Personaje lancelot=new Lancero();
		Personaje caballero=new Caballero();
		Capa capa=new Capa();
		
		lancelot.equipar(capa);
		lancelot.atacar(caballero);
		System.out.println(caballero.getSalud());
		Assert.assertEquals(caballero.getSalud(),177.5,0);
	}

	
	

}
