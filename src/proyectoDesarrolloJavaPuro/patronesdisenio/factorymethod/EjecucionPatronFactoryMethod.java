package proyectoDesarrolloJavaPuro.patronesdisenio.factorymethod;

import proyectoDesarrolloJavaPuro.patronesdisenio.factorymethod.fabrica.CreacionAutomovil;
import proyectoDesarrolloJavaPuro.patronesdisenio.factorymethod.fabrica.CreacionMotocicleta;
import proyectoDesarrolloJavaPuro.patronesdisenio.factorymethod.fabrica.VehiculoComprado;

public class EjecucionPatronFactoryMethod {

	public static void main(String[] args) {
		
		VehiculoComprado vehiculoComprado = comprarVehiculo("automovil");
		
		vehiculoComprado.acelerarVehiculo();
		vehiculoComprado.obtenerInformacionVehiculo();
	}
	
	public static VehiculoComprado comprarVehiculo(String tipoVehiculo) {
		 
		VehiculoComprado vehiculoComprado;
		
		if (tipoVehiculo.equalsIgnoreCase("Automovil")) {
			vehiculoComprado = new CreacionAutomovil();
		} else {
			vehiculoComprado = new CreacionMotocicleta();
		}
		
		return vehiculoComprado;
	}
}
