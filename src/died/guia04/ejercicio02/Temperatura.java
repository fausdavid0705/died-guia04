package died.guia04.ejercicio02;

public class Temperatura {
	
public double getGrados() {
		return grados;
	}


	public void setGrados(double grados) {
		this.grados = grados;
	}


	public Escala getEscala() {
		return escala;
	}


	public void setEscala(Escala escala) {
		this.escala = escala;
	}

public double grados;
public Escala escala;


public Temperatura() {
this.grados=0;
this.escala=Escala.CELCIUS;
}


public Temperatura(double grados, Escala escala) {
this.grados=grados;
this.escala=escala;
}

public String toString() {
	String temp;
	temp= String.valueOf(this.grados)+String.valueOf(this.escala);
	return temp;
}

public double asCelcius() {
	if(this.escala==Escala.CELCIUS)
		return this.grados;
	else
		return (this.grados-32)/1.8;
}

public double asFahrenheit() {
	if(this.escala==Escala.FAHRENHEIT)
		return this.grados;
	else
		return this.grados*1.8+32;
}

public void aumentar(Temperatura temperatura) {
	Escala E1=this.getEscala();
	Escala E2=temperatura.getEscala();
	if (temperatura.grados>0) {
		if(E1==escala.CELCIUS && E2==escala.CELCIUS) {
			this.grados=this.grados+temperatura.grados;
		}
		if(E1==escala.FAHRENHEIT && E2==escala.FAHRENHEIT) {
			this.grados=this.grados+temperatura.grados;
		}
		if(E1==escala.FAHRENHEIT && E2==escala.CELCIUS) {
			this.grados=this.grados+temperatura.asFahrenheit();
		}
		if(E1==escala.CELCIUS && E2==escala.FAHRENHEIT) {
			this.grados=this.grados+temperatura.asCelcius();
		}
	}
}

public void disminuir(Temperatura temperatura) {
	Escala E1=this.getEscala();
	Escala E2=temperatura.getEscala();
	if (temperatura.grados>0) {
		if(E1==escala.CELCIUS && E2==escala.CELCIUS) {
			this.grados=this.grados-temperatura.grados;
		}
		if(E1==escala.FAHRENHEIT && E2==escala.FAHRENHEIT) {
			this.grados=this.grados-temperatura.grados;
		}
		if(E1==escala.FAHRENHEIT && E2==escala.CELCIUS) {
			this.grados=this.grados-temperatura.asFahrenheit();
		}
		if(E1==escala.CELCIUS && E2==escala.FAHRENHEIT) {
			this.grados=this.grados-temperatura.asCelcius();
		}
	}
}

}