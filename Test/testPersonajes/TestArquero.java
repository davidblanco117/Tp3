package testPersonajes;

import org.junit.Assert;
import org.junit.Test;

import ItemDecorator.Capa;
import ItemDecorator.Pu�al;
import personaje.Arquero;
import personaje.Personaje;

public class TestArquero {

	
	
	
	@Test
	
	public void testArquero() {
		Personaje ark=new Arquero();
		Capa capa= new Capa();
		Pu�al pu�al=new Pu�al();
		Assert.assertEquals(ark.getDa�o(),5,0);
		ark.equipar(capa);
		System.out.println(ark.getDa�o());
		Assert.assertEquals(ark.getDa�o(),4.5,0);
		ark.equipar(capa);
		System.out.println(ark.getDa�o());
		Assert.assertEquals(ark.getDa�o(),4.5,0);
		ark.desEquipar(capa);
		System.out.println(ark.getDa�o());
		Assert.assertEquals(ark.getDa�o(),5,0);
		ark.equipar(capa);
		System.out.println(ark.getDa�o());
		ark.equipar(pu�al);
		System.out.println(ark.getDa�o());
		Assert.assertEquals(ark.getDa�o(),7.5,0);
		Assert.assertEquals(ark.getSalud(), 47,0);
		
		
	}
	
	
	
	
	
}
