package pony;

import org.junit.Assert;
import org.junit.Test;

public class PonyTest {

	@Test
	public void test() {
		PonyExpress pony = new PonyExpress();
		
		Assert.assertEquals(1, pony.caballos(new int[] { 18, 15 }));
		Assert.assertEquals(2, pony.caballos(new int[] { 43, 23, 40, 13 }));
		Assert.assertEquals(3, pony.caballos(new int[] { 33, 8, 16, 47, 30, 30, 46 }));
		Assert.assertEquals(3, pony.caballos(new int[] { 51, 51, 51 }));
		Assert.assertEquals(4, pony.caballos(new int[] { 13, 88, 16, 85}));
		Assert.assertEquals(4, pony.caballos(new int[] { 13, 88, 16, 85, 0}));
		Assert.assertEquals(4, pony.caballos(new int[] { 6, 24, 6, 8, 28, 8, 23, 47, 17, 29, 37, 18, 40, 49 }));
		
	}

}
