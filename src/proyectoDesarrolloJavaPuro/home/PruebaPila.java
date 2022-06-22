package proyectoDesarrolloJavaPuro.home;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class PruebaPila {

	public static void main(String[] args) {
		Stack<Long> pilaLong = new Stack<>();
		
		List<Long> listaLongs = Arrays.asList(3L, 2L);
		pilaLong.push(3L);
		pilaLong.push(2L);
		pilaLong.push(1L);
		
//		
//		while (!pilaLong.isEmpty()) {
//			System.out.println(pilaLong.peek());
//		}
		
		System.out.println(pilaLong.remove(0));
		
	}
}
