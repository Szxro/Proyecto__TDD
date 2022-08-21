package testing;

public class Cafetera {

	public Cafetera(int cantidadCafe) {
		this.cantidadCafe = cantidadCafe;
	}
	
	int cantidadCafe;

	public int getCantidadCafe() {
		return cantidadCafe;
	}

	public void setCantidadCafe(int cantidadCafe) {
		this.cantidadCafe = cantidadCafe;
	}
	
	public String hasCafe(int cantidadCafe) {
		
		if (cantidadCafe <= this.cantidadCafe) {
			
			return "Hay cafe";
			
		} else {
			
			return "No hay cafe";
		}
	}
	
	public void giveCafe(int cantidadCafe) {
		this.cantidadCafe -= cantidadCafe;
	}
}
