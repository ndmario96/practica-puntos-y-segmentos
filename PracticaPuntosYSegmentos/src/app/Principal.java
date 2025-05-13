package app;

import clases.Punto;
import clases.Segmento;


public class Principal {
	public static void main(String[] args) {
		//Crea 4 puntos con numeros aleatorios entre 0 y 10. 
		
		Punto p1 = new Punto(1 + (int)(Math.random()* 10 - 0 + 1),1+ (int)(Math.random()* 10 - 0 + 1));
		Punto p2 = new Punto(1 + (int)(Math.random()* 10 - 0 + 1),1+ (int)(Math.random()* 10 - 0 + 1));
		Punto p3 = new Punto(1 + (int)(Math.random()* 10 - 0 + 1),1+ (int)(Math.random()* 10 - 0 + 1));
		Punto p4 = new Punto(1 + (int)(Math.random()* 10 - 0 + 1),1+ (int)(Math.random()* 10 - 0 + 1));
		
		//Crea dos segmentos con los puntos creados anteriormente 
		Segmento s1 = new Segmento (p1,p2);
		Segmento s2 = new Segmento (p3,p4);
		//Calcula para ambos segmentos la distancia entre sus puntos	
		double distancia1 = s1.distancia();
		double distancia2 = s2.distancia();
		

	 
	}
	
}
