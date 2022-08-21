package testing;

public class MaquinaDeCafe {

	Cafetera cafe;
	Vaso vasosPequenos;
	Vaso vasosMedianos;
	Vaso vasosGrandes;
	Azucarero azucar;
	
	public Cafetera getCafe() {
		return cafe;
	}

	public void setCafe(Cafetera cafe) {
		this.cafe = cafe;
	}

	public Vaso getVasosPequenos() {
		return vasosPequenos;
	}

	public void setVasosPequenos(Vaso vasosPequenos) {
		this.vasosPequenos = vasosPequenos;
	}

	public Vaso getVasosMedianos() {
		return vasosMedianos;
	}

	public void setVasosMedianos(Vaso vasosMedianos) {
		this.vasosMedianos = vasosMedianos;
	}

	public Vaso getVasosGrandes() {
		return vasosGrandes;
	}

	public void setVasosGrandes(Vaso vasosGrandes) {
		this.vasosGrandes = vasosGrandes;
	}

	public Azucarero getAzucar() {
		return azucar;
	}

	public void setAzucar(Azucarero azucar) {
		this.azucar = azucar;
	}

	public Vaso getTipoVaso(String tipoVaso) {
		
		switch(tipoVaso) {
			
			case "pequeno":
				
				return getVasosPequenos();
			
			case "mediano":
				
				return getVasosMedianos();
				
			case "grande":
				
				return getVasosGrandes();	
				
			default:
				return null;
		}
	}
	
	public String getVasoDeCafe(Vaso vaso, int cantidadDeVasos, int cantidadDeAzucar) {
		
		if (vaso.hasVasos(cantidadDeVasos).equals("Hay vasos") && azucar.hasAzucar(cantidadDeAzucar).equals("Hay azucar") && cafe.hasCafe(10).equals("Hay cafe")) {
			
			vaso.giveVasos(cantidadDeVasos);
			azucar.giveAzucar(cantidadDeAzucar);
			cafe.giveCafe(10);
			
			return "Felicitaciones";
			
		} else if(!vaso.hasVasos(cantidadDeVasos).equals("Hay vasos")) {
			
			return vaso.hasVasos(cantidadDeVasos);
			
		} else if(!azucar.hasAzucar(cantidadDeAzucar).equals("Hay azucar")) {
			
			return azucar.hasAzucar(cantidadDeAzucar);
			
		} else if(!cafe.hasCafe(10).equals("Hay cafe")) {
			
			return cafe.hasCafe(10);	
		}
		
		else {
			return "No hay na!";
		}
		
	}
}
