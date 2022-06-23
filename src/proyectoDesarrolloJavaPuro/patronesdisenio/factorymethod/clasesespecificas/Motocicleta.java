package proyectoDesarrolloJavaPuro.patronesdisenio.factorymethod.clasesespecificas;

import proyectoDesarrolloJavaPuro.patronesdisenio.factorymethod.interfaces.Vehiculo;

public class Motocicleta implements Vehiculo {

	@Override
	public void acelerar() {
		System.out.println("Acelera la motocicleta");
	}

	@Override
	public void frenar() {
		System.out.println("Frena la motocicleta");
	}

	@Override
	public void obtenerInformacionVehiculo() {
		System.out.println("COLOR MOTOCICLETA: AZUL");
	}

}
