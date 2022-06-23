package proyectoDesarrolloJavaPuro.patronesdisenio.singleton;

import java.time.LocalDate;

public class EjecucionPatronSingleton {

	public static void main(String[] args) {
		
		LocalDateUtils localDateUtils = LocalDateUtils.getInstance();

		LocalDateUtils localDateUtils2 = LocalDateUtils.getInstance();
		
		System.out.println(localDateUtils.convertLocalDateToString(LocalDate.of(2013, 02, 19)));
		
		System.out.println(localDateUtils2.convertLocalDateToString(LocalDate.of(2014, 02, 19)));
	}
}
