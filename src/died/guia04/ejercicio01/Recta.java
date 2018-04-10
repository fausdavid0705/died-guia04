package died.guia04.ejercicio01;

public class Recta {
	Punto p1;
	Punto p2;
	
	public Punto getP1() {
		return p1;
	}

	public void setP1(Punto p1) {
		this.p1 = p1;
	}

	public Punto getP2() {
		return p2;
	}

	public void setP2(Punto p2) {
		this.p2 = p2;
	}

	public Recta(Punto p1, Punto p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public Recta() {
		this.p1.x=this.p1.y;
		this.p2.x=this.p2.y;
	}
	
	public float pendiente() {
		float m;
		float deltax=(p2.getX()-p1.getX());
		float deltay=(p2.getY()-p1.getY());
		if (deltax != 0) {
		m=(deltay/deltax);
		return m;
		}
		else {
		return 0;
		}
	
	}
	
	public boolean paralelas(Recta otraRecta) {
		return pendiente()==otraRecta.pendiente();
	}
	
	public boolean equals(Recta otraRecta){
		Recta aux = new Recta(p2,otraRecta.p1);
		return (aux.paralelas(this) && aux.paralelas(otraRecta));
	}
	
}
