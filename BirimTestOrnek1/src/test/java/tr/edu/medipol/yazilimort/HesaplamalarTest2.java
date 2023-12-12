package tr.edu.medipol.yazilimort;

import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplamalarTest2 {

	@Test
	public void TestFaktoriyelRec() {
		int sonuc = Hesaplamalar.faktoriyelRec(5);
		assertEquals(120,sonuc);
	}

	@Test
	public void TestFaktoriyelLoop() {
		int sonuc = Hesaplamalar.faktoriyelLoop(5);
		assertEquals(120,sonuc);
	}

	@Test
	public void testTopla() {
		
	 int return (4,6);
		
	}

	@Test
	public void testCikart() {
		int return (17,9);
	}

	@Test
	public void testCarpma() {
		int return (9,6);
	}

}
