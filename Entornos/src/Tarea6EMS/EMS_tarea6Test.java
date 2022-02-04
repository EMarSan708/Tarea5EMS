package Tarea6EMS;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EMS_tarea6Test {
	;

	@Test
	void testEj1() {
		System.out.println("Casos de prueba del método Ej1");
		assertEquals(4, EMS_tarea6.ej1(0,4,3));
		assertEquals(4, EMS_tarea6.ej1(3,4,3));
		assertEquals(4, EMS_tarea6.ej1(3,6,3));
		assertEquals(6, EMS_tarea6.ej1(3,6,1));
	}

	@Test
	void testEj2() {
		System.out.println("Casos de prueba del método Ej2");
		assertEquals(4, EMS_tarea6.ej2(0,4,3));
		assertEquals(6, EMS_tarea6.ej2(3,4,3));
		assertEquals(6, EMS_tarea6.ej2(3,6,3));
		assertEquals(6, EMS_tarea6.ej2(3,6,1));

	}

	@Test
	void testEj5() {
		System.out.println("Casos de prueba del método Ej5");
		assertEquals(0, EMS_tarea6.ej5(0,0));
		assertEquals(1, EMS_tarea6.ej5(5,4));
		assertEquals(1, EMS_tarea6.ej5(4,5));
	}

	@Test
	void testEj6() {
		System.out.println("Casos de prueba del método Ej6");
		assertEquals(-1, EMS_tarea6.ej6(0,3,3));
		assertEquals(1, EMS_tarea6.ej6(3,2,5));
		assertEquals(0, EMS_tarea6.ej6(1,2,5));
		assertEquals(0, EMS_tarea6.ej6(6,2,5));
	}

	@Test
	void testEj8() {
		System.out.println("Casos de prueba del método Ej8");
		assertEquals(0, EMS_tarea6.ej8(3,-1));
		assertEquals(1, EMS_tarea6.ej8(2,0));
		assertEquals(2, EMS_tarea6.ej8(3,5));

	}

}
