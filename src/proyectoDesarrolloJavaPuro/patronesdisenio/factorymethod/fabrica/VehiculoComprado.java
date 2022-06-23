package proyectoDesarrolloJavaPuro.patronesdisenio.factorymethod.fabrica;

import proyectoDesarrolloJavaPuro.patronesdisenio.factorymethod.interfaces.Vehiculo;

/**
 * 
 * Clase que trabaja como la fabrica de vehiculos
 * @author Dizzi Tren
 *
 */
public abstract class VehiculoComprado {

	public void acelerarVehiculo() {
		
		Vehiculo vehiculo = crearVehiculo();
		
		vehiculo.acelerar();
	}
	
	public void obtenerInformacionVehiculo() {
		
		Vehiculo vehiculo = crearVehiculo();
		
		vehiculo.obtenerInformacionVehiculo();
	}
	
	
	public abstract Vehiculo crearVehiculo();
}
