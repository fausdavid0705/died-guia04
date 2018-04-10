package died.guia04.ejercicio02;

public class Temperatura {

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
	String temp=null;
	switch (this.escala) {
	case CELCIUS:
	temp= String.valueOf(this.grados)+" "+"C°";
	break;
	case FAHRENHEIT:
		temp= String.valueOf(this.grados)+" "+"F°";
	}
	return temp;
}

public double asCelcius() {
	double aux = 0;
	switch(this.escala) {
	case CELCIUS:
		aux = this.grados;
	break;
	case FAHRENHEIT:
		aux = (this.grados-32)/1.8;
	}
	return aux;
}

public double asFahrenheit() {
	double aux = 0;
	switch(this.escala) {
	case FAHRENHEIT:
		aux = this.grados;
		break;
	case CELCIUS:
		aux = this.grados*1.8+32;
	}
	return aux;
}


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

public void aumentar(Temperatura temperatura) {
	if (temperatura.grados>0) {
		switch(this.escala) {
		case CELCIUS:
			if(temperatura.escala==Escala.CELCIUS) {
				this.grados=this.grados+temperatura.grados;
			}
			if(temperatura.escala==Escala.FAHRENHEIT) {
				this.grados=this.grados+temperatura.asCelcius();
			}
			break;
		case FAHRENHEIT:
			if(temperatura.escala==Escala.FAHRENHEIT) {
				this.grados=this.grados+temperatura.grados;
			}
			if(temperatura.escala==Escala.CELCIUS) {
				this.grados=this.grados+temperatura.asFahrenheit();
			}
				
			}
	}
}


public void disminuir(Temperatura temperatura) {
	if (temperatura.grados>0) {
		switch(this.escala) {
		case CELCIUS:
			if(temperatura.escala==Escala.CELCIUS) {
				this.grados=this.grados-temperatura.grados;
			}
			if(temperatura.escala==Escala.FAHRENHEIT) {
				this.grados=this.grados-temperatura.asCelcius();
			}
			break;
		case FAHRENHEIT:
			if(temperatura.escala==Escala.FAHRENHEIT) {
				this.grados=this.grados-temperatura.grados;
			}
			if(temperatura.escala==Escala.CELCIUS) {
				this.grados=this.grados-temperatura.asFahrenheit();
			}
				
			}
	}
}

public Temperatura maxTemp(Temperatura temperatura){
	Temperatura aux = null;
	switch(this.escala) {
	case CELCIUS:
		if(temperatura.escala==Escala.CELCIUS) {
			if(this.grados>temperatura.grados) {
				aux=this;
			}
			else {
				aux=temperatura;
			}
		}
		if(temperatura.escala==Escala.FAHRENHEIT) {
			if(this.grados>temperatura.asCelcius()) {
				aux=this;
		}
			else {
				aux= temperatura;
			}
		}
		break;
	case FAHRENHEIT:
		if(temperatura.escala==Escala.CELCIUS) {
			if(this.grados>temperatura.asCelcius()) {
				aux= this;
			}
			else {
				aux= temperatura;
			}
		}
		if(temperatura.escala==Escala.FAHRENHEIT) {
			if(this.grados>temperatura.grados) {
				aux= this;
		}
			else {
				aux=temperatura;
			}
		}
			
		}
	return aux;
	}

}
