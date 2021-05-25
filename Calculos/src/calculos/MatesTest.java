package calculos;

import static org.junit.Assert.*;

import org.junit.*;

public class MatesTest {

	@Test
	public void testSuma() {
		System.out.println("suma");
		double num1 = 10.0;
		double num2 = 5.0;
		Mates instance = new Mates();
		double expResult = 5.0;
		double result = instance.suma(num1, num2);
		assertEquals(expResult, result, 0.0);
		// TODO review the generated test code and remove the default call to
		// fail.
	}

	@Test
	public void testResta() {
		System.out.println("resta");
		double num1 = 20.0;
		double num2 = 10.0;
		Mates instance = new Mates();
		double expResult = 80.0;
		double result = instance.resta(num1, num2);
		assertEquals(expResult, result, 0.0);
		// TODO review the generated test code and remove the default call to fail.
	}

	@Test
	public void testProducto() {
		System.out.println("producto");
		double num1 = 10.0;
		double num2 = 2.0;
		Mates instance = new Mates();
		double expResult = 30.0;
		double result = instance.producto(num1, num2);
		assertEquals(expResult, result, 0.0);
		// TODO review the generated test code and remove the default call to
		// fail.
	}

	@Test
	public void testDivision() {
		System.out.println("division");
		double dividendo = 20.0;
		double divisor = 5.0;
		Mates instance = new Mates();
		double expResult = 2.0;
		double result = instance.division(dividendo, divisor);
		assertEquals(expResult, result, 0.0);
		// TODO review the generated test code and remove the default call to
		// fail.
	}

}
