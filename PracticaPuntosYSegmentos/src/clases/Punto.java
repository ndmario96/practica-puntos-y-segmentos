package clases;

/**
 * Clase que sirve para crear puntos, recibe dos párametros, representados mediante x e y. 
 * 
 */

public class Punto {

	private int x;
	private int y;
	
	/**
	 * Crea dos puntos con las coordenadas 0,0
	 * 
	 * Las coordenadas son tipo int 
	 */
	public Punto () {
		this.x = 0;
		this.y = 0;
	}
	
	/**
	 * Constructor para crear puntos 
	 * 
	 * @param x  recibe el punto "x", de tipo int
	 * @param y recibe el punto "y", de tipo int 
	 */
	
	public Punto (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setX(int nuevaX) {
		this.x = nuevaX;
	}
	
	public void setY(int nuevaY) {
		this.y = nuevaY;
	}
	
	@Override
	public String toString() {
		String mensaje = "";
		
		mensaje += "(" + this.x + "," + this.y + ")";
		
		return mensaje;
	}
	
	
}
