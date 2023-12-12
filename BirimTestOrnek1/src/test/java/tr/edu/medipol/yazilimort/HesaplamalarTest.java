package tr.edu.medipol.yazilimort;

import static org.junit.Assert.*;

import org.junit.Test; 

import org.junit.Test;

public class HesaplamalarTest {

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

}
