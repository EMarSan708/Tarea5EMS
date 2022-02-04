package Tarea6EMS;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	Calculadora calculate = new Calculadora();
    int[] array = new int[10];
    int[] array2 = new int[10];
    
    
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("---Inicio de las pruebas---");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("---Final de las pruebas---");
	}

	@Test
	void testCalculadora() {
		System.out.println("Casos de prueba de todos los métodos");
		assertEquals(8, calculate.suma(3, 5));
		assertEquals(-2, calculate.resta(3, 5));
		assertEquals(15, calculate.multiplica(3, 5));
		assertEquals(3, calculate.divide(15, 5));
	}

	@Test
	void testSuma() {
		System.out.println("Casos de prueba del método suma");
		assertEquals(2, calculate.suma(1, 1));
		assertNotEquals(3, calculate.suma(1, 1));
	}

	@Test
	public void testDivision() {
		System.out.println("Casos de prueba del método división");
		try {
			assertEquals(0, calculate.divide(15, 0));
		} catch (Exception e) {
			System.out.println("División por 0 producida");
		}
	}
	@Test
	void testResta() {
		System.out.println("Casos de prueba del método resta");
		for (int i = 0; i < array.length; i++) {
			array[i]= (int) (Math.random()*10 + 1);
			array2[i]= (int) (Math.random()*10 + 11);
		}	

		
	}
	@Test
	void testMultiplicacion() {
		System.out.println("Casos de prueba del método suma");
		for (int i = 0; i < array.length; i++) {
			array[i]= (int) (Math.random()*10 + 1);
			array2[i]= (int) (Math.random()*10 + 11);
		}	
		for (int i = 0; i < array.length; i++) {
			assertEquals(array[i]*array2[i], calculate.multiplica(array[i], array2[i]));
		}
	}
}
