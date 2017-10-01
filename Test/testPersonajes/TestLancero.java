package testPersonajes;

import org.junit.Assert;
import org.junit.Test;

import ItemDecorator.Escudo;
import ItemDecorator.Pu�al;
import personaje.Arquero;
import personaje.Lancero;
import personaje.Personaje;
import personaje.Soldado;

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
		Assert.assertEquals(ark.getSalud(), 25,0);
		ark2.equipar(pu�al);
		ark2.atacar(lancelot);
		Assert.assertEquals(lancelot.getSalud(), 137,0);
	}
	@Test
	public void TestEscudo() {
		Personaje soldado=new Soldado();
		Personaje ark=new Arquero();
		Escudo escudo=new Escudo();
		Pu�al pu�al=new Pu�al();
		
		soldado.atacar(ark);
		System.out.println(ark.getSalud());
		Assert.assertEquals(ark.getSalud(), 40,0);
		
		ark.equipar(escudo);
		soldado.atacar(ark);
		System.out.println(ark.getSalud());
		Assert.assertEquals(ark.getSalud(), 36,0);
		
		ark.equipar(pu�al);
		soldado.atacar(ark);
		System.out.println(ark.getSalud());
		Assert.assertEquals(ark.getSalud(), 29,0);
		
	}
	
	
}
