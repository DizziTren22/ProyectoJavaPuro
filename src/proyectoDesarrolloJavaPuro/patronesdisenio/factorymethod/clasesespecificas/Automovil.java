package proyectoDesarrolloJavaPuro.patronesdisenio.factorymethod.clasesespecificas;

import proyectoDesarrolloJavaPuro.patronesdisenio.factorymethod.interfaces.Vehiculo;

public class Automovil implements Vehiculo {

	@Override
	public void acelerar() {
		System.out.println("Acelera el automovil");
	}

	@Override
	public void frenar() {
		System.out.println("Frena el automovil");
	}

	@Override
	public void obtenerInformacionVehiculo() {
		System.out.println("COLOR AUTOMOVIL: VERDE");
	}
}
