package proyectoDesarrolloJavaPuro.patronesdisenio.factorymethod.fabrica;

import proyectoDesarrolloJavaPuro.patronesdisenio.factorymethod.clasesespecificas.Automovil;
import proyectoDesarrolloJavaPuro.patronesdisenio.factorymethod.interfaces.Vehiculo;

public class CreacionAutomovil extends VehiculoComprado {

	@Override
	public Vehiculo crearVehiculo() {
		return new Automovil();
	}
}
