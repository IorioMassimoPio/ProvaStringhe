package Stringhe.EsercizioStringhe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyStringTest {
	
	private static MyString str;
	
	@BeforeClass
	public static void prepare() {
		str = new MyString();
	}
	
	@Before
	public void pre_test() {
		System.out.println("Sto per effettuare un test");
	}
	
	@After
	public void post_test() {
		System.out.println("Ho finito di fare il test");
	}
	
	@Test
	public void pangrammaWorks() {
		assertTrue(str.pangramma("the quick brown fox jumps over the lazy dog"));
		assertFalse(str.pangramma("pranzo d'acqua fa volti sghembi"));
		assertTrue(str.pangramma("quel vituperabile xenofobo zelante assaggia il whisky ed esclama: alleluja"));
	}
	
	@Test(timeout = 1000)
	public void palindromaWorks() {
		assertTrue(str.palindroma("i topi non avevano nipoti"));
		assertTrue(str.palindroma("anna"));
		assertFalse(str.palindroma("tassone"));
	}
	
	@Test
	public void tokenizzazioneWorks() {
		assertEquals(Arrays.asList("Massimo", "Pio", "Iorio"), str.tokenizzazione("Massimo Pio Iorio"));
	}
	

}
