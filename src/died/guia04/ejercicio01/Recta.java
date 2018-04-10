package died.guia04.ejercicio01;

public class Recta {
	Punto p1;
	Punto p2;
	
	public Recta(Punto p1, Punto p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public float pendiente() {
		float m;
		float deno=(p2.getX()-p1.getX());
		if (deno != 0) {
		m=((p2.getX()-p1.getY())/deno);
		return m;
		}
		else {
		return 0;
		}
	
	}
	
	public boolean paralelas(Recta otraRecta) {
		return pendiente()==otraRecta.pendiente();
	}
	
	public boolean equals(Recta otraRecta) {
		Recta aux = new Recta(p1,otraRecta.p1);
		boolean a1 = aux.paralelas(this);
		boolean a2 = aux.paralelas(otraRecta);
		return a1==a2;
	}
	
}
