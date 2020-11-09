
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class firstTest {
	
	

		secondTest newClass = new secondTest();
		
		
		
		@Test
		public void testMinLong() {
			assertEquals(4, newClass.returnLowestLong(4, 9));
		}
		
		@Test
		public void testMinFloat() {
			Assert.assertEquals(4.8f, newClass.returnLowestFloat(4.8f, 44.6f), 0);
		}
		
		@Test
		public void testMinInt() {
			Assert.assertEquals(4, newClass.returnLowestInt(4, 10));
		}
		
		@Test
		public void testMinDouble() {
			Assert.assertEquals(4.4, newClass.returnLowestDouble(4.4, 7.7), 0);
		}
		
		@Test
		public void testMaxInt() {
			Assert.assertEquals(999, newClass.returnMaxInt(44, 999));
		}
		
		@Test
		public void testMaxDouble() {
			Assert.assertEquals(9.9, newClass.returnMaxDouble(3.3, 9.9), 0);
		}
		
		@Test
		public void testMaxLong() {
			Assert.assertEquals(99999, newClass.returnMaxLong(99999, 333));
		}
		
		@Test
		public void testPow() {
			Assert.assertEquals(36, newClass.returnPow(6.0 , 2.0), 0);
		}
		
		@Test
		public void testPlusOneInt() {
			Assert.assertEquals(9, newClass.returnPlusOneInt(8));
		}
		
		@Test
		public void testPlusOneLong() {
			Assert.assertEquals(8, newClass.returnPlusOneLong(7));
		}
		
		@Test
		public void testMinOneInt() {
			Assert.assertEquals(6, newClass.returnMinOneInt(7));
		}
		
		@Test
		public void testMinOneLong() {
			Assert.assertEquals(98, newClass.returnMinOneLong(99));
		}
		
		@Test
		public void testSquareRootDouble() {
			Assert.assertEquals(6, newClass.returnSquareRootDouble(36.0), 0);
		}
		@Test
		public void testCubeRootDouble() {
			Assert.assertEquals(2, newClass.returnCubeRootDouble(8.0), 0);
		}
		@Test
		public void testRandomDouble() {
			// test random returns a number from 0 to 1(exclusively) range is 0-1 and 0,5 is the middle and the last 0.5 is +/-
			Assert.assertEquals(0.5, newClass.returnRandomDouble(), 0.5);
		}
		
		
	}
