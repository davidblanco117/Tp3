package testPersonajes;

import org.junit.Assert;
import org.junit.Test;

import ItemDecorator.Capa;
import personaje.Caballero;
import personaje.Lancero;
import personaje.Personaje;
import personaje.Soldado;

public class TestCaballero {
	
	@Test
	public void TestLanceroVsCaballero() {
		Personaje lancelot=new Lancero();
		Personaje caballero=new Caballero();
		Personaje soldado= new Soldado();
		
		
		
		caballero.atacar(soldado);
		caballero.atacar(soldado);
		caballero.atacar(soldado);
		caballero.atacar(soldado);
		System.out.println(soldado.getSalud());
		Assert.assertEquals(soldado.getSalud(), 50,0);
		soldado.atacar(caballero);
		caballero.beberAgua();

		caballero.atacar(soldado);
		Assert.assertEquals(soldado.getSalud(), 0,0);
		
		soldado.beberAgua();
		Assert.assertEquals(soldado.getEnergia(),100,0);
		
		
		Capa capa=new Capa();
		Personaje caballero2= new Caballero();
		lancelot.equipar(capa);
		lancelot.atacar(caballero2);
		System.out.println(caballero2.getSalud());
		Assert.assertEquals(caballero2.getSalud(),177.5,0);
		caballero2.atacar(lancelot);
		System.out.println(lancelot.getSalud());
		Assert.assertEquals(lancelot.getSalud(),100,0);
		
		
		
		
		
	}

	
	

}
