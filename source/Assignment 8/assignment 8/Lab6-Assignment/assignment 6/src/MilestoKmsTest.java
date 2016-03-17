import static org.junit.Assert.*;
import java.text.DecimalFormat;

import org.junit.Test;

public class MilestoKmsTest {
	
	MilestoKms h = new MilestoKms();
	Double kms = h.convertMtoK(1.0);
	
	Double testConversion = 0.546;
	
	@Test
	public void test() {
		
		System.out.println("@Test conversion(): " + kms + " = " + testConversion);
		assertEquals(testConversion, kms);
		
	}
}