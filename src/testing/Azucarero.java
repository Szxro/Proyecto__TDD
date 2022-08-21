package testing;

public class Azucarero {
	
	public Azucarero(int cantidadAzucar) {
		this.cantidadAzucar = cantidadAzucar;
	}

	int cantidadAzucar;

	public int getCantidadAzucar() {
		return cantidadAzucar;
	}

	public void setCantidadAzucar(int cantidadAzucar) {
		this.cantidadAzucar = cantidadAzucar;
	}
	
	public String hasAzucar(int cantidadAzucar) {
		
		if (cantidadAzucar <= this.cantidadAzucar) {
			
			return "Hay azucar";
		} else {
			
			return "No hay azucar";
		}
	}
	
	public void giveAzucar(int cantidadAzucar) {
		this.cantidadAzucar -= cantidadAzucar;
	}
}
