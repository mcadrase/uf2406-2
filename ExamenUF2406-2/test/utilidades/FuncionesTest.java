package utilidades;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FuncionesTest {
	
	private static Funciones func;
	
	@BeforeAll
	static void inicializarFunciones() {
		func = new Funciones();
	}

	@Test
	void devuelveCentral() {
		assertEquals(5, func.devuelveCentral(1, 5, 9));
		assertEquals(5, func.devuelveCentral(9, 5, 1));
		assertEquals(5, func.devuelveCentral(5, 1, 9));
		assertEquals(5, func.devuelveCentral(5, 9, 1));
		assertEquals(2, func.devuelveCentral(2, 9, 1));
		assertEquals(4, func.devuelveCentral(5, 2, 4));
	}
	
	@Test
	void esBisiesto() {
		assertThrows(ArithmeticException.class, ()->func.esBisiesto(1600));
		assertThrows(ArithmeticException.class, ()->func.esBisiesto(2600));
		assertEquals(true, func.esBisiesto(2024));
		assertEquals(true, func.esBisiesto(1804));
		assertEquals(true, func.esBisiesto(2000));
		assertEquals(false, func.esBisiesto(2200));
		assertEquals(true, func.esBisiesto(2400));
		assertEquals(false, func.esBisiesto(1803));
	}

}
