package ar.edu.unlp.info.oo1.ejercicio8_method_lookup;

public class Gerente extends EmpleadoJerarquico {

	public double aportes() {
		return this.montoBasico() * 0.05;
	}
	
	public double montoBasico() {
		return 57000;
	}
}
