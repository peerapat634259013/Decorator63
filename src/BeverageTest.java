import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BeverageTest {

	@Test
	void testEspressoSoyMilk() {
		Beverage b1 = new Expresso();
		b1 = new Soy(b1);
		b1 = new StreamedMilk(b1);
		assertEquals("Espresso, Soy, Streamed Milk",b1.getDescription());
		assertEquals(2.24,b1.cost());
	}
	@Test
	void testHouse_Blend_Coffee() {
		Beverage b2 = new HouseBlend();
		b2 = new Whip(b2);
		b2 = new Soy(b2);
		assertEquals("House Blend Coffee, Whip, Soy",b2.getDescription());
		assertEquals(1.14,b2.cost());
 }
}
