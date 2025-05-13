package clases;
/**
 * Clase segmento, que une un segmento entre los puntos pasados como parámetros. 
 * 
 */
public class Segmento {

private Punto a;
private Punto b;

/**
 * Constructor que construye un segmento con los parámetros que hemos pasado. 
 * 
 * Los parámetros son de tipo PUNTO
 */
public Segmento() {
	this.a = new Punto(0,0);
	this.b = new Punto (1,1);
}

/**
 * Constructor para Segmentos, que recibe dos parámetros de tipo punto. En caso de que sean iguales, arroja una excepción. 
 * 
 * @param a de tipo Punto
 * @param b de tipo Punto 
 * @throws IllegalArgumentException
 */

public Segmento (Punto a, Punto b) throws IllegalArgumentException {
	if (a.getX() == b.getX() && a.getY() == b.getY()) {
		throw new IllegalArgumentException ("Los puntos no pueden ser iguales");
	}else {
		this.a = a;
		this.b = b;
	}
}

/**
 * Metodo que calcula la distancia entre dos puntos. 
 * 
 * @return la distancia en tipo double 
 */
public double distancia() {
	double distancia ;
	distancia = Math.sqrt(Math.pow(this.b.getX() - this.a.getX(),2) + (Math.pow(this.b.getY() - this.a.getY(),2)));
	return distancia;
}


public Punto getA(){
	return this.a;
}

public Punto getB() {
	return this.b;
}

public void setA(Punto nuevoPunto) {
	this.a = nuevoPunto;
}

public void setB(Punto nuevoPunto) {
	this.b = nuevoPunto;
}

@Override
public String toString() {
	String mensaje = "";
	mensaje+= "[(" + this.a.getX() + "," + this.a.getY() + ")" + ", (" + this.b.getX() + "," + this.b.getY() + ")]";
	
	return mensaje;
}
}
