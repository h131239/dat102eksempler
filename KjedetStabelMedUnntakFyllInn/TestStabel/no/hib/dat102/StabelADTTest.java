package no.hib.dat102;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import no.hib.dat102.KjedetStabel;
import no.hib.dat102.adt.StabelADT;

/**
 * Test for StabelADT.
 * 
 * @author Ole Olsen
 */
public class StabelADTTest {

	// Referanse til stabel
	private StabelADT<Integer> stabel;

	// Testdata
	private Integer e0 = 1;
	private Integer e1 = 2;
	private Integer e2 = 3;
	private Integer e3 = 4;
	private Integer e4 = 5;

	/**
	 * Hent en ny stabel for hver test.
	 */
	@Before
	public final void setup() {
		stabel = new KjedetStabel<Integer>();
	}

	/**
	 * Test p� at en ny stabel er tom.
	 */
	@Test
	public final void nyStabelErTom() {
		assertTrue(stabel.erTom());
	}

	/**
	 * Test p� push and pop.
	 */
	@Test
	public final void pushOgPop() {

		//Fyll inn

		try {
			 //Fyll ut
		} catch (EmptyCollectionException e) {
			fail("pop feilet uventet " + e.getMessage());
		}
	}

	/**
	 * Test p� push og pop med duplikate verdier.
	 */
	@Test
	public final void pushOgPopMedDuplikater() {

		//Fyll inn

		try {
			
			//Fyll inn
			
		} catch (EmptyCollectionException e) {
			fail("pop feilet uventet " + e.getMessage());
		}
	}

	/**
	 * Testing p� peek.
	 */
	@Test
	public final void pushPopPushPushPopPeek() {
		try {
			
			//Fyll inn

		} catch (EmptyCollectionException e) {
			fail("pop eller peek feilet uventet " + e.getMessage());
		}
	}

	/**
	 * Test p� at en stabel med noen elementer ikke er tom.
	 */
	@Test
	public final void erIkkeTom() {
		stabel.push(e0);
		stabel.push(e1);
		assertFalse(stabel.erTom());
	}

	/**
	 * Test p� at en stabel med null elementer er tom.
	 */
	@Test
	public final void pushPopErTom() {
		try {
			stabel.push(e0);
			stabel.pop();
			assertTrue(stabel.erTom());

		} catch (EmptyCollectionException e) {
			fail("push eller pop feilet uventet " + e.getMessage());
		}
	}

	/**
	 * Test p� st�rrelsen
	 */
	@Test
	public final void stor() {
		stabel.push(e0);
		stabel.push(e1);
		stabel.push(e2);
		assertEquals(3, stabel.antall());
	}

	/**
	 * Fors�k p� pop av en tom stabel skal gi "underflow excepton" *
	 * 
	 * @throws EmptyCollectionException
	 *             expected exception
	 */
	@Test(expected = EmptyCollectionException.class)
	public final void popFromEmptyIsUnderflowed()
			throws EmptyCollectionException {
		stabel.pop();
	}

}
