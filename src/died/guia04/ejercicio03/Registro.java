
package died.guia04.ejercicio03;
import java.util.Arrays;

import died.guia04.ejercicio02.*;

public class Registro {
	
	public String getCiudad() {
		return ciudad;
	}

	private String ciudad;
	private Temperatura[] historico;
	private int MAX_SIZE=10;
	
	public Registro() {
	this.ciudad="-";
	this.historico = new Temperatura[MAX_SIZE];
	}
	
	public Registro (String ciudad) {
		this.ciudad=ciudad;
		this.historico = new Temperatura[MAX_SIZE];
	}
	
	public void imprimir() {
	System.out.println("TEMPERATURAS REGISTRADAS EN : "+this.ciudad);
	for(int i=0;i<this.MAX_SIZE;i++){
		System.out.println(i+" "+historico[i].toString());
		}
	}
	
	public void agregarTemperatura(Temperatura t) {
		this.historico = agregarTemp(t);
	}
	
	private Temperatura[] agregarTemp(Temperatura t) {
		Temperatura[] aux = new Temperatura[historico.length+1];
		aux[0]=t;
		for(int i=0;i<historico.length;i++) {
			aux[i+1]=historico[i];
		}
		return aux;
	}
	
	public double mediaAsCelcius() {
		double sum=0;
		for (int i=0; i<MAX_SIZE; i++) {
			sum+=historico[i].asCelcius();
		}
		return sum/MAX_SIZE;
	}
	
	public double mediaAsFahrenheit() {
		double sum=0;
		for (int i=0; i<MAX_SIZE; i++) {
			sum+=historico[i].asFahrenheit();
		}
		return sum/MAX_SIZE;
	}
	
	public Temperatura maximo() {
	    return maximo(historico, MAX_SIZE);
	}
	
	private Temperatura maximo(Temperatura[] t,int MAX_SIZE) {
	    if (MAX_SIZE==1)
	    	return t[0];
			return t[MAX_SIZE-1].maxTemp(maximo(t,(MAX_SIZE - 1)));
	}
	
}