package testPersonajes;

import org.junit.Assert;
import org.junit.Test;

import ItemDecorator.Capa;
import ItemDecorator.Puñal;
import personaje.Arquero;
import personaje.Personaje;

public class TestArquero {

	
	
	
	@Test
	
	public void testArquero() {
		Personaje ark=new Arquero();
		Capa capa= new Capa();
		Puñal puñal=new Puñal();
		Assert.assertEquals(ark.getDaño(),5,0);
		ark.equipar(capa);
		System.out.println(ark.getDaño());
		Assert.assertEquals(ark.getDaño(),4.5,0);
		ark.equipar(capa);
		System.out.println(ark.getDaño());
		Assert.assertEquals(ark.getDaño(),4.5,0);
		ark.desEquipar(capa);
		System.out.println(ark.getDaño());
		Assert.assertEquals(ark.getDaño(),5,0);
		ark.equipar(capa);
		System.out.println(ark.getDaño());
		ark.equipar(puñal);
		System.out.println(ark.getDaño());
		Assert.assertEquals(ark.getDaño(),7.5,0);
		Assert.assertEquals(ark.getSalud(), 47,0);
		
		
	}
	
	
	
	
	
}
