package tests;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import clases.Punto;
import clases.Segmento;

class testDistancia {

	Punto punto1 = new Punto (2,3);
	Punto punto2 = new Punto (3,4);
	
	Segmento segmento1 = new Segmento(punto1,punto2);
	
	@Test
	void testDistancia() {
		double distanciaEsperada = Math.round(segmento1.distancia());
		double distanciaObtenida = Math.round(1.4142);
		
		assertEquals(distanciaEsperada,distanciaObtenida);
	}
	
	
	@Test
	void testDistancia2(){
		Punto punto3 = new Punto (-2,-3);
		Punto punto4 = new Punto (-3,-4);
		
		Segmento segmento2 = new Segmento (punto3,punto4);
		
		double distanciaEsperada = Math.round(segmento2.distancia());
		double distanciaObtenida = Math.round(1.4142);
	}
	
	@Test
	void testPositivoYNegativo() {
		Punto punto5 = new Punto (5,3);
		Punto punto6 = new Punto (-3,-4);
		
		Segmento segmento3 = new Segmento (punto5, punto6);
		
		double distanciaEsperada = Math.round(segmento3.distancia());
		double distanciaObtenida = Math.round(10.63);
	}
	
	@Test
	void testPuntosIguales()  throws IllegalArgumentException{
		Punto punto7 = new Punto (2,3);
		Punto punto8 = new Punto (2,3);
		
		Segmento segmento4 = new Segmento (punto7, punto8);
		Exception excepcion = assertThrows(IllegalArgumentException.class, () ->
		segmento4.distancia());
		String mensajeEsperado = "Los puntos no pueden ser iguales";
		String mensajeObtenido = excepcion.getMessage();
		
		assertEquals(mensajeEsperado,mensajeObtenido);
		
	}

}
