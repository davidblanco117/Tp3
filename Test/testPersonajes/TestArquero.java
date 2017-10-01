package testPersonajes;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import ItemDecorator.Capa;
import personaje.Arquero;
import personaje.Personaje;
import personaje.PersonajeEquipado;

public class TestArquero {

	
	
	
	@Test
	
	public void testArquero() {
		Personaje ark=new Arquero();
		Capa capa= new Capa();
		Assert.assertEquals(ark.getDaño(),5,0);
		ark.equipar(capa);
		System.out.println(ark.getDaño());
		Assert.assertEquals(ark.getDaño(),4.5,0);
		ark.equipar(capa);
		System.out.println(ark.getDaño());
		Assert.assertEquals(ark.getDaño(),4.5,0);
		
	}
	
	
	
	
	
}
