package died.guia04.ejercicio01;

public class Punto {
	float x;
	float y;
	
	public Punto(float x, float y){
	this.x=x;
	this.y=y;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	public boolean equals(Punto otroPunto) {
		return (this.x==otroPunto.getX()&&this.y==otroPunto.getY());
	}
}
