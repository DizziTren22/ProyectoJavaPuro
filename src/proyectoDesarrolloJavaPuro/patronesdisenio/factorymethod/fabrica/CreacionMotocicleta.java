package proyectoDesarrolloJavaPuro.patronesdisenio.factorymethod.fabrica;

import proyectoDesarrolloJavaPuro.patronesdisenio.factorymethod.clasesespecificas.Motocicleta;
import proyectoDesarrolloJavaPuro.patronesdisenio.factorymethod.interfaces.Vehiculo;

public class CreacionMotocicleta extends VehiculoComprado {

	@Override
	public Vehiculo crearVehiculo() {
		return new Motocicleta();
	}
}
