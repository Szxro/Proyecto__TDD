package testing;

public class Vaso {
	
	public Vaso(int cantidadVasos, int contenido) {
		this.cantidadVasos = cantidadVasos;
		this.contenido = contenido;
	}

	int cantidadVasos;
	int contenido;
	
	public void setCantidadVasos(int cantidadVasos) {
		this.cantidadVasos = cantidadVasos;
	}
	
	public int getCantidadVasos() {
		return cantidadVasos;
	}
	
	public void setContenido(int contenido) {
		this.contenido = contenido;
	}
	
	public int getContenido() {
		return contenido;
	}
	
	public String hasVasos(int cantidadVasos) {
		
		if (cantidadVasos <= this.cantidadVasos) {
			
			return "Hay vasos";
			
		} else {
			return "No hay vasos";
		}
	}
	
	public void giveVasos(int cantidadVasos) {
		
		this.cantidadVasos -= cantidadVasos;
	}
}
