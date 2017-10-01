package testPersonajes;

import org.junit.Assert;
import org.junit.Test;

import ItemDecorator.Pu�al;
import personaje.Arquero;
import personaje.Lancero;
import personaje.Personaje;

public class TestLancero {

	@Test
	
	
	public void TestLanceros() {
		
		Personaje lancelot=new Lancero();
		Personaje ark= new Arquero();
		Personaje ark2= new Arquero();
		Pu�al pu�al=new Pu�al();
		Assert.assertEquals(lancelot.getSalud(),150,0);
		Assert.assertEquals(ark.getCanFlechas(), 20, 0);
		ark.atacar(lancelot);
		Assert.assertEquals(lancelot.getSalud(), 145,0);
		Assert.assertEquals(ark.getCanFlechas(), 19,0);
		lancelot.atacar(ark);
		Assert.assertEquals(ark.getSalud(), 0,0);
		ark2.equipar(pu�al);
		ark2.atacar(lancelot);
		Assert.assertEquals(lancelot.getSalud(), 137,0);
	}
	
	
	
}
