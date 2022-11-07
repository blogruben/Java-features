package TestearConjuntoDeDatos;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;

class VariosTest {

	@Test
	void testUno() {
		assertEquals(4, 1 + 3);
	}

	@Test
	void testDos() {
	}

	@Test
	@Disabled
	void testTres() {
		assertEquals(2, 1, "2 is not equal to 1");
	}

	@Test
	@Tag("slow")
	void testQueSeEjecutaDespacio() throws InterruptedException {
		Thread.sleep(1000);
	}
	
	@Test
	@DisplayName("1 + 2 = 3f")
	void otroTest() {
		assertEquals(3, 1 + 2);
	}

}
