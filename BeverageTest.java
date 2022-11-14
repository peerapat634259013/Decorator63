import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BeverageTest {

	@Test
	void testEspressoSoyMilk() {
		Beverage b1 = new Expresso();
		b1 = new Soy(b1);
		b1 = new StreamedMilk(b1);
		assertEquals("Espresso, Soy, StreamedMilk",b1.getDescription());
		assertEquals(2.24,b1.cost());
	}
	@Test
	void testHouseBlendmilk() {
		Beverage b2 = new HouseBlend();
		b2 = new whip(b2);
		b2 = new Soy(b2);
		assertEquals("HouseBlend, whip, Soy",b2.getDescription());
		assertEquals(1.14,b2.cost());
 }
}
