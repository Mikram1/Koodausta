package harkka;
// Generated by ComTest BEGIN
import static org.junit.Assert.*;
import org.junit.*;
// Generated by ComTest END

/**
 * Test class made by ComTest
 * @version 2016.04.06 17:31:41 // Generated by ComTest
 *
 */
public class OhjeTest {



  // Generated by ComTest BEGIN
  /** testRekisteroi54 */
  @Test
  public void testRekisteroi54() {    // Ohje: 54
    Ohje o1 = new Ohje(); 		Ohje o2 = new Ohje(); 
    o1.rekisteroi(); 				o2.rekisteroi(); 
    assertEquals("From: Ohje line: 57", 1, o1.getOhjeid()); 
    assertEquals("From: Ohje line: 58", 2, o2.getOhjeid()); 
  } // Generated by ComTest END
}