package ejercicio01;

public class App {

	public static void main(String[] args) {
	Punto P1 = new Punto(1,1);
	Punto P2 = new Punto(2,2);
	Recta R1 = new Recta(P1,P2);
	System.out.print("Pendiente de la recta R1 = "+R1.pendiente());
	System.out.println(" ");
	Punto P3 = new Punto(3,3);
	Recta R2 = new Recta(P2,P3);
	System.out.print("¿R1 y R2 representan la misma recta? "+R1.equals(R2));
	}

}
