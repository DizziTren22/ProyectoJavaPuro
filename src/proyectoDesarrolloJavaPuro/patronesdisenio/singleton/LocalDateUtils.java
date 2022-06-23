package proyectoDesarrolloJavaPuro.patronesdisenio.singleton;

import java.time.LocalDate;

public final class LocalDateUtils {

	private static LocalDateUtils localDateUtils;
	
	private LocalDateUtils() {
		//No se implementa
	}
	
	public static LocalDateUtils getInstance() {
		
		if (localDateUtils == null) {
			localDateUtils = new LocalDateUtils();
		}
		
		return localDateUtils;
	}
	
	public String convertLocalDateToString(LocalDate fecha) {
		
		return fecha.toString();
	}
}
